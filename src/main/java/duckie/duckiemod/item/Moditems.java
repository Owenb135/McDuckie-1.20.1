package duckie.duckiemod.item;

import duckie.duckiemod.Duckiemod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Duckiemod.MODID);
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries",
            () -> new Item(new Item.Properties()));
    // Remember that after listing "<Item>" make name all caps
    public static final RegistryObject<Item> DRDUCKIE = ITEMS.register("drduckie",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRUGER ITEMS.register("bruger",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
