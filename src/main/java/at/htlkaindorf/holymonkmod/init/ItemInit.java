package at.htlkaindorf.holymonkmod.init;

import at.htlkaindorf.holymonkmod.items.food.ItemCustomFood;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();


    //Food
    public static final Item HEILIGES_BROT = new ItemCustomFood("heiliges_brot", 20, false);
}
