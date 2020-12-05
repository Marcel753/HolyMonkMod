package at.htlkaindorf.holymonkmod.items;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.init.ItemInit;
import at.htlkaindorf.holymonkmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

    public ItemBase(String name, CreativeTabs creativeTabs)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativeTabs);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        HolyMonkMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
