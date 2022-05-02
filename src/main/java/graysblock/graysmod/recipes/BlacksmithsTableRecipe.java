package graysblock.graysmod.recipes;

import java.util.stream.Stream;

import net.minecraft.core.NonNullList;
import org.jetbrains.annotations.Nullable;

import com.google.gson.JsonObject;

import graysblock.graysmod.GraysMod;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

public class BlacksmithsTableRecipe implements Recipe<Container>
{
	public final Ingredient base;
	   public final Ingredient addition;
	   public final ItemStack result;
	   private final ResourceLocation id;

	   public BlacksmithsTableRecipe(ResourceLocation p_44523_, Ingredient p_44524_, Ingredient p_44525_, ItemStack p_44526_) {
	      this.id = p_44523_;
	      this.base = p_44524_;
	      this.addition = p_44525_;
	      this.result = p_44526_;
	   }

	   public boolean matches(Container p_44533_, Level p_44534_) {
	      return this.base.test(p_44533_.getItem(0)) && this.addition.test(p_44533_.getItem(1));
	   }

	   public ItemStack assemble(Container p_44531_) {
	      ItemStack itemstack = this.result.copy();
	      CompoundTag compoundtag = p_44531_.getItem(0).getTag();
	      if (compoundtag != null) {
	         itemstack.setTag(compoundtag.copy());
	      }

	      return itemstack;
	   }

	   public boolean canCraftInDimensions(int p_44528_, int p_44529_) {
	      return p_44528_ * p_44529_ >= 2;
	   }

	   public ItemStack getResultItem() {
	      return this.result;
	   }

	   public boolean isAdditionIngredient(ItemStack p_44536_) {
	      return this.addition.test(p_44536_);
	   }

	   public ItemStack getToastSymbol() {
	      return new ItemStack(graysblock.graysmod.blocks.Blocks.BLACKSMITHS_TABLE.get());
	   }

	   public ResourceLocation getId() {
	      return this.id;
	   }

	   public RecipeSerializer<?> getSerializer() {
	      return Recipes.BLACKSMITHS_TABLE_SERIALIZER.get();
	   }

	   public RecipeType<?> getType() {
	      return Type.INSTANCE;
	   }
	   
	   public static class Type implements RecipeType<BlacksmithsTableRecipe>
	   {
		   private Type() { }
		   public static final Type INSTANCE = new Type();
		   public static final String ID = "blacksmiths_table";
	   }

	   public boolean isIncomplete() {
	      return Stream.of(this.base, this.addition).anyMatch((p_151284_) -> {
	         return net.minecraftforge.common.ForgeHooks.hasNoElements(p_151284_);
	      });
	   }

	   public static class Serializer implements RecipeSerializer<BlacksmithsTableRecipe> {
	      public static final Serializer INSTANCE = new Serializer();
	      public static final ResourceLocation ID = new ResourceLocation(GraysMod.MOD_ID, "blacksmiths_table");
	      
	      @Override
	      public BlacksmithsTableRecipe fromJson(ResourceLocation p_44562_, JsonObject p_44563_) {
	         Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(p_44563_, "base"));
	         Ingredient ingredient1 = Ingredient.fromJson(GsonHelper.getAsJsonObject(p_44563_, "addition"));
	         ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(p_44563_, "result"));
	         return new BlacksmithsTableRecipe(p_44562_, ingredient, ingredient1, itemstack);
	      }

	      @Override
	      public BlacksmithsTableRecipe fromNetwork(ResourceLocation p_44565_, FriendlyByteBuf p_44566_) {
	         Ingredient ingredient = Ingredient.fromNetwork(p_44566_);
	         Ingredient ingredient1 = Ingredient.fromNetwork(p_44566_);
	         ItemStack itemstack = p_44566_.readItem();
	         return new BlacksmithsTableRecipe(p_44565_, ingredient, ingredient1, itemstack);
	      }

	      @Override
	      public void toNetwork(FriendlyByteBuf p_44553_, BlacksmithsTableRecipe p_44554_) {
	         p_44554_.base.toNetwork(p_44553_);
	         p_44554_.addition.toNetwork(p_44553_);
	         p_44553_.writeItem(p_44554_.result);
	      }
	      
	      @Override
	      public RecipeSerializer<?> setRegistryName(ResourceLocation name)
	      {
	    	  return INSTANCE;
	      }
	      
	      @Nullable
	      @Override
	      public ResourceLocation getRegistryName()
	      {
	    	  return ID;
	      }
	      
	      @Override
	        public Class<RecipeSerializer<?>> getRegistryType() {
	            return Serializer.castClass(RecipeSerializer.class);
	        }

	        @SuppressWarnings("unchecked") // Need this wrapper, because generics
	        private static <G> Class<G> castClass(Class<?> cls) {
	            return (Class<G>)cls;
	        }
	 }
}
