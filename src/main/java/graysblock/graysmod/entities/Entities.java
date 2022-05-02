package graysblock.graysmod.entities;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.entities.projectiles.IdiumSpearEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Entities
{
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, GraysMod.MOD_ID);
	
	
	public static final RegistryObject<EntityType<IdiumSpearEntity>> IDIUM_SPEAR_ENTITY = ENTITIES.register("idium_spear", () -> EntityType.Builder.<IdiumSpearEntity>of(IdiumSpearEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(GraysMod.MOD_ID, "idium_spear_entity").toString()));
	
	
	
}
