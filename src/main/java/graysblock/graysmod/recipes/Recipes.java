package graysblock.graysmod.recipes;

import graysblock.graysmod.GraysMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Recipes
{
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, GraysMod.MOD_ID);
	
	
	public static final RegistryObject<RecipeSerializer<BlacksmithsTableRecipe>> BLACKSMITHS_TABLE_SERIALIZER = SERIALIZERS.register("blacksmiths_table", () -> BlacksmithsTableRecipe.Serializer.INSTANCE);
	
	
	public static void register(IEventBus eventBus)
	{
		SERIALIZERS.register(eventBus);
	}
}
