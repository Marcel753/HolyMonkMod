package at.htlkaindorf.holymonkmod.entity.render;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.entity.EntityMoench;
import at.htlkaindorf.holymonkmod.entity.model.ModelMoench;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMoench extends RenderLiving<EntityMoench>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(HolyMonkMod.modId + ":textures/entity/moench.png");

    public RenderMoench(RenderManager manager)
    {
        super(manager, new ModelMoench(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityMoench entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityMoench entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
