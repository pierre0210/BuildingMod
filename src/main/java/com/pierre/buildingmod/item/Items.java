package com.pierre.buildingmod.item;

import com.pierre.buildingmod.BuildingMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static DeferredRegister<Item> getRegister() {
        return Items.ItemRegistry.REGISTER;
    }

    @SuppressWarnings("unused")
    public static class ItemRegistry {
        public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, BuildingMod.MODID);
        public static final RegistryObject<Item> OBJ_BUILDINGSTICK = ItemRegistry.REGISTER.register("buildingstick", () -> new BuildingStick());
    }
}
