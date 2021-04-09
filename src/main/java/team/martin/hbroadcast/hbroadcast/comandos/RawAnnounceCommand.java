package team.martin.hbroadcast.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hbroadcast.utils.Variables;

public class RawAnnounceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(Variables.prefix + Variables.incompleteCommand);
            return true;
        }

        if (sender.hasPermission(Variables.adminPermission)) {
            Bukkit.broadcastMessage(String.join(" ", args));
            return true;
        }

        sender.sendMessage(Variables.withoutPermission);
        return false;
    }
}
