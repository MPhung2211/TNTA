package daihocmo.tracnghiemtienganh;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class PrimaryController {

//    @FXML
//    private void switchToSecondary() throws IOException {
//        App.setRoot("secondary");
//    }
    public void checkHandler(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hello World!", ButtonType.OK);
        alert.show();
    }
    
}
