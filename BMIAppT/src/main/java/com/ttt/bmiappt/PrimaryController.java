package com.ttt.bmiappt;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 10;
        App.setRoot("secondary");
    }
}
