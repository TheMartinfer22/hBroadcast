package team.martin.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.utils.ComandosUtils;

public class ComandoAnunciar extends ComandosUtils implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length > 0) {
            if ((args[0].equalsIgnoreCase(getPrefixSubComandoNormal())) && (sender.hasPermission(getPermAdministrador()))) {
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0], getPrefixBroadcast())
                        .replace("&", "§"));
                return true;
            }
            if ((args[0].equalsIgnoreCase(getPrefixSubComandoRaw())) && (sender.hasPermission(getPermAdministrador()))) {
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0] + " ", getPrefixRaw())
                        .replace("&", "§"));
                return true;
            }
            if ((args[0].equalsIgnoreCase(getPrefixSubComandoLive())) && (sender.hasPermission(getPermAdministrador()))) {
                Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "[Live] " + ChatColor.LIGHT_PURPLE + "O jogador " + sender.getName() + " está ao vivo, venha conferir: "
                        .replace(args[0] + " ", "")
                        .replace("&", "§") + args);
                return true;
            }

            if ((args[0].equalsIgnoreCase(getPrefixSubComandoPedirAjuda())) && (sender.hasPermission(getPermUser()))) {
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("§c§l[!] §cAlguém está criando um pedido de emergência... Capturamos os dados!");
                Bukkit.broadcastMessage("§c§l[!] " + ChatColor.RED + getJogadorLocalizationThis(sender));
                Bukkit.broadcastMessage("");
                return true;
            }
        }
        if ((sender.hasPermission(getPermUser()) || (sender.hasPermission(getPermVIP())) || (sender.hasPermission(getPermStreamer()) || (sender.hasPermission(getPermAdministrador()))))){
            sender.sendMessage(getCmdIncompleto());
            return false;
        }

        sender.sendMessage(getCmdSemPermissao());

        return false;

    }

}

