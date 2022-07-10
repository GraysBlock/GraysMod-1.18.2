package graysblock.graysmod.config;

import net.minecraft.client.Options;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraftforge.common.ForgeConfigSpec;

public abstract class GraysModClientConfigs
{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> TITLE_SCREEN_STYLE;

    static
    {
        BUILDER.push("GraysMod Configurations Menu");

        TITLE_SCREEN_STYLE = BUILDER.comment("Enable or Disable the GraysMod Title Screen.").define("GraysMod Title Screen", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
