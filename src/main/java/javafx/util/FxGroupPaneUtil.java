package javafx.util;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;

/**
 * @author malaka Senanayake @ Creative IT
 */
public class FxGroupPaneUtil {

    static FXMLLoader loader;
    static Group root;
    //------------------------------------------------------------------------------------------------------------------

    public static Group setNew(URL fxmlPath) {
        root = new Group();
        try {
            loader = new FXMLLoader();
            loader.setLocation(fxmlPath);
            root = loader.load();
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);
        } catch (IOException ex) {
            System.err.println("[ERROR]" + ex.getMessage());
        }
        return root;
    }
    //------------------------------------------------------------------------------------------------------------------

    public static Group setNew(URL fxmlPath, Object controller) {
        root = new Group();
        try {
            loader = new FXMLLoader();
            loader.setLocation(fxmlPath);
            loader.setController(controller);
            root = loader.load();
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);
        } catch (IOException ex) {
            System.err.println("[ERROR]" + ex.getMessage());
        }
        return root;
    }
    //------------------------------------------------------------------------------------------------------------------
}
