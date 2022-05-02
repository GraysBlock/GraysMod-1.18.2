package graysblock.graysmod.util.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;

import graysblock.graysmod.GraysMod;
import graysblock.graysmod.entities.projectiles.IdiumSpearEntity;
import graysblock.graysmod.util.model.IdiumSpearModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IdiumSpearRenderer extends EntityRenderer<IdiumSpearEntity>
{
	public static final ResourceLocation SPEAR_LOCATION = new ResourceLocation(GraysMod.MOD_ID, "/textures/entity/idium_spear.png");
	private final IdiumSpearModel model;

	   public IdiumSpearRenderer(EntityRendererProvider.Context p_174420_) {
	      super(p_174420_);
	      this.model = new IdiumSpearModel(p_174420_.bakeLayer(IdiumSpearModel.LAYER_LOCATION));
	   }

	   public void render(IdiumSpearEntity p_116111_, float p_116112_, float p_116113_, PoseStack p_116114_, MultiBufferSource p_116115_, int p_116116_) {
	      p_116114_.pushPose();
	      p_116114_.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.yRotO, p_116111_.getYRot()) - 90.0F));
	      p_116114_.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(p_116113_, p_116111_.xRotO, p_116111_.getXRot()) + 90.0F));
	      VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(p_116115_, this.model.renderType(this.getTextureLocation(p_116111_)), false, p_116111_.isFoil());
	      this.model.renderToBuffer(p_116114_, vertexconsumer, p_116116_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	      p_116114_.popPose();
	      super.render(p_116111_, p_116112_, p_116113_, p_116114_, p_116115_, p_116116_);
	   }

	   public ResourceLocation getTextureLocation(IdiumSpearEntity p_116109_) {
	      return SPEAR_LOCATION;
	   }
}
