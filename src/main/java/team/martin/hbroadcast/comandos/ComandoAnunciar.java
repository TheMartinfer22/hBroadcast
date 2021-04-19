package team.martin.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hBroadcast;
import team.martin.hbroadcast.utils.ComandosUtils;

public class ComandoAnunciar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        ComandosUtils anunciar = new ComandosUtils();

        //Filtrar quem pode acessar o comando Anunciar
        if (!sender.hasPermission(anunciar.getPermAdministrador()) || !sender.hasPermission(anunciar.getPermStreamer()) || !sender.hasPermission(anunciar.getPermVIP())){
            sender.sendMessage(anunciar.getCmdSemPermissao());
            return false;
        }

        if (args.length > 1){
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoNormal())) && (sender.hasPermission(anunciar.getPermAdministrador()))){
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0], anunciar.getPrefixBroadcast())
                        .replace("&", "§"));
                return true;
            }
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoRaw())) && (sender.hasPermission(anunciar.getPermAdministrador()))){
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0],anunciar.getPrefixRaw())
                        .replace("&", "§")); //TODO problema com o argumento 1
                return true;
            }
            if ((args[0].equalsIgnoreCase(anunciar.getPrefixSubComandoLive())) && (sender.hasPermission(anunciar.getPermAdministrador()))){
                Bukkit.broadcastMessage(String.join(" ", args)
                        .replace(args[0], ChatColor.DARK_PURPLE + "[Live] ")
                        .replace("&", "§"));
                return true;
            }

        }

        if ((args[0].equalsIgnoreCase("reload")) && (sender.hasPermission(anunciar.getPermAdministrador()))){
            hBroadcast.getInstance().saveConfig();
            hBroadcast.getInstance().reloadConfig();
            sender.sendMessage("Você recarregou as configurações do plugin com sucesso!");
            return true;
        }

        sender.sendMessage(anunciar.getCmdIncompleto());
        return false;

    }

}

