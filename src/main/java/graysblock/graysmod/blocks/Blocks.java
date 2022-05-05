package graysblock.graysmod.blocks;

import java.util.function.Function;

import com.google.common.base.Supplier;

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
	public static final RegistryObject<Block> WHITE_CHROMA_BLOCK = register("white_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.WHITE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> ORANGE_CHROMA_BLOCK = register("orange_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.ORANGE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> MAGENTA_CHROMA_BLOCK = register("magenta_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.MAGENTA).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> LIGHT_BLUE_CHROMA_BLOCK = register("light_blue_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIGHT_BLUE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> YELLOW_CHROMA_BLOCK = register("yellow_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.YELLOW).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> LIME_CHROMA_BLOCK = register("lime_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIME).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> PINK_CHROMA_BLOCK = register("pink_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.PINK).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> GRAY_CHROMA_BLOCK = register("gray_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.GRAY).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> LIGHT_GRAY_CHROMA_BLOCK = register("light_gray_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIGHT_GRAY).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> CYAN_CHROMA_BLOCK = register("cyan_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.CYAN).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> PURPLE_CHROMA_BLOCK = register("purple_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.PURPLE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> BLUE_CHROMA_BLOCK = register("blue_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BLUE).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> BROWN_CHROMA_BLOCK = register("brown_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BROWN).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> GREEN_CHROMA_BLOCK = register("green_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.GREEN).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> RED_CHROMA_BLOCK = register("red_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.RED).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> BLACK_CHROMA_BLOCK = register("black_chroma_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BLACK).strength(0.3F).sound(SoundType.GLASS).lightLevel((p_152686_) -> { return 15; })), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> YELLOW_TULIP = register("yellow_tulip", () -> new FlowerBlock(MobEffects.DIG_SPEED, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> YELLOW_TULIP_POTTED = registerWithoutBlockItem("potted_yellow_tulip", () -> new FlowerPotBlock(null, Blocks.YELLOW_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> PURPLE_TULIP = register("purple_tulip", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> PURPLE_TULIP_POTTED = registerWithoutBlockItem("potted_purple_tulip", () -> new FlowerPotBlock(null, Blocks.PURPLE_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> BLACK_TULIP = register("black_tulip", () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> BLACK_TULIP_POTTED = registerWithoutBlockItem("potted_black_tulip", () -> new FlowerPotBlock(null, Blocks.BLACK_TULIP, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.RED_TULIP).noOcclusion()));
	public static final RegistryObject<Block> CYAN_POPPY = register("cyan_poppy", () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POPPY).noOcclusion()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(GraysMod.GRAYSMOD_TAB)));
	public static final RegistryObject<Block> CYAN_POPPY_POTTED = registerWithoutBlockItem("potted_cyan_poppy", () -> new FlowerPotBlock(null, Blocks.CYAN_POPPY, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POPPY).noOcclusion()));

	
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
