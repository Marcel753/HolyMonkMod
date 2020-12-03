package at.htlkaindorf.holymonkmod.util.handlers;

import at.htlkaindorf.holymonkmod.entity.EntityMoench;
import at.htlkaindorf.holymonkmod.entity.EntityNonne;
import at.htlkaindorf.holymonkmod.entity.render.RenderMoench;
import at.htlkaindorf.holymonkmod.entity.render.RenderNonne;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoench.class, new IRenderFactory<EntityMoench>()
        {
            @Override
            public Render<? super EntityMoench> createRenderFor(RenderManager manager)
            {
                return new RenderMoench(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityNonne.class, new IRenderFactory<EntityNonne>()
        {
            @Override
            public Render<? super EntityNonne> createRenderFor(RenderManager manager)
            {
                return new RenderNonne(manager);
            }
        });
    }
}
