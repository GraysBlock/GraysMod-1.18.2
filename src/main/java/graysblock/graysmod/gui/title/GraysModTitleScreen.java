package graysblock.graysmod.gui.title;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.config.GraysModClientConfigs;
import graysblock.graysmod.gui.config.GraysModConfigurationMenu;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.CubeMap;
import net.minecraft.client.renderer.PanoramaRenderer;
import net.minecraft.resources.ResourceLocation;

public class GraysModTitleScreen extends TitleScreen
{
    private static final ResourceLocation GRAYSMOD_CONFIG_TEXTURE = new ResourceLocation(GraysMod.MOD_ID, "/textures/gui/graysmod_config.png");
    public static final CubeMap GRAYSMOD_CUBE_MAP = new CubeMap(new ResourceLocation(GraysMod.MOD_ID, "/textures/gui/title/background/panorama"));

    @Override
    protected void init()
    {
        int l = this.height / 4 + 48;
        this.addRenderableWidget(new ImageButton(this.width / 2 + 104, l + 72 + 12, 20, 20, 50, 0, 20, GRAYSMOD_CONFIG_TEXTURE, 32, 64, (p_96784_) -> {
            assert this.minecraft != null;
            this.minecraft.setScreen(new GraysModConfigurationMenu(this));
        }));

        changeTitleScreen();
    }

    public void changeTitleScreen()
    {
        if(GraysModClientConfigs.TITLE_SCREEN_STYLE.get() == true)
        {
            PanoramaRenderer panorama = new PanoramaRenderer(GRAYSMOD_CUBE_MAP);
        }
        else {
            PanoramaRenderer panorama = new PanoramaRenderer(CUBE_MAP);
        }
    }
}
