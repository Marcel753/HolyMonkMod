package at.htlkaindorf.holymonkmod.entity;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityBase
{
    public static void registerEntites()
    {
        registerEntity("moench", EntityMoench.class, HolyMonkMod.ENTITY_MOENCH, 50, 10245632, 16767488);
        registerEntity("nonne", EntityNonne.class, HolyMonkMod.ENTITY_NONNE, 50, 0, 16777215);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name),
                entity, name, id, HolyMonkMod.instance, range, 1, true, color1, color2);
    }
}
