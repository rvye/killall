package dev.rvye.killAll.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;


@SuppressWarnings("unused")
public class ka {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(CommandManager.literal("killall").executes(ka::kill));
    }

    public static int kill(CommandContext<ServerCommandSource> context) {
        context.getSource().sendFeedback(Text.literal("wip"), false);
        // context.getSource().sendChatMessage(Text.of);
        return 1;
    }

}
