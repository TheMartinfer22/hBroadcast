package team.martin.hbroadcast.utils;

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

    //Comando
    private String CmdIncompleto = hBroadcast.getPluginMainClass().getConfig().getString("ComandoIncompleto");
    private String CmdSemPermissao = hBroadcast.getPluginMainClass().getConfig().getString("ComandoSemPermissao");

    //SubComandos
    private String PrefixSubComandoNormal = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarNormal");
    private String PrefixSubComandoRaw = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarRaw");
    private String PrefixSubComandoLive = hBroadcast.getPluginMainClass().getConfig().getString("PrefixoSubComandoAnunciarLive");

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
}