module com.example._2101_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2101_ to javafx.fxml;
    exports com.example._2101_;
}