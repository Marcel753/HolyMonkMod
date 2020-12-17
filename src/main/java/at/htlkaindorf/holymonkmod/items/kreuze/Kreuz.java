package at.htlkaindorf.holymonkmod.items.kreuze;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.init.ItemInit;
import at.htlkaindorf.holymonkmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Kreuz extends ItemSword implements IHasModel {

    private String name;

    public Kreuz(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels()
    {
        HolyMonkMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}