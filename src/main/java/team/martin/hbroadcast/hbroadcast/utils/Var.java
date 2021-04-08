package team.martin.hbroadcast.hbroadcast.utils;

import team.martin.hbroadcast.hbroadcast.hBroadcast;

public class Var {
    //Variáveis Globais
    public static String version = "1.2"; //TODO, Aplicar versão globalmente.
    public static String prefix = hBroadcast.instancia.getConfig().getString("prefix") + " ";
    public static String permissionadmin = hBroadcast.instancia.getConfig().getString("PermissaoAdmin");
    public static String semPermissao = hBroadcast.instancia.getConfig().getString("FraseSemPermissao");
    public static String comandoIncompleto = hBroadcast.instancia.getConfig().getString("FraseComandoIncompleto");

    /*

    Estou utilizando o método getConfig para pegar alguma String(Dado) da configuração padrão config.yml.

     */
}