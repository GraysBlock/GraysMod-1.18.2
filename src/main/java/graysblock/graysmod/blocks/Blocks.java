package graysblock.graysmod.blocks;

import java.util.function.Function;
import java.util.function.Supplier;


import graysblock.graysmod.GraysMod;
import graysblock.graysmod.items.Items;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
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
	public static final RegistryObject<Block> YELLOW_TULIP = register("yellow_tulip", () -> new FlowerBlock(MobEffects.DIG_SPEED, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> YELLOW_TULIP_POTTED = registerWithoutBlockItem("potted_yellow_tulip", () -> new FlowerPotBlock((Supplier)null, Blocks.YELLOW_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POTTED_RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> PURPLE_TULIP = register("purple_tulip", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> PURPLE_TULIP_POTTED = registerWithoutBlockItem("potted_purple_tulip", () -> new FlowerPotBlock((Supplier)null, Blocks.PURPLE_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POTTED_RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> BLACK_TULIP = register("black_tulip", () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> BLACK_TULIP_POTTED = registerWithoutBlockItem("potted_black_tulip", () -> new FlowerPotBlock((Supplier)null, Blocks.BLACK_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POTTED_RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> CYAN_POPPY = register("cyan_poppy", () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POPPY).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> CYAN_POPPY_POTTED = registerWithoutBlockItem("potted_cyan_poppy", () -> new FlowerPotBlock((Supplier)null, Blocks.CYAN_POPPY, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POTTED_POPPY).noOcclusion()));

	
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

	private static <T extends Block> RegistryObject<T> registerWithoutBlockItem(String name, Supplier<T> block)
	{
		return BLOCKS.register(name, block);
	}
}
