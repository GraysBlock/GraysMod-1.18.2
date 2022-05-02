package graysblock.graysmod.misc;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.entities.Entities;
import graysblock.graysmod.recipes.BlacksmithsTableRecipe;
import graysblock.graysmod.util.model.IdiumSpearModel;
import graysblock.graysmod.util.renderer.IdiumSpearRenderer;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GraysMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents
{
	@SubscribeEvent
	public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event)
	{
		Registry.register(Registry.RECIPE_TYPE, BlacksmithsTableRecipe.Type.ID, BlacksmithsTableRecipe.Type.INSTANCE);
	}
	
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
	{
		event.registerLayerDefinition(IdiumSpearModel.LAYER_LOCATION, IdiumSpearModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
	{
		event.registerEntityRenderer(Entities.IDIUM_SPEAR_ENTITY.get(), IdiumSpearRenderer::new);
	}
}
