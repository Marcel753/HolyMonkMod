package at.htlkaindorf.holymonkmod.init;

import at.htlkaindorf.holymonkmod.items.food.ItemCustomFood;
import at.htlkaindorf.holymonkmod.items.kreuze.Kreuz;
import javafx.scene.paint.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSaddle;
import net.minecraft.item.ItemSword;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Food
    public static final Item HEILIGES_BROT = new ItemCustomFood("heiliges_brot", 20, false);

    //Kreuze
    public static final Item HOLZ_KREUZ = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_holz");
    public static final Item HOLZ_STEIN = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_stein");
    public static final Item HOLZ_EISEN = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_eisen");
    public static final Item HOLZ_GOLD = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_gold");
    public static final Item HOLZ_DIAMANT = new Kreuz(Item.ToolMaterial.WOOD, "kreuz_diamant");
}
