package at.htlkaindorf.holymonkmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ItemBase kreuzHolz = new ItemBase("kreuz_holz").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                kreuzHolz
        );
    }

    public static void registerModels()
    {
        kreuzHolz.registerItemModel();
    }
}
