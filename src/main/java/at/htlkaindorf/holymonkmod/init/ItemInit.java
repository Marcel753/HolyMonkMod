package at.htlkaindorf.holymonkmod.init;

import at.htlkaindorf.holymonkmod.items.ArmourModel;
import at.htlkaindorf.holymonkmod.items.food.ItemCustomFood;
import at.htlkaindorf.holymonkmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import at.htlkaindorf.holymonkmod.items.kreuze.Kreuz;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
    public static final ItemArmor.ArmorMaterial HEILIGENSCHEIN_MODEL_MATERIAL = EnumHelper.addArmorMaterial("heiligenschein", Reference.MODID + ":heiligenschein", 20, new int[] {7,8,9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);


    //Food
    public static final Item HEILIGES_BROT = new ItemCustomFood("heiliges_brot", 20, false);

    //Armor
    public static final Item HEILIGENSCHEIN_HELM = new ArmourModel("heiligenschein_helm", CreativeTabs.COMBAT, HEILIGENSCHEIN_MODEL_MATERIAL, EntityEquipmentSlot.HEAD);

    //Kreuze
    public static final Item HOLZ_KREUZ = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_holz");
    public static final Item HOLZ_STEIN = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_stein");
    public static final Item HOLZ_EISEN = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_eisen");
    public static final Item HOLZ_GOLD = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_gold");
    public static final Item HOLZ_DIAMANT = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_diamant");
}
