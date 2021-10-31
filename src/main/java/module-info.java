module com.geronimo.crud_con_dao {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.geronimo.crud_con_dao to javafx.fxml;
    exports com.geronimo.crud_con_dao;
}
