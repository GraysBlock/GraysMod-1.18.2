package graysblock.graysmod.items;

import com.google.common.base.Supplier;

import graysblock.graysmod.GraysMod;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GraysMod.MOD_ID);
	
	
	public static final RegistryObject<Item> DIAMONITE = register("diamonite", () -> new Item(new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> RAW_DIAMONITE = register("raw_diamonite", () -> new Item(new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM = register("idium", () -> new Item(new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> RAW_IDIUM = register("raw_idium", () -> new Item(new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> DIAMONITE_PICKAXE = register("diamonite_pickaxe", () -> new PickaxeItem(Tiers.DIAMONITE, 1, -2.8f, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM_PICKAXE = register("idium_pickaxe", () -> new PickaxeItem(Tiers.IDIUM, 1, -2.8f, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> DIAMONITE_AXE = register("diamonite_axe", () -> new AxeItem(Tiers.DIAMONITE, 6.0F, -2.8F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM_AXE = register("idium_axe", () -> new AxeItem(Tiers.IDIUM, 6.0F, -2.8F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> DIAMONITE_SHOVEL = register("diamonite_shovel", () -> new ShovelItem(Tiers.DIAMONITE, 1.5F, -3.0F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM_SHOVEL = register("idium_shovel", () -> new ShovelItem(Tiers.IDIUM, 1.5F, -3.0F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> DIAMONITE_HOE = register("diamonite_hoe", () -> new HoeItem(Tiers.DIAMONITE, -5, 0.0F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM_HOE = register("idium_hoe", () -> new HoeItem(Tiers.IDIUM, -5, 0.0F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> DIAMONITE_KATANA = register("diamonite_katana", () -> new SwordItem(Tiers.DIAMONITE, 4, -1.6F, new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Item> IDIUM_SPEAR = register("idium_spear", () -> new IdiumSpearItem((new Item.Properties().durability(3561).tab(GraysMod.GRAYSMOD_TAB))));
	
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
}
