/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.util;

/**
 * @author Malaka SENANAYAKE
 */
public class FxMessageUtil {
    //------------------------------------------------------------------------------------------------------------------
    public static String getAccountCreateMsg(String userName, String password) {
        return "- Login credentials -"
                + " User Name - " + userName + " "
                + " Password - " + password + " (Onetime password)";
    }

    //------------------------------------------------------------------------------------------------------------------
    protected static void themeConfigurationMsg() {
        Print.info("---------------------------------------------------------------");
        Print.info("To change app icon, Theme, Alert title Use Configuration Class");
        Print.info("---------------------------------------------------------------");
    }
    //------------------------------------------------------------------------------------------------------------------
}
