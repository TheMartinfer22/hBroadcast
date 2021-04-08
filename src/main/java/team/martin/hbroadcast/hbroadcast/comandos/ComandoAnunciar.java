package team.martin.hbroadcast.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hbroadcast.utils.Var;

public class ComandoAnunciar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender.hasPermission(Var.permissionadmin)){
            if (args.length == 0){
                sender.sendMessage(Var.prefix + Var.comandoIncompleto);
            } else {
                StringBuilder mensagem = new StringBuilder("");
                for (String fazParte : args){
                    if (!mensagem.toString().equals(""))
                    mensagem.append(" ");
                    mensagem.append(fazParte);
                }
                Bukkit.getServer().broadcastMessage(Var.prefix + mensagem.toString());
            }
            }else {
            sender.sendMessage(Var.semPermissao);
        }
        return false;
        };
}
