module com.stempien.umieszliczyc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.stempien.umieszliczyc to javafx.fxml;
    exports com.stempien.umieszliczyc;
}