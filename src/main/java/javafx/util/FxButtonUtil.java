package javafx.util;

import javafx.scene.control.Button;

/**
 * @author malaka senanayake @ mavora IT
 */
public class FxButtonUtil {
    //------------------------------------------------------------------------------------------------------------------
    private static final String DEFAULT_STYLE ;
    private static final String SELECTED_STYLE ;
    //------------------------------------------------------------------------------------------------------------------
    static {
        if (Configuration.theme== Configuration.Theme.LIGHT){
            DEFAULT_STYLE = Configuration.BUTTON_LIGHT_THEME_DEFAULT;
            SELECTED_STYLE = Configuration.BUTTON_LIGHT_THEME_SELECTED;
        }else {
            DEFAULT_STYLE = Configuration.BUTTON_DARK_THEME_DEFAULT;
            SELECTED_STYLE = Configuration.BUTTON_DARK_THEME_SELECTED;
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