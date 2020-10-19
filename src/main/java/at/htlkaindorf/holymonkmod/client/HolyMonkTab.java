package at.htlkaindorf.holymonkmod.client;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HolyMonkTab extends CreativeTabs
{

    public HolyMonkTab()
    {
        super(HolyMonkMod.modId);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Items.CARROT);
    }
}
