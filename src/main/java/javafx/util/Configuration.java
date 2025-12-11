package javafx.util;

public class Configuration {
    //------------------------------------------------------------------------------------------------------------------
    private static Theme theme = Theme.LIGHT;
    private static String appIcon = "/image/app-icon.png";
    private static String alertTitle = "";

    //------------------------------------------------------------------------------------------------------------------
    public enum Theme {
        DARK,
        LIGHT,
    }

    // -----------------------------------------------------------------------------------------------------------------
    static Theme getTheme() {
        return theme;
    }

    public static void setTheme(Theme theme) {
        Configuration.theme = theme;
    }

    static String getAppIcon() {
        return appIcon;
    }

    public static void setAppIcon(String appIcon) {
        Configuration.appIcon = appIcon;
    }

    static String getAlertTitle() {
        return alertTitle;
    }

    public static void setAlertTitle(String alertTitle) {
        Configuration.alertTitle = alertTitle;
    }

    // Styles --------------------------------------------------------------------------------------------------------------
    static final String ALERT_LIGHT_THEME_STYLE = "/style/alertStyleLight.css";  //"/style/alertStyleDark.css";
    static final String ALERT_DARK_THEME_STYLE = "/style/alertStyleDark.css";

    static final String BUTTON_LIGHT_THEME_DEFAULT_STYLE = "-fx-background-color:rgba(0,0,0,0);";
    static final String BUTTON_LIGHT_THEME_SELECTED_STYLE = "-fx-background-color:rgba(0,0,0,0.4);";

    static final String BUTTON_DARK_THEME_DEFAULT_STYLE = "-fx-background-color: rgba(0,0,0,0);";
    static final String BUTTON_DARK_THEME_SELECTED_STYLE = "-fx-background-color:rgba(41,128,185 ,0.3);";

    static final String TEXTFIELD_LIGHT_THEME_DEFAULT_STYLE = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    static final String TEXTFIELD_LIGHT_THEME_ERROR_STYLE = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

    static final String TEXTFIELD_DARK_THEME_DEFAULT_STYLE = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    static final String TEXTFIELD_DARK_THEME_ERROR_STYLE = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

    static final String REGION_PANE_STYLE = "-fx-background: transparent;-fx-background-color: rgba(0, 0, 0, 0.4);";

//----------------------------------------------------------------------------------------------------------------------
}
