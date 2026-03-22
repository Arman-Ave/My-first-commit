module com.example._2201_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2201_ to javafx.fxml;
    exports com.example._2201_;
}