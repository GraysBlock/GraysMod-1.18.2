package graysblock.graysmod;

import graysblock.graysmod.blocks.Blocks;
import graysblock.graysmod.entities.Entities;
import graysblock.graysmod.gui.menu.BlacksmithsTableScreen;
import graysblock.graysmod.gui.menu.MenuTypes;
import graysblock.graysmod.items.Items;
import graysblock.graysmod.recipes.Recipes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GraysMod.MOD_ID)
public class GraysMod
{
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

		// This registers stuff
		Items.ITEMS.register(bus);
		Blocks.BLOCKS.register(bus);
		MenuTypes.MENUS.register(bus);
		Recipes.SERIALIZERS.register(bus);
		Entities.ENTITIES.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		bus.addListener(this::clientSetup);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		MenuScreens.register(MenuTypes.BLACKSMITHS_TABLE_MENU.get(), BlacksmithsTableScreen::new);
	}
}
