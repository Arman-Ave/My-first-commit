module com.example._2301_ex3_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2301_ex3_ to javafx.fxml;
    exports com.example._2301_ex3_;
}