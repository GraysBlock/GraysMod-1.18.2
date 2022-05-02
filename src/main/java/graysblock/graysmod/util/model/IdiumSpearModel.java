package graysblock.graysmod.util.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import graysblock.graysmod.GraysMod;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IdiumSpearModel extends Model {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(GraysMod.MOD_ID, "idium_spear"), "main");
	public static final ResourceLocation TEXTURE = new ResourceLocation(GraysMod.MOD_ID, "/textures/entity/idium_spear.png");
	private final ModelPart root;

	public IdiumSpearModel(ModelPart root) {
		super(RenderType::entitySolid);
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(28, 6).addBox(-1.0F, -25.0F, 0.0F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 8).addBox(-2.0F, -24.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 8).addBox(0.0F, -24.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-3.0F, -23.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(0.0F, -23.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		
		root.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -26.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-4.0F, -28.0F, 0.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 1).addBox(-3.0F, -29.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 1).addBox(-2.0F, -30.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -32.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void renderToBuffer(PoseStack p_103919_, VertexConsumer p_103920_, int p_103921_, int p_103922_, float p_103923_, float p_103924_, float p_103925_, float p_103926_) {
	      this.root.render(p_103919_, p_103920_, p_103921_, p_103922_, p_103923_, p_103924_, p_103925_, p_103926_);
	   }
}