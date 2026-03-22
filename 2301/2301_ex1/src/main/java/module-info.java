module com.example._2301_ex1_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2301_ex1_ to javafx.fxml;
    exports com.example._2301_ex1_;
}