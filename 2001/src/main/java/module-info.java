module com.example._2001_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2001_ to javafx.fxml;
    exports com.example._2001_;
}