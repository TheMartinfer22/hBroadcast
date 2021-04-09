package team.martin.hbroadcast.hbroadcast;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.hbroadcast.comandos.AnnounceCommand;
import team.martin.hbroadcast.hbroadcast.comandos.RawAnnounceCommand;
import team.martin.hbroadcast.hbroadcast.comandos.ReloadCommand;

public final class hBroadcast extends JavaPlugin {

    @Override
    public void onEnable() {

        // Frases quando o plugin iniciar.
        getLogger().info("");
        getLogger().info("O plugin hBroadcast foi habilitado com sucesso.");
        getLogger().info("Você está utilizando a versão " + getDescription().getVersion());
        getLogger().info("");

        // Área de importação de comandos.
        getCommand("anunciar").setExecutor(new AnnounceCommand());
        getCommand("anunciarraw").setExecutor(new RawAnnounceCommand());
        getCommand("hbroadcastreload").setExecutor(new ReloadCommand());

        // Carregar as configurações
        // Se a config não existir o plugin vai criar automaticamente.
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("O plugin foi desligado corretamente.");
        getLogger().info("Créditos: TheMartinfer22");
    }

    public static hBroadcast getInstance() {
        return getPlugin(hBroadcast.class);
    }
}
