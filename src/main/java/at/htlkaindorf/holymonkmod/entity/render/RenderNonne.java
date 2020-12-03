package at.htlkaindorf.holymonkmod.entity.render;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.entity.EntityNonne;
import at.htlkaindorf.holymonkmod.entity.model.ModelNonne;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNonne extends RenderLiving<EntityNonne>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(HolyMonkMod.modId + ":textures/entity/nonne.png");

    public RenderNonne(RenderManager manager)
    {
        super(manager, new ModelNonne(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityNonne entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityNonne entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
