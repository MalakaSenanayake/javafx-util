package javafx.util;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 * @author Convert to Markdown documentation comment
 *
 */
public class FxAnchorPaneUtil {

    static FXMLLoader fxmlLoader;
    static AnchorPane homeRoot;

    //------------------------------------------------------------------------------------------------------------------
    static {
        homeRoot = new AnchorPane();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static AnchorPane setNew(URL fxmlPath) throws Exception {
        try {
            setLoader(fxmlPath);
            AnchorPane.setTopAnchor(homeRoot, 0.0);
            AnchorPane.setBottomAnchor(homeRoot, 0.0);
            AnchorPane.setLeftAnchor(homeRoot, 0.0);
            AnchorPane.setRightAnchor(homeRoot, 0.0);
        } catch (IOException ex) {
            System.out.println("ex - " + ex);
        }
        return homeRoot;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static AnchorPane setNew(URL fxmlPath, Object controller) throws Exception {
        try {
            fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(fxmlPath);
            fxmlLoader.setController(controller);
            homeRoot = fxmlLoader.load();
            AnchorPane.setTopAnchor(homeRoot, 0.0);
            AnchorPane.setBottomAnchor(homeRoot, 0.0);
            AnchorPane.setLeftAnchor(homeRoot, 0.0);
            AnchorPane.setRightAnchor(homeRoot, 0.0);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return homeRoot;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void setPageToLoadingSpace(URL fxmlPath, AnchorPane pageLoadingSpace) throws Exception {
        try {
            AnchorPane invoiceMain = FxAnchorPaneUtil.setNew(fxmlPath);
            FxAnimationUtil.setFade(invoiceMain);
            pageLoadingSpace.getChildren().clear();
            pageLoadingSpace.getChildren().add(invoiceMain);
        } catch (Exception exception) {
            System.out.println("[ERROR] Exception at AnchorPaneUtil Class " + exception);
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
