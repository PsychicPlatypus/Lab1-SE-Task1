module com.softwareengineering.labtasks1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    exports com.softwareengineering.labtasks1.task1;
    opens com.softwareengineering.labtasks1.task1 to javafx.fxml;
}