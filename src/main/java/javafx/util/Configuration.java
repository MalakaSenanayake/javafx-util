package javafx.util;

 class  Configuration {
    private static final String theme = "LIGHT";//DARK
    private static final String appIcon = "/image/common-app-icon.png";
    private static final String alertTitle = "";

    //Getters-----------------------------------------------------------------------------------------------------------
    public static String getTheme() {
        return theme;//DARK
    }
    public static String getAppIcon() {
        return appIcon;
    }
    public static String getAlertTitle() {
        return alertTitle;
    }
}
