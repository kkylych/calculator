module com.example.calculator_two {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_two to javafx.fxml;
    exports com.example.calculator_two;
}