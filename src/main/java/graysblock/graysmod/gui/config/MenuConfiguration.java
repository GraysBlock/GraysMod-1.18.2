package graysblock.graysmod.gui.config;

import com.mojang.blaze3d.vertex.PoseStack;
import graysblock.graysmod.GraysMod;
import graysblock.graysmod.config.GraysModClientConfigs;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.OptionsList;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.TranslatableComponent;

public final class MenuConfiguration extends Screen {
    private static final int TITLE_HEIGHT = 8;
    private OptionsList menuList;

    public MenuConfiguration()
    {
        super(new TranslatableComponent("configGui.graysmod.menuTitle", GraysMod.NAME));
    }

    @Override
    protected void init()
    {
        this.menuList = new OptionsList(this.minecraft, this.width, this.height, 32, this.height - 32, 25);
        this.addWidget(this.menuList);
        this.createFooter();

        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, new TranslatableComponent("configGui.graysmod.titleScreenStyle"), (p_96276_) -> {
            this.minecraft.setScreen(new MenuConfiguration()); }));
    }

    protected void createFooter() {
        this.addRenderableWidget(new Button(this.width / 2 - 100, this.height - 27, 200, 20, CommonComponents.GUI_DONE, (p_96276_) -> {
            this.minecraft.setScreen(new GraysModConfigurationMenu(this)); }));
    }

    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks)
    {
        this.renderBackground(stack);
        this.drawCenteredString(stack, this.font, this.title, this.width / 2, TITLE_HEIGHT, 0xFFFFFF);
        super.render(stack, mouseX, mouseY, partialTicks);
    }
}
