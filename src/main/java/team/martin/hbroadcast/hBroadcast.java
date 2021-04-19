package team.martin.hbroadcast;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.utils.LogUtils;

public class hBroadcast extends JavaPlugin {

    @Override
    public void onEnable() {
        LogUtils log = new LogUtils();
        log.getInit();
        log.getComandos();

        saveDefaultConfig();
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
