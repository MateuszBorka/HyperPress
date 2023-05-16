module com.example.hyperpress {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.hyperpress to javafx.fxml;
    exports com.example.hyperpress;
    exports com.example.hyperpress.huffman1;
    opens com.example.hyperpress.huffman1 to javafx.fxml;
}
