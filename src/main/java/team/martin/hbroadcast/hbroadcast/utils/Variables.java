package team.martin.hbroadcast.hbroadcast.utils;

import team.martin.hbroadcast.hbroadcast.hBroadcast;

//Variáveis Globais
public class Variables {

    /*
    Estou utilizando o método getConfig para pegar alguma String(caminho) da configuração padrão config.yml.
     */
    public static String prefix = hBroadcast.getInstance().getConfig().getString("prefix") + " ";
    public static String adminPermission = hBroadcast.getInstance().getConfig().getString("PermissaoAdmin");
    public static String withoutPermission = hBroadcast.getInstance().getConfig().getString("FraseSemPermissao");
    public static String incompleteCommand = hBroadcast.getInstance().getConfig().getString("FraseComandoIncompleto");
}