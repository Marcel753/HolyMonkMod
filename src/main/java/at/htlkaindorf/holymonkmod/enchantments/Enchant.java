package at.htlkaindorf.holymonkmod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Enchant extends Enchantment {

    public Enchant(){
        super(Rarity.RARE , EnumEnchantmentType.WEAPON , new EntityEquipmentSlot[]
        {EntityEquipmentSlot.MAINHAND, EntityEquipmentSlot.OFFHAND});

        this.setName("Bestes Enchantment EUWest");
        this.setRegistryName(new ResourceLocation("holymonk",":Geilo"));
    }


    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 20*enchantmentLevel;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return this.getMinEnchantability(enchantmentLevel) + 10;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.KNOCKBACK;
    }

    /*@SubscribeEvent
    public static void {

    }*/
}
