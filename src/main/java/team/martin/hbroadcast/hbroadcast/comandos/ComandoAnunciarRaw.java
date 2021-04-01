package team.martin.hbroadcast.hbroadcast.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hbroadcast.utils.varG;

public class ComandoAnunciarRaw implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender.hasPermission(varG.permissionadmin)){
            if (args.length == 0){
                sender.sendMessage(varG.prefix + varG.comandoIncompleto);
            }else {
                StringBuilder mensagem = new StringBuilder("");
                //Para os argumentos de args que estiverem com espaçamento, eles vão fazer parte da mesma frase.
                for (String fazParte : args){
                    if (!mensagem.toString().equals(""))
                        mensagem.append(" ");
                        mensagem.append(fazParte);
                }
                Bukkit.getServer().broadcastMessage(mensagem.toString());
            }
            }else {
            sender.sendMessage(varG.semPermissao);
        }




        return false;
    }
}
