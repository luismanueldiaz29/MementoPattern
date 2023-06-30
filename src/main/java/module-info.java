module com.luis.mento.pattern.mementopattern2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.luis.mento.pattern.mementopattern2 to javafx.fxml;
    exports com.luis.mento.pattern.mementopattern2;
}