package at.htlkaindorf.holymonkmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelNonne extends ModelBase {
    public ModelRenderer field_178736_x;
    public ModelRenderer LeftArmOut;
    public ModelRenderer RightLegOut;
    public ModelRenderer RightArmOut;
    public ModelRenderer HeadOut;
    public ModelRenderer LeftLegOut;
    public ModelRenderer RughtArmIn;
    public ModelRenderer RightLegIn;
    public ModelRenderer HeadIn;
    public ModelRenderer BodyIn;
    public ModelRenderer LeftArmIn;
    public ModelRenderer LeftLegIn;
    public ModelRenderer BodyOut;

    public ModelNonne() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.HeadOut = new ModelRenderer(this, 32, 0);
        this.HeadOut.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadOut.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.LeftArmIn = new ModelRenderer(this, 32, 48);
        this.LeftArmIn.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArmIn.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RughtArmIn = new ModelRenderer(this, 40, 16);
        this.RughtArmIn.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RughtArmIn.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BodyOut = new ModelRenderer(this, 16, 32);
        this.BodyOut.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyOut.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.LeftArmOut = new ModelRenderer(this, 48, 48);
        this.LeftArmOut.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArmOut.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F);
        this.RightArmOut = new ModelRenderer(this, 40, 32);
        this.RightArmOut.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArmOut.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F);
        this.BodyIn = new ModelRenderer(this, 16, 16);
        this.BodyIn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyIn.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.LeftLegIn = new ModelRenderer(this, 16, 48);
        this.LeftLegIn.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLegIn.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftLegOut = new ModelRenderer(this, 0, 48);
        this.LeftLegOut.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLegOut.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.RightLegIn = new ModelRenderer(this, 0, 16);
        this.RightLegIn.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLegIn.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_178736_x = new ModelRenderer(this, 24, 0);
        this.field_178736_x.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_178736_x.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.RightLegOut = new ModelRenderer(this, 0, 32);
        this.RightLegOut.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLegOut.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.HeadIn = new ModelRenderer(this, 0, 0);
        this.HeadIn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadIn.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.HeadOut.render(f5);
        this.LeftArmIn.render(f5);
        this.RughtArmIn.render(f5);
        this.BodyOut.render(f5);
        this.LeftArmOut.render(f5);
        this.RightArmOut.render(f5);
        this.BodyIn.render(f5);
        this.LeftLegIn.render(f5);
        this.LeftLegOut.render(f5);
        this.RightLegIn.render(f5);
        this.field_178736_x.render(f5);
        this.RightLegOut.render(f5);
        this.HeadIn.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.LeftLegIn.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LeftLegOut.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.RughtArmIn.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RightArmOut.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.RightLegIn.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.RightLegOut.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.LeftArmIn.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LeftArmOut.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.HeadIn.rotateAngleY = netHeadYaw * 0.017453292F;
        this.HeadOut.rotateAngleY = netHeadYaw * 0.017453292F;

        this.HeadIn.rotateAngleX = headPitch * 0.017453292F;
        this.HeadOut.rotateAngleX = headPitch * 0.017453292F;
    }
}
