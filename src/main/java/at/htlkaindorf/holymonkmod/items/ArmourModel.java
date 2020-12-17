package at.htlkaindorf.holymonkmod.items;

import at.htlkaindorf.holymonkmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourModel extends ItemArmor implements IHasModel
{
    public ArmourModel(String name, CreativeTabs creativeTabs, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, 1, equipmentSlotIn);
    }

    @Override
    public void registerModels()
    {

    }
}
