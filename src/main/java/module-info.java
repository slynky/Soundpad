module org.slinky.soundpad.soundpad {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.slinky.soundpad.soundpad to javafx.fxml;
    opens org.slinky.soundpad.soundpad.frontend to javafx.fxml;

    exports org.slinky.soundpad.soundpad;
    exports org.slinky.soundpad.soundpad.frontend;
}