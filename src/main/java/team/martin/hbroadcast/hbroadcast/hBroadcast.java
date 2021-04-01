package team.martin.hbroadcast.hbroadcast;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciar;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciarRaw;
import team.martin.hbroadcast.hbroadcast.utils.varG;

public final class hBroadcast extends JavaPlugin {

    @Override
    public void onEnable() {
        //Frases quabndo o plugin iniciar.
        getLogger().info("");
        getLogger().info("O plugin hBroadcast foi habilitado com sucesso.");
        getLogger().info("Você está utilizando a versão " + varG.version);
        getLogger().info("");

        //Área de importação de comandos.
        getCommand("anunciar").setExecutor(new ComandoAnunciar());
        getCommand("anunciarraw").setExecutor(new ComandoAnunciarRaw());
    }

    @Override
    public void onDisable() {
        getLogger().info("O plugin foi desligado corretamente.");
        getLogger().info("Créditos: TheMartinfer22");
    }
}
