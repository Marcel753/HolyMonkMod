package at.htlkaindorf.holymonkmod;

import at.htlkaindorf.holymonkmod.block.ModBlocks;
import at.htlkaindorf.holymonkmod.client.HolyMonkTab;
import at.htlkaindorf.holymonkmod.item.ModItems;
import at.htlkaindorf.holymonkmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = HolyMonkMod.modId, name = HolyMonkMod.name, version = HolyMonkMod.version)

public class HolyMonkMod
{
    public static final String modId = "holymonk";
    public static final String name =  "Holy Monk Mod";
    public static final String version = "1.0";

    public static final HolyMonkTab creativeTab = new HolyMonkTab();

    @SidedProxy(serverSide = "at.htlkaindorf.holymonkmod.proxy.CommonProxy", clientSide = "at.htlkaindorf.holymonkmod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static HolyMonkMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {

        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
    }
}
