package dev.rvye.killAll;

import dev.rvye.killAll.util.ModRegristries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class killAll implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("killall");

    @Override
    public void onInitialize() {
        LOGGER.info("initialized");

        ModRegristries.registerCommands();
    }
}
