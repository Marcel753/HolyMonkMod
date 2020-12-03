package at.htlkaindorf.holymonkmod.potions;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class CustomPotion extends Potion
{
    public CustomPotion(String name, boolean isBadPotion, int color, int iconIndexX, int iconIndexY)
    {
        super(isBadPotion, color);
        setPotionName("effect." + name);
        setIconIndex(iconIndexX, iconIndexY);
        setRegistryName(new ResourceLocation(HolyMonkMod.modId + ":" + name));
    }

    @Override
    public boolean hasStatusIcon()
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(HolyMonkMod.modId + ":textures/gui/potion_effects.png"));
        return true;
    }
}
