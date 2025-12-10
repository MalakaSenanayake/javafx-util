package javafx.util;

import javafx.scene.control.CheckBox;

/**
 * @author malaka senanayake @ Creative IT
 */
public class FxCheckboxUtil {
    //------------------------------------------------------------------------------------------------------------------

    public static void setSelection(CheckBox checkbox, String permission) {
        if (permission.equals("0")) {
            checkbox.setSelected(false);
        } else if (permission.equals("1")) {
            checkbox.setSelected(true);
        } else {
            System.err.println("[INFO]" + "set Selection problem");
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    public static String getSelection(CheckBox checkbox) {
        String permition = "0";
        if (checkbox.isSelected()) {
            permition = "1";
        } else if (!checkbox.isSelected()) {
            permition = "0";
        }
        return permition;
    }
    //------------------------------------------------------------------------------------------------------------------
}
