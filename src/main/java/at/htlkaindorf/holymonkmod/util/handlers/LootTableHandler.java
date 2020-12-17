package at.htlkaindorf.holymonkmod.util.handlers;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
    public static final ResourceLocation MOENCH = LootTableList.register(new ResourceLocation(Reference.MODID, "moench"));
    public static final ResourceLocation NONNE = LootTableList.register(new ResourceLocation(Reference.MODID, "nonne"));
}
