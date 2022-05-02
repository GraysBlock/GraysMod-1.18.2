package graysblock.graysmod.blocks;

import java.util.function.Function;

import com.google.common.base.Supplier;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.items.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GraysMod.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = Items.ITEMS;
	
	
	public static final RegistryObject<Block> DIAMONITE_ORE = register("diamonite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(45, 1200).sound(SoundType.ANCIENT_DEBRIS)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> DEEPSLATE_DIAMONITE_ORE = register("deepslate_diamonite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(46.5f, 1200).sound(SoundType.DEEPSLATE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> IDIUM_ORE = register("idium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(45, 1200).sound(SoundType.ANCIENT_DEBRIS)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> DEEPSLATE_IDIUM_ORE = register("deepslate_idium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(46.5f, 1200).sound(SoundType.DEEPSLATE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> DIAMONITE_BLOCK = register("diamonite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> IDIUM_BLOCK = register("idium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<BlacksmithsTableBlock> BLACKSMITHS_TABLE = register("blacksmiths_table", () -> new BlacksmithsTableBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.5f, 2.5f).sound(SoundType.WOOD)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block)
	{
		return BLOCKS.register(name,  block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item)
	{
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
