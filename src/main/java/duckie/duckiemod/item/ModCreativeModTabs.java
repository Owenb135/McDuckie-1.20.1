package duckie.duckiemod.item;

import duckie.duckiemod.Duckiemod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Duckiemod.MODID);

    public static final RegistryObject<CreativeModeTab> MCDUCKIE_TAB = CREATIVE_MODE_TABS.register("mcduckie_tab",
            () ->  CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.fries.get()))
                    .title(Component.translatable("creativetabe.mcduckie_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.FRIES.get());
                    output.accept(Moditems.DRDUCKIE.get());
                    output.accept(Moditems.BRUGER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
