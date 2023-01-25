package dev.rvye.killAll.util;

import dev.rvye.killAll.command.ka;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModRegristries {

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(ka::register);
    }
}
