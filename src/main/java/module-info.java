module br.com.techfast.techfast {
    requires javafx.controls;
    requires javafx.fxml;


    exports br.com.techfast;
    opens br.com.techfast to javafx.fxml;
    exports br.com.techfast.controller;
    opens br.com.techfast.controller to javafx.fxml;
}