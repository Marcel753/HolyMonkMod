package at.htlkaindorf.holymonkmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    //public static ItemBase kreuzHolz = new ItemBase("kreuz_holz").setCreativeTab(CreativeTabs.MATERIALS);
    public static Kreuz holz = (Kreuz) new Kreuz("kreuz_holz", Item.ToolMaterial.WOOD).setCreativeTab(CreativeTabs.MATERIALS);
    public static Kreuz stein = (Kreuz) new Kreuz("kreuz_stein", Item.ToolMaterial.STONE).setCreativeTab(CreativeTabs.MATERIALS);
    public static Kreuz eisen = (Kreuz) new Kreuz("kreuz_eisen", Item.ToolMaterial.IRON).setCreativeTab(CreativeTabs.MATERIALS);
    public static Kreuz gold = (Kreuz) new Kreuz("kreuz_gold", Item.ToolMaterial.GOLD).setCreativeTab(CreativeTabs.MATERIALS);
    public static Kreuz diamant = (Kreuz) new Kreuz("kreuz_diamant", Item.ToolMaterial.DIAMOND).setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                holz,stein,eisen,gold,diamant
        );
    }

    public static void registerModels()
    {
        holz.registerItemModel();
        stein.registerItemModel();
        eisen.registerItemModel();
        gold.registerItemModel();
        diamant.registerItemModel();
    }
}
