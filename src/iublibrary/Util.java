package iublibrary;

import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Window;

public class Util {
    private static Alert alert = new Alert(Alert.AlertType.WARNING);

    static {
        alert.initModality(Modality.WINDOW_MODAL);
    }

    public static void showAlert(Window window, String alertMessage) {
        alert.initOwner(window);
        alert.setContentText(alertMessage);
        alert.showAndWait();
    }
}