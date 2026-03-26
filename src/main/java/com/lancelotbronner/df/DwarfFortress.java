package com.lancelotbronner.df;

import com.lancelotbronner.df.blocks.DFBlocks;
import com.lancelotbronner.df.components.DFComponents;
import com.lancelotbronner.df.data.Gem;
import com.lancelotbronner.df.data.GemCut;
import com.lancelotbronner.df.data.Metal;
import com.lancelotbronner.df.data.Stone;
import com.lancelotbronner.df.entities.DFEntityTypes;
import com.lancelotbronner.df.items.DFItems;
import com.lancelotbronner.df.registries.DFRegistries;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NewRegistryEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.Map;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(DwarfFortress.MODID)
public class DwarfFortress {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "df";
	// Directly reference a slf4j logger
	public static final Logger LOGGER = LogUtils.getLogger();

	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
	public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(
		MODID);
	public static final DeferredRegister<GemCut> GEM_CUTS = DeferredRegister.create(
		DFRegistries.GEM_CUTS,
		MODID);
	public static final DeferredRegister.DataComponents COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE,
		MODID);
	public static final DeferredRegister<@NotNull CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
		MODID);

	public DwarfFortress(IEventBus bus, ModContainer modContainer) {
		// Register the commonSetup method for modloading
		bus.addListener(this::commonSetup);

		// Register the Deferred Registers to the mod event bus so things get registered
		BLOCKS.register(bus);
		ITEMS.register(bus);
		ENTITY_TYPES.register(bus);
		GEM_CUTS.register(bus);
		COMPONENTS.register(bus);
		CREATIVE_MODE_TABS.register(bus);

		// Register ourselves for server and other game events we are interested in.
		// Note that this is necessary if and only if we want *this* class to respond directly to events.
		// Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
		bus.register(DwarfFortress.class);

		// Register our mod's ModConfigSpec so that FML can create and load the config file for us
		modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

		// Activate the static initializer of our container classes
		DFComponents.register();
		DFBlocks.generate();
		DFItems.register();
		DFEntityTypes.register();
	}

	private void commonSetup(FMLCommonSetupEvent event) {
		// Some common setup code
		LOGGER.info("HELLO FROM COMMON SETUP");

		if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
			LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
		}

		LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

		Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MODID, path);
	}

	public static Identifier id(String first, String[] path) {
		return id(first + "/" + String.join("/", path));
	}

	public static Identifier id(String... path) {
		return id(String.join("/", path));
	}

	@SubscribeEvent
	public static void buildContents(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			for (Stone stone : Stone.values()) {
				event.accept(DFItems.STONE_BLOCKS.get(stone).toStack());
			}
			for (Metal metal : Metal.values()) {
				event.accept(DFItems.BARS.get(metal).toStack());
				event.accept(DFItems.CHAINS.get(metal).toStack());
				event.accept(DFItems.ANVILS.get(metal).toStack());
				event.accept(DFItems.METAL_MECHANISMS.get(metal).toStack());
			}
			for (Gem gem : Gem.values()) {
				event.accept(DFItems.ROUGH_GEMS.get(gem).toStack());
				Map<GemCut, DeferredItem<Item>> cuts = DFItems.CUT_GEMS.get(gem);
				for (GemCut cut : GemCut.values())
					event.accept(cuts.get(cut));
			}
		}
	}

	@SubscribeEvent
	public static void registerRegistries(NewRegistryEvent event) {
		event.register(DFRegistries.GEM_CUTS);
	}
}
