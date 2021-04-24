package team.martin.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.utils.ComandosUtils;

import java.util.Objects;

public class ComandoAnunciar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        ComandosUtils anunciar = new ComandosUtils();

        if (args.length > 0) {
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoNormal())) && (sender.hasPermission(anunciar.getPermAdministrador()))) {
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0], anunciar.getPrefixBroadcast())
                        .replace("&", "§"));
                return true;
            }
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoRaw())) && (sender.hasPermission(anunciar.getPermAdministrador()))) {
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0] + " ", anunciar.getPrefixRaw())
                        .replace("&", "§"));
                return true;
            }
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoLive())) && (sender.hasPermission(anunciar.getPermAdministrador()))) {
                Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "[Live] " + ChatColor.LIGHT_PURPLE + "O jogador " + sender.getName() + " está ao vivo, venha conferir: "
                        .replace(args[0] + " ", "")
                        .replace("&", "§") + args);
                return true;
            }

            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoPedirAjuda())) && (sender.hasPermission(anunciar.getPermUser()))) {
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("§c§l[!] §cAlguém está criando um pedido de emergência... Capturamos os dados!");
                Bukkit.broadcastMessage("§c§l[!] " + ChatColor.RED + anunciar.getJogadorLocalizationThis(sender));
                Bukkit.broadcastMessage("");
                return true;
            }
        }
        if ((sender.hasPermission(anunciar.getPermUser()) || (sender.hasPermission(anunciar.getPermVIP())) || (sender.hasPermission(anunciar.getPermStreamer()) || (sender.hasPermission(anunciar.getPermAdministrador()))))){
            sender.sendMessage(anunciar.getCmdIncompleto());
            return false;
        }

        sender.sendMessage(anunciar.getCmdSemPermissao());

        return false;

    }

}

