package graysblock.graysmod.gui.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class BlacksmithsTableResultSlot extends SlotItemHandler
{
	public BlacksmithsTableResultSlot(IItemHandler itemHandler, int index, int x, int y)
	{
		super(itemHandler, index, x, y);
	}
	
	@Override
	public boolean mayPlace(ItemStack stack)
	{
		return false;
	}
}
