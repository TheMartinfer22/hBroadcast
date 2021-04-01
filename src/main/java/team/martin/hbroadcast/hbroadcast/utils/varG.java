package team.martin.hbroadcast.hbroadcast.utils;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import team.martin.hbroadcast.hbroadcast.hBroadcast;

public class varG {

    //Var
    public static String version = "1.2";
    public static String prefix = hBroadcast.instancia.getConfig().getString("prefix") + " ";
    public static String permissionadmin = hBroadcast.instancia.getConfig().getString("PermissaoAdmin");
    public static String semPermissao = hBroadcast.instancia.getConfig().getString("FraseSemPermissao");
    public static String comandoIncompleto = hBroadcast.instancia.getConfig().getString("FraseComandoIncompleto");

}
