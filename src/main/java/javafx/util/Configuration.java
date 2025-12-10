package javafx.util;

class Configuration {
    //------------------------------------------------------------------------------------------------------------------
    enum Theme {
        DARK,
        LIGHT,
    }
    //------------------------------------------------------------------------------------------------------------------
    public static final Theme theme = Theme.LIGHT; // By chaging this we can change all components theme.

    public static final String APP_ICON = "/image/common-app-icon.png";
    public static final String ALERT_LIGHT_THEME_STYLE = "/style/alertStyleLight.css";  //"/style/alertStyleDark.css";
    public static final String ALERT_DARK_THEME_STYLE = "/style/alertStyleDark.css";
    public static final String ALERT_TITLE = "";

    public static final String BUTTON_LIGHT_THEME_DEFAULT = "-fx-background-color:rgba(0,0,0,0);";
    public static final String BUTTON_LIGHT_THEME_SELECTED = "-fx-background-color:rgba(0,0,0,0.4);";

    public static final String BUTTON_DARK_THEME_DEFAULT = "-fx-background-color: rgba(0,0,0,0);";
    public static final String BUTTON_DARK_THEME_SELECTED = "-fx-background-color:rgba(41,128,185 ,0.3);";

    public static final String TEXTFIELD_LIGHT_THEME_DEFAULT = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    public static final String TEXTFIELD_LIGHT_THEME_ERROR = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

    public static final String TEXTFIELD_DARK_THEME_DEFAULT = "-fx-border-color:-border-colour;-fx-text-fill :-text-colour;";
    public static final String TEXTFIELD_DARK_THEME_ERROR = "-fx-border-color:-error-border-colour;-fx-text-fill :-error-text-colour;"; // error colour

}
