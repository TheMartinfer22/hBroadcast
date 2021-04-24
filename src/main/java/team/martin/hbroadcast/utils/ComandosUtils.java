package team.martin.hbroadcast.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hbroadcast.hBroadcast;

//Variáveis Globais
public class ComandosUtils{

    //Prefixos
    private String PrefixBroadcast = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoBroadcast");
    private String PrefixRaw = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoRaw");

    //Permissões
    private String PermStreamer = hBroadcast.getPluginMainClass().getConfig().getString("PermissaoStreamer");
    private String PermAdministrador = hBroadcast.getPluginMainClass().getConfig().getString("PermissaoAdministrador");
    private String PermVIP = hBroadcast.getPluginMainClass().getConfig().getString("PermissaoVIP");
    private String PermUser = hBroadcast.getPluginMainClass().getConfig().getString("PermissaoUser");
    //Comando
    private String CmdIncompleto = hBroadcast.getPluginMainClass().getConfig().getString("ComandoIncompleto");
    private String CmdSemPermissao = hBroadcast.getPluginMainClass().getConfig().getString("ComandoSemPermissao");

    //SubComandos
    private String PrefixSubComandoNormal = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarNormal");
    private String PrefixSubComandoRaw = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarRaw");
    private String PrefixSubComandoLive = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarLive");
    private String PrefixSubComandoPedirAjuda = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoPedirAjuda");

    public String getPrefixSubComandoRaw() {
        return PrefixSubComandoRaw;
    }
    public String getPrefixSubComandoNormal() {
        return PrefixSubComandoNormal;
    }
    public String getPrefixSubComandoLive() {
        return PrefixSubComandoLive;
    }
    public String getPrefixBroadcast() {
        return PrefixBroadcast;
    }
    public String getPermVIP() {
        return PermVIP;
    }
    public String getPermStreamer() {
        return PermStreamer;
    }
    public String getPermAdministrador() {
        return PermAdministrador;
    }
    public String getCmdSemPermissao() {
        return CmdSemPermissao;
    }
    public String getCmdIncompleto() {
        return CmdIncompleto;
    }
    public String getPrefixRaw() { return PrefixRaw; }
    public String getPermUser() {
        return PermUser;
    }
    public String getPrefixSubComandoPedirAjuda() {
        return PrefixSubComandoPedirAjuda;
    }

    /*
     *
     * Variáveis abaixo vão servir para aquisições específicas do plugin em relação ao jogador.
     * Elas foram feitas para economizar espaço na classe CommandoExecutar e ter uma visão boa.
     *
     */


    public int getJogadorPosX(CommandSender sender){
        try {
            return (int) Bukkit.getServer().getPlayer(sender.getName()).getLocation().getX();
        } catch (NullPointerException e){
            return 0;
        }
    }

    public int getJogadorPosY(CommandSender sender){
        try {
            return (int) Bukkit.getServer().getPlayer(sender.getName()).getLocation().getY();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public int getJogadorPosZ(CommandSender sender){
        try {
            return (int) Bukkit.getServer().getPlayer(sender.getName()).getLocation().getZ();
        } catch (NullPointerException e){
            return 0;
        }
    }

    public String getJogadorPosWorld(CommandSender sender){
        try {

            if (Bukkit.getServer().getPlayer(sender.getName()).getWorld().getName().equals("world_nether")){
            return "§6Nether§c";
            }
            if (Bukkit.getServer().getPlayer(sender.getName()).getWorld().getName().equals("world_end")){
                return "§6End§c";
            }
            if (Bukkit.getServer().getPlayer(sender.getName()).getWorld().getName().equals("world")){
                return "§6World§c";
            }

            return Bukkit.getServer().getPlayer(sender.getName()).getWorld().getName();

        } catch (NullPointerException e){
            return "CONSOLE";
        }
    }

    public String getJogadorLocalizationThis(CommandSender sender){
            return "O jogador " + sender.getName() + " está no mundo " + getJogadorPosWorld(sender) + " na localização: " + "X:" + getJogadorPosX(sender) + " Y:" + getJogadorPosY(sender) + " Z:" + getJogadorPosZ(sender);
        }
    }