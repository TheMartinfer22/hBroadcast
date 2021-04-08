package team.martin.hbroadcast.hbroadcast;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciar;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoAnunciarRaw;
import team.martin.hbroadcast.hbroadcast.comandos.ComandoReload;
import team.martin.hbroadcast.hbroadcast.utils.Var;

import java.util.Objects;

public final class hBroadcast extends JavaPlugin {
    public static hBroadcast instancia;

    //Definindo config uma variável e igualando para
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        //Definir instância para a config handler ler
        instancia = this;

        //Frases quando o plugin iniciar.
        getLogger().info("");
        getLogger().info("O plugin hBroadcast foi habilitado com sucesso.");
        getLogger().info("Você está utilizando a versão " + Var.version);
        getLogger().info("");

        //Área de importação de comandos.
        Objects.requireNonNull(getCommand("anunciar")).setExecutor(new ComandoAnunciar());
        Objects.requireNonNull(getCommand("anunciarraw")).setExecutor(new ComandoAnunciarRaw());
        Objects.requireNonNull(getCommand("hbroadcastreload")).setExecutor(new ComandoReload());

        //Carregar as configurações
        //O erro de reload é que eu utilizei o SaveResourse então está apenas salvando um arquivo que está na memória, TODO Alterar para retirar o bug. Acrescentar saveConfig().
        saveResource("config.yml", false);
    }
    @Override
    public void onDisable() {
        getLogger().info("O plugin foi desligado corretamente.");
        getLogger().info("Créditos: TheMartinfer22");
    }

}
