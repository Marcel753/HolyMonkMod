package at.htlkaindorf.holymonkmod;

import at.htlkaindorf.holymonkmod.entity.EntityBase;
import at.htlkaindorf.holymonkmod.init.ItemInit;
import at.htlkaindorf.holymonkmod.potions.PotionInit;
import at.htlkaindorf.holymonkmod.proxy.CommonProxy;
import at.htlkaindorf.holymonkmod.util.IHasModel;
import at.htlkaindorf.holymonkmod.util.handlers.RenderHandler;
import at.htlkaindorf.holymonkmod.util.handlers.SoundsHandler;
import at.htlkaindorf.holymonkmod.world.gen.generators.WorldGenCustomStructures;
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
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = HolyMonkMod.modId, name = HolyMonkMod.name, version = HolyMonkMod.version)

public class HolyMonkMod
{
    public static final String modId = "holymonk";
    public static final String name =  "Holy Monk Mod";
    public static final String version = "1.0";

    public static final int ENTITY_MOENCH = 120;
    public static final int ENTITY_NONNE = 130;

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
        SoundsHandler.registerSounds();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void register(RegistryEvent.Register<Block> event)
        {
            GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);

            EntityBase.registerEntites();
            RenderHandler.registerEntityRenders();
            PotionInit.registerPotions();
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
        }

        @SubscribeEvent
        public static void onModelRegister(ModelRegistryEvent event)
        {
            for(Item item : ItemInit.ITEMS)
            {
                if(item instanceof IHasModel)
                {
                    ((IHasModel)item).registerModels();
                }
            }
        }
    }
}
