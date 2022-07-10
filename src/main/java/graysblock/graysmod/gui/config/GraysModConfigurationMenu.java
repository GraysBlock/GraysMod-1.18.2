package graysblock.graysmod.gui.config;

import com.mojang.blaze3d.vertex.PoseStack;
import graysblock.graysmod.GraysMod;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.TranslatableComponent;

public class GraysModConfigurationMenu extends Screen
{
    private static final int TITLE_HEIGHT = 8;
    private final Screen parentScreen;

    public GraysModConfigurationMenu(Screen parentScreen)
    {
        super(new TranslatableComponent("configGui.graysmod.mainTitle", GraysMod.NAME));
        this.parentScreen = parentScreen;
    }

    @Override
    protected void init()
    {
        this.createFooter();

        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, new TranslatableComponent("configGui.graysmod.menuButton"), (p_96276_) -> {
            this.minecraft.setScreen(new MenuConfiguration()); }));
    }

    protected void createFooter() {
        this.addRenderableWidget(new Button(this.width / 2 - 100, this.height - 27, 200, 20, CommonComponents.GUI_DONE, (p_96680_) -> {
            this.minecraft.setScreen(this.parentScreen);
        }));
    }

    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground(stack);
        this.drawCenteredString(stack, this.font, this.title, this.width / 2, TITLE_HEIGHT, 0xFFFFFF);
        super.render(stack, mouseX, mouseY, partialTicks);
    }
}
