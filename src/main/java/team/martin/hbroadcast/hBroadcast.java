package team.martin.hbroadcast;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.utils.LogUtils;

public class hBroadcast extends JavaPlugin {

    /*
     * Se você é novo na programação, não se assuste com coisas 'complexas' no código, estou colocando todos
     * conhecimentos na prática, deixei bem legíveis em algumas partes que eu consegui para você entender ;D.
     */

    @Override
    public void onEnable() {
        try {
            LogUtils log = new LogUtils();
            log.getInit();
            log.getComandos();
            saveDefaultConfig();
        } catch (Exception e) {
            System.out.println();
            System.out.println(ChatColor.RED + "Algo deu errado na inicialização do Plugin.");
            System.out.println();
            System.out.println(ChatColor.RED + "Possível causa: " + ChatColor.DARK_RED + "Versão incompatível.");
            System.out.println(ChatColor.RED + "Por favor, reporte em https://github.com/TheMartinfer22/hBroadcast/");
            System.out.println();
            System.out.println("Informações da pilha de execução. (Envie isso em issues)");
            e.getStackTrace();
        }
    }

    @Override
    public void onDisable() {
        LogUtils log = new LogUtils();
        log.getExit();
    }

    public static hBroadcast getPluginMainClass() {
        return getPlugin(hBroadcast.class);
    }
}
