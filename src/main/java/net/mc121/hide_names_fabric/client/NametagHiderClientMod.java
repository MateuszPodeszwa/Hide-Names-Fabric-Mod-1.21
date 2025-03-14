package net.mc121.hide_names_fabric.client;

import net.fabricmc.api.ModInitializer;
import net.mc121.hide_names_fabric.HideNamesFabric;

/**
 * Client-side mod initialiser for the Nametag Hider mod.
 * This class handles client-specific initialisation.
 *
 * @author Mateusz Podeszwa
 */
public class NametagHiderClientMod implements ModInitializer {

    @Override
    public void onInitialize() {
        /**
         * Initialises the client-side portion of the mod.
         * This method is called during client mod initialisation by the Fabric loader.
         */
        HideNamesFabric.LOGGER.info("Initialising Name tag Hider client mod");
    }
}
