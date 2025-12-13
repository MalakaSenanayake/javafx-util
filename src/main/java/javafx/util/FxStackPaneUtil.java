package javafx.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;

/**
 * @author malaka senanayake @ mavora IT
 *
 */
public class FxStackPaneUtil {

    static FXMLLoader fxmlLoader;
    static StackPane homeRoot = new StackPane();

    //------------------------------------------------------------------------------------------------------------------
    static {
        FxMessageUtil.themeConfigurationMsg();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static StackPane setNew(URL fxmlPath) throws Exception {
        try {
            fxmlLoader = new FXMLLoader(fxmlPath);
            Parent view = fxmlLoader.load();
            homeRoot.getChildren().clear();
            homeRoot.getChildren().add(view);
        } catch (IOException ex) {
            System.err.println("Error loading FXML: " + ex.getMessage());
        }

        return homeRoot;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static StackPane setNew(URL fxmlPath, Object controller) throws Exception {
        try {
            fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(fxmlPath);
            fxmlLoader.setController(controller);
            Parent view = fxmlLoader.load();
            homeRoot.getChildren().clear();
            homeRoot.getChildren().add(view);
        } catch (IOException ex) {
            Print.error(ex.getMessage());
        }

        return homeRoot;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void setPageToLoadingSpace(URL fxmlPath, StackPane pageLoadingSpace) throws Exception {
        try {
            StackPane invoiceMain = FxStackPaneUtil.setNew(fxmlPath);
            FxAnimationUtil.setFade(invoiceMain);
            pageLoadingSpace.getChildren().clear();
            pageLoadingSpace.getChildren().add(invoiceMain);
        } catch (Exception ex) {
            Print.error(ex.getMessage());
        }
    }

    // Common method for all -------------------------------------------------------------------------------------------
    private static void setLoader(URL fxmlPath) throws IOException {
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(fxmlPath);
        homeRoot = fxmlLoader.load();
    }
    //------------------------------------------------------------------------------------------------------------------
}
