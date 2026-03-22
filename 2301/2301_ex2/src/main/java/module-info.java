module com.example._2301_ex2_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2301_ex2_ to javafx.fxml;
    exports com.example._2301_ex2_;
}