module Sort {
	requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens  visual to javafx.fxml;
    exports visual;
}