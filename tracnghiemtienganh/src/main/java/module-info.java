module daihocmo.tracnghiemtienganh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens daihocmo.tracnghiemtienganh to javafx.fxml;
    exports daihocmo.tracnghiemtienganh;
}
