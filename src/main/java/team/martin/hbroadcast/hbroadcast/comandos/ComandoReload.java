package team.martin.hbroadcast.hbroadcast.comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hbroadcast.hBroadcast;
import team.martin.hbroadcast.hbroadcast.utils.varG;

public class ComandoReload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {


        if (sender.hasPermission(varG.permissionadmin)) {
            sender.sendMessage(ChatColor.RED + "Esse comando está sob manutenção, reinicie o servidor para fazer efeito.");
            hBroadcast.instancia.saveConfig();
        }
        return false;
    }
}
