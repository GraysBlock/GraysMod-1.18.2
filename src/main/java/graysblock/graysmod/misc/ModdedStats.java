package graysblock.graysmod.misc;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class ModdedStats extends Stats
{
	public static final ResourceLocation INTERACT_WITH_BLACKSMITHS_TABLE = makeModdedStat("interact_with_blacksmiths_table", StatFormatter.DEFAULT);
	
	private static ResourceLocation makeModdedStat(String p_13008_, StatFormatter p_13009_) {
	      ResourceLocation resourcelocation = new ResourceLocation(p_13008_);
	      Registry.register(Registry.CUSTOM_STAT, p_13008_, resourcelocation);
	      CUSTOM.get(resourcelocation, p_13009_);
	      return resourcelocation;
	   }
}
