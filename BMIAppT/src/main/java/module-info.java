module com.ttt.bmiappt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ttt.bmiappt to javafx.fxml;
    exports com.ttt.bmiappt;
}
