package graysblock.graysmod.blocks.entities;

import graysblock.graysmod.GraysMod;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntities
{
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GraysMod.MOD_ID);
	
	
	//insert block entity here
	
	
	public static void register(IEventBus eventBus)
	{
		BLOCK_ENTITIES.register(eventBus);
	}
}
