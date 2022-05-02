package graysblock.graysmod.integration.jei;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.blocks.Blocks;
import graysblock.graysmod.recipes.BlacksmithsTableRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.config.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;

public class BlacksmithsTableRecipeCategory implements IRecipeCategory<BlacksmithsTableRecipe>
{
    public final static ResourceLocation UID = new ResourceLocation(GraysMod.MOD_ID, "blacksmiths_table");
    public final static ResourceLocation TEXTURE = new ResourceLocation(GraysMod.MOD_ID, "/textures/gui/container/blacksmiths_table.png");

    private final IDrawable background;
    private final IDrawable icon;

    public BlacksmithsTableRecipeCategory(IGuiHelper helper)
    {
        background = helper.createDrawable(Constants.RECIPE_GUI_VANILLA, 0, 168, 125, 18);
        icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Blocks.BLACKSMITHS_TABLE.get()));
    }

    @Override
    public Class<? extends BlacksmithsTableRecipe> getRecipeClass()
    {
        return BlacksmithsTableRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("Blacksmith's Table");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public void setRecipe(@NonNull IRecipeLayoutBuilder builder, @NonNull BlacksmithsTableRecipe recipe, @NonNull IFocusGroup focusGroup)
    {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.base);
        builder.addSlot(RecipeIngredientRole.INPUT, 50, 1).addIngredients(recipe.addition);
        builder.addSlot(RecipeIngredientRole.OUTPUT, 108, 1).addItemStack(recipe.getResultItem());
    }
}
