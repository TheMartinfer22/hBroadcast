package team.martin.hbroadcast.hbroadcast.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hbroadcast.hBroadcast;
import team.martin.hbroadcast.hbroadcast.utils.Variables;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender.hasPermission(Variables.adminPermission)) {
            sender.sendMessage("§a§l ! §fRecarregando config");
            hBroadcast.getInstance().reloadConfig();
        }
        return false;
    }
}
