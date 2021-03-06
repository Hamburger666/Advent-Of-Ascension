package net.tslat.aoa3.client.model.entities.mobs.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelHeadlessHunter extends ModelBase {
	private ModelRenderer rightArm;
	private ModelRenderer leftArm;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer rightArm2;
	private ModelRenderer rightArm3;
	private ModelRenderer rightArm4;
	private ModelRenderer rightArm5;
	private ModelRenderer rightArm6;
	private ModelRenderer rightArm7;
	private ModelRenderer rightArm8;
	private ModelRenderer body;
	private ModelRenderer leftArm2;
	private ModelRenderer rightArm9;

	public ModelHeadlessHunter() {
		textureWidth = 64;
		textureHeight = 64;
		(rightArm = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 19.0f, -15.0f, 1, 2, 8);
		rightArm.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm.setTextureSize(64, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 17, 37)).addBox(-2.0f, -5.0f, -4.0f, 7, 7, 8);
		leftArm.setRotationPoint(11.0f, -2.0f, 0.0f);
		leftArm.setTextureSize(64, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 2)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		rightLeg.setRotationPoint(-6.0f, 12.0f, 0.0f);
		rightLeg.setTextureSize(64, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 2)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		leftLeg.setRotationPoint(6.0f, 12.0f, 0.0f);
		leftLeg.setTextureSize(64, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 17, 37)).addBox(-5.0f, -5.0f, -4.0f, 7, 7, 8);
		rightArm2.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm2.setTextureSize(64, 64);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 10, 14)).addBox(-2.0f, 15.0f, -14.0f, 2, 2, 20);
		rightArm3.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm3.setTextureSize(64, 64);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(rightArm4 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 21.0f, -16.0f, 1, 2, 10);
		rightArm4.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm4.setTextureSize(64, 64);
		rightArm4.mirror = true;
		setRotation(rightArm4, 0.0f, 0.0f, 0.0f);
		(rightArm5 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 17.0f, -14.0f, 1, 2, 6);
		rightArm5.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm5.setTextureSize(64, 64);
		rightArm5.mirror = true;
		setRotation(rightArm5, 0.0f, 0.0f, 0.0f);
		(rightArm6 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 13.0f, -14.0f, 1, 2, 6);
		rightArm6.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm6.setTextureSize(64, 64);
		rightArm6.mirror = true;
		setRotation(rightArm6, 0.0f, 0.0f, 0.0f);
		(rightArm7 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 11.0f, -15.0f, 1, 2, 8);
		rightArm7.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm7.setTextureSize(64, 64);
		rightArm7.mirror = true;
		setRotation(rightArm7, 0.0f, 0.0f, 0.0f);
		(rightArm8 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 9.0f, -16.0f, 1, 2, 10);
		rightArm8.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm8.setTextureSize(64, 64);
		rightArm8.mirror = true;
		setRotation(rightArm8, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 14, 37)).addBox(-9.0f, 0.0f, -4.0f, 18, 18, 7);
		body.setRotationPoint(0.0f, -6.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 40, 4)).addBox(-2.0f, -2.0f, -3.0f, 6, 21, 6);
		leftArm2.setRotationPoint(11.0f, -2.0f, 0.0f);
		leftArm2.setTextureSize(64, 64);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(rightArm9 = new ModelRenderer(this, 40, 4)).addBox(-4.0f, -2.0f, -3.0f, 6, 21, 6);
		rightArm9.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightArm9.setTextureSize(64, 64);
		rightArm9.mirror = true;
		setRotation(rightArm9, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		rightArm.render(par7);
		leftArm.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		rightArm2.render(par7);
		rightArm3.render(par7);
		rightArm4.render(par7);
		rightArm5.render(par7);
		rightArm6.render(par7);
		rightArm7.render(par7);
		rightArm8.render(par7);
		body.render(par7);
		leftArm2.render(par7);
		rightArm9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm3.rotateAngleZ = 0.0f;
		rightArm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm4.rotateAngleZ = 0.0f;
		rightArm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm5.rotateAngleZ = 0.0f;
		rightArm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm6.rotateAngleZ = 0.0f;
		rightArm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm7.rotateAngleZ = 0.0f;
		rightArm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm8.rotateAngleZ = 0.0f;
		rightArm9.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm9.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
