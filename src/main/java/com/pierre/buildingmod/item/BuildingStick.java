package com.pierre.buildingmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BuildingStick extends Item {
    public BuildingStick() {
        super(new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.EPIC));
    }
}
