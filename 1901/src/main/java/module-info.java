module com.example._1901_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._1901_ to javafx.fxml;
    exports com.example._1901_;
}