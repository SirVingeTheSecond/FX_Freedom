module org.fxfreedom.fxfreedom {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.fxfreedom.fxfreedom to javafx.fxml;
    exports org.fxfreedom.fxfreedom;
}