/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.theunknowname06.hilling;

/**
 *
 * @author anjay
 */
public class HILLING {
    
    private static String tEmail = "";
    private static String tPass = "";
    private static String tName = "";
    
    public static void main(String[] args) {
        
        register pg_register = new register(tName,tPass,tEmail);
        
        pg_register.show_register();
//        login pg_login = new login(tName,tPass,tEmail);
//        pg_login.show_login();
//        menuUtama mU = new menuUtama(tName,tPass,tEmail);
//        
//        mU.show_register();
    }
}
