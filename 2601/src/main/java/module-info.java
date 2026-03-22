module com.example._2601_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2601_ to javafx.fxml;
    exports com.example._2601_;
}