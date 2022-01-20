package com.pierre.buildingmod.handlers;

import com.pierre.buildingmod.item.Items;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RegistryHandler {
    private static IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
    public static void registAll() {
        Items.getRegister().register(RegistryHandler.BUS);
    }
}
