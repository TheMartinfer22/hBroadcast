package team.martin.hbroadcast.hbroadcast;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciar;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciarRaw;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoReload;
import team.martin.hbroadcast.hbroadcast.utils.varG;

public final class hBroadcast extends JavaPlugin {
    public static hBroadcast instancia;
    FileConfiguration config = getConfig();
    @Override
    public void onEnable() {
        instancia = this;
        //Frases quabndo o plugin iniciar.
        getLogger().info("");
        getLogger().info("O plugin hBroadcast foi habilitado com sucesso.");
        getLogger().info("Você está utilizando a versão " + varG.version);
        getLogger().info("");

        //Área de importação de comandos.
        getCommand("anunciar").setExecutor(new ComandoAnunciar());
        getCommand("anunciarraw").setExecutor(new ComandoAnunciarRaw());
        getCommand("hbroadcastreload").setExecutor(new ComandoReload());

        //Carregar as configurações
        saveResource("config.yml", false);
    }

    @Override
    public void onDisable() {
        getLogger().info("O plugin foi desligado corretamente.");
        getLogger().info("Créditos: TheMartinfer22");
    }
}
