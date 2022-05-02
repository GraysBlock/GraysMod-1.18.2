package graysblock.graysmod.gui.menu;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import graysblock.graysmod.GraysMod;
import net.minecraft.client.gui.screens.inventory.ItemCombinerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlacksmithsTableScreen extends ItemCombinerScreen<BlacksmithsTableMenu>
{	
	public static ResourceLocation TEXTURE = new ResourceLocation(GraysMod.MOD_ID, "/textures/gui/container/blacksmiths_table.png");
	
	public BlacksmithsTableScreen(BlacksmithsTableMenu menu, Inventory playerInventory, Component title)
	{
		super(menu, playerInventory, title, TEXTURE);
		this.titleLabelX = 60;
	    this.titleLabelY = 18;
		this.leftPos = 0;
		this.topPos = 0;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}
	
	@Override
	protected void renderBg(PoseStack stack, float mouseX, int mouseY, int partialTicks)
	{
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
		blit(stack, this.leftPos + 59, this.topPos + 20, 0, this.imageHeight + (menu.getSlot(0).hasItem() ? 0 : 16), 110, 16);
		
		if ((this.menu.getSlot(0).hasItem() || this.menu.getSlot(1).hasItem()) && !this.menu.getSlot(2).hasItem()) {
	         this.blit(stack, this.leftPos + 99, this.topPos + 45, this.imageWidth, 0, 28, 21);
	      }
	}

	@Override
	protected void renderLabels(PoseStack p_99294_, int p_99295_, int p_99296_) {
	      RenderSystem.disableBlend();
	      super.renderLabels(p_99294_, p_99295_, p_99296_);
	   }
}