package team.martin.hbroadcast.hbroadcast;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciar;
import team.martin.hbroadcast.hbroadcast.utils.varG;

public final class hBroadcast extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("");
        getLogger().info("O plugin hBroadcast foi habilitado com sucesso.");
        getLogger().info("Você está utilizando a versão " + varG.version);
        getLogger().info("");

        getCommand("anunciar").setExecutor(new ComandoAnunciar());






    }

    @Override
    public void onDisable() {

    }
}
