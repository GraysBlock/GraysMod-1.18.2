package graysblock.graysmod;

import graysblock.graysmod.blocks.Blocks;
import graysblock.graysmod.config.GraysModClientConfigs;
import graysblock.graysmod.config.GraysModCommonConfigs;
import graysblock.graysmod.entities.Entities;
import graysblock.graysmod.gui.config.GraysModConfigurationMenu;
import graysblock.graysmod.gui.menu.BlacksmithsTableScreen;
import graysblock.graysmod.gui.menu.MenuTypes;
import graysblock.graysmod.items.Items;
import graysblock.graysmod.recipes.Recipes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ConfigGuiHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.BiFunction;

@Mod(GraysMod.MOD_ID)
public class GraysMod
{
	public static final String NAME = "GraysMod";
	public static final String MOD_ID = "graysmod";
	
	public static final CreativeModeTab GRAYSMOD_TAB = new CreativeModeTab(MOD_ID)
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon()
		{
			return new ItemStack(Items.DIAMONITE.get());
		}
	};
	
	public GraysMod()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		// These register stuff
		Items.ITEMS.register(bus);
		Blocks.BLOCKS.register(bus);
		MenuTypes.MENUS.register(bus);
		Recipes.SERIALIZERS.register(bus);
		Entities.ENTITIES.register(bus);

		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GraysModClientConfigs.SPEC, "graysmod-client.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GraysModCommonConfigs.SPEC, "graysmod-common.toml");

		ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class, () -> new ConfigGuiHandler.ConfigGuiFactory(new BiFunction<Minecraft, Screen, Screen>()
		{
			@Override
			public Screen apply(Minecraft minecraft, Screen screen) {
				return new GraysModConfigurationMenu(screen);
			}
		}));

		MinecraftForge.EVENT_BUS.register(this);
		bus.addListener(this::clientSetup);
		bus.addListener(this::setup);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		MenuScreens.register(MenuTypes.BLACKSMITHS_TABLE_MENU.get(), BlacksmithsTableScreen::new);

		ItemBlockRenderTypes.setRenderLayer(Blocks.YELLOW_TULIP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.YELLOW_TULIP_POTTED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.PURPLE_TULIP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.PURPLE_TULIP_POTTED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.BLACK_TULIP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.BLACK_TULIP_POTTED.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.CYAN_POPPY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Blocks.CYAN_POPPY_POTTED.get(), RenderType.cutout());

	}

	private void setup(final FMLCommonSetupEvent event)
	{
		event.enqueueWork(() ->
		{
			((FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT).addPlant(Blocks.YELLOW_TULIP.getId(), Blocks.YELLOW_TULIP_POTTED);
			((FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT).addPlant(Blocks.PURPLE_TULIP.getId(), Blocks.PURPLE_TULIP_POTTED);
			((FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT).addPlant(Blocks.BLACK_TULIP.getId(), Blocks.BLACK_TULIP_POTTED);
			((FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT).addPlant(Blocks.CYAN_POPPY.getId(), Blocks.CYAN_POPPY_POTTED);
		});
	}
}
