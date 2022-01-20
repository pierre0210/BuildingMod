package com.pierre.buildingmod;

import com.pierre.buildingmod.handlers.RegistryHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(BuildingMod.MODID)
public class BuildingMod {
    public static final String MODID = "buildingmod";
    public static final String VERSION = "0.0.1";

    private static final Logger LOGGER = LogManager.getLogger();

    public BuildingMod() {
        RegistryHandler.registAll();
    }
}
