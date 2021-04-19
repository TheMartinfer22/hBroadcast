package team.martin.hbroadcast.utils;

import org.bukkit.ChatColor;
import team.martin.hbroadcast.comandos.ComandoAnunciar;
import team.martin.hbroadcast.hBroadcast;

public class LogUtils {

    public void getInit(){
        System.out.println();
        System.out.println(ChatColor.GREEN + "★ [hBroadcast] O plugin hBroadcast foi carregado com sucesso :D");
        System.out.println(ChatColor.GREEN + "★ [hBroadcast] Você está utilizando a versão " + hBroadcast.getPluginMainClass().getDescription().getVersion());
        System.out.println();
    }

    public void getComandos(){
        hBroadcast.getPluginMainClass().getCommand("anunciar").setExecutor(new ComandoAnunciar());
    }

    public void getExit(){
        System.out.println();
        System.out.println(ChatColor.RED + "★ [hBroadcast] O plugin hBroadcast foi descarregado com sucesso");
        System.out.println(ChatColor.RED + "★ [hBroadcast] Até breve!");
        System.out.println();
    }
}
