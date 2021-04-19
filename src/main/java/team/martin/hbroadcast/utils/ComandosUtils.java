package team.martin.hbroadcast.utils;

import team.martin.hbroadcast.hBroadcast;

//Variáveis Globais
public class ComandosUtils{

    //Prefixos
    private String PrefixBroadcast = hBroadcast.getInstance().getConfig().getString("PrefixoBroadcast");
    private String PrefixRaw = hBroadcast.getInstance().getConfig().getString("PrefixoRaw");

    //Permissões
    private String PermStreamer = hBroadcast.getInstance().getConfig().getString("PermissaoStreamer");
    private String PermAdministrador = hBroadcast.getInstance().getConfig().getString("PermissaoAdministrador");
    private String PermVIP = hBroadcast.getInstance().getConfig().getString("PermissaoVIP");

    //Comando
    private String CmdIncompleto = hBroadcast.getInstance().getConfig().getString("ComandoIncompleto");
    private String CmdSemPermissao = hBroadcast.getInstance().getConfig().getString("ComandoSemPermissao");

    //SubComandos
    private String PrefixSubComandoNormal = hBroadcast.getInstance().getConfig().getString("PrefixoSubComandoAnunciarNormal");
    private String PrefixSubComandoRaw = hBroadcast.getInstance().getConfig().getString("PrefixoSubComandoAnunciarRaw");
    private String PrefixSubComandoLive = hBroadcast.getInstance().getConfig().getString("PrefixoSubComandoAnunciarLive");

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