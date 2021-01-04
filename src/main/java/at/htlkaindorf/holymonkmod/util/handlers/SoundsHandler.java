package at.htlkaindorf.holymonkmod.util.handlers;

import at.htlkaindorf.holymonkmod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
    public static SoundEvent ENTITY_MOENCH_AMBIENT, ENTITY_MOENCH_HURT, ENTITY_MOENCH_DEATH;
    public static SoundEvent ENTITY_NONNE_AMBIENT, ENTITY_NONNE_HURT, ENTITY_NONNE_DEATH;

    public static void registerSounds()
    {
        ENTITY_MOENCH_AMBIENT = registerSound("entity.moench.ambient");
        ENTITY_MOENCH_HURT = registerSound("entity.moench.hurt");
        ENTITY_MOENCH_DEATH = registerSound("entity.moench.death");

        ENTITY_NONNE_AMBIENT = registerSound("entity.nonne.ambient");
        ENTITY_NONNE_HURT = registerSound("entity.nonne.hurt");
        ENTITY_NONNE_DEATH = registerSound("entity.nonne.death");
    }

    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
