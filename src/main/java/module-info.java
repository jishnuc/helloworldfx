module helloworldfx {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;
    opens  com.github.jishnuc.javafx to javafx.fxml;
    exports com.github.jishnuc.javafx;
}