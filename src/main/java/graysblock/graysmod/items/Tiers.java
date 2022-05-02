package graysblock.graysmod.items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class Tiers
{
	public static final ForgeTier DIAMONITE = new ForgeTier(5, 3592, 10f, 5.0f, 17, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.DIAMONITE.get()));
	public static final ForgeTier IDIUM = new ForgeTier(5, 3592, 10f, 5.0f, 17, Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.IDIUM.get()));
}
