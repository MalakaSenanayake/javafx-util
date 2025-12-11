package javafx.util;

public class Configuration {
    //------------------------------------------------------------------------------------------------------------------
    public static  Theme theme = Theme.LIGHT;
    public static  String appIcon = "/image/app-icon.png";
    public static  String alertTitle = "";
    //------------------------------------------------------------------------------------------------------------------
    public enum Theme {
        DARK,
        LIGHT,
    }

    // -----------------------------------------------------------------------------------------------------------------
    public static Theme getTheme() {
        return theme;
    }

    public static void setTheme(Theme theme) {
        Configuration.theme = theme;
    }

    public static String getAppIcon() {
        return appIcon;
    }

    public static void setAppIcon(String appIcon) {
        Configuration.appIcon = appIcon;
    }

    public static String getAlertTitle() {
        return alertTitle;
    }

    public static void setAlertTitle(String alertTitle) {
        Configuration.alertTitle = alertTitle;
    }
// Styles --------------------------------------------------------------------------------------------------------------
    public static final String ALERT_LIGHT_THEME_STYLE = "/style/alertStyleLight.css";  //"/style/alertStyleDark.css";
    public static final String ALERT_DARK_THEME_STYLE = "/style/alertStyleDark.css";

    public static final String BUTTON_LIGHT_THEME_DEFAULT_STYLE = "-fx-background-color:rgba(0,0,0,0);";
    public static final String BUTTON_LIGHT_THEME_SELECTED_STYLE = "-fx-background-color:rgba(0,0,0,0.4);";

    public static final String BUTTON_DARK_THEME_DEFAULT_STYLE = "-fx-background-color: rgba(0,0,0,0);";
    public static final String BUTTON_DARK_THEME_SELECTED_STYLE = "-fx-background-color:rgba(41,128,185 ,0.3);";

    public static final String TEXTFIELD_LIGHT_THEME_DEFAULT_STYLE = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    public static final String TEXTFIELD_LIGHT_THEME_ERROR_STYLE = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

    public static final String TEXTFIELD_DARK_THEME_DEFAULT_STYLE = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    public static final String TEXTFIELD_DARK_THEME_ERROR_STYLE = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

    public static final String REGION_PANE_STYLE =  "-fx-background: transparent;-fx-background-color: rgba(0, 0, 0, 0.4);";

//----------------------------------------------------------------------------------------------------------------------
}
