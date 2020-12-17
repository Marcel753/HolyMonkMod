package at.htlkaindorf.holymonkmod.potions;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionInit
{
    public static final Potion WEIHWASSER_EFFECT = new CustomPotion("weihwasser", false, 7719935, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.ATTACK_DAMAGE, MathHelper.getRandomUUID().toString(), 3.0D, 2);

    public static final PotionType WEIHWASSER = new PotionType("weihwasser", new PotionEffect[] {new PotionEffect(WEIHWASSER_EFFECT, 300)}).setRegistryName("weihwasser");
    public static final PotionType LONG_WEIHWASSER = new PotionType("weihwasser", new PotionEffect[] {new PotionEffect(WEIHWASSER_EFFECT, 600)}).setRegistryName("long_weihwasser");

    public static void registerPotions()
    {
        registerPotion(WEIHWASSER, LONG_WEIHWASSER, WEIHWASSER_EFFECT);
    }

    private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect)
    {
        ForgeRegistries.POTIONS.register(effect);
        ForgeRegistries.POTION_TYPES.register(defaultPotion);
        ForgeRegistries.POTION_TYPES.register(longPotion);
    }
}
