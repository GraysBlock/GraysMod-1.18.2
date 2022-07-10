package graysblock.graysmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GraysModCommonConfigs
{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static
    {
        BUILDER.push("GraysMod Configurations Menu");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
