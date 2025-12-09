package javafx.util;

import javafx.scene.control.Button;

/**
 * @author malaka senanayake @ Creative IT
 */
public class FxButtonUtil {
    //------------------------------------------------------------------------------------------------------------------
    private static final String DEFAULT_STYLE ;
    private static final String SELECTED_STYLE ;
    //------------------------------------------------------------------------------------------------------------------
    static {
        if (Configuration.getTheme().equals("LIGHT")){
            DEFAULT_STYLE = "-fx-background-color:rgba(0,0,0,0);";
            SELECTED_STYLE = "-fx-background-color:rgba(0,0,0,0.4);";
        }else {
            DEFAULT_STYLE = "-fx-background-color: rgba(0,0,0,0);";
            SELECTED_STYLE = "-fx-background-color:rgba(41,128,185 ,0.3);";
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public static void setSelectedBtn(Button[] otherButtons, Button button) {
        for (Button btn : otherButtons) {
            btn.setStyle(DEFAULT_STYLE);
        }
        button.setStyle(SELECTED_STYLE);
    }
    //------------------------------------------------------------------------------------------------------------------
}