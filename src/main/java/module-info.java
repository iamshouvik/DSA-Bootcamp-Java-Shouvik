module com.shouvik.dsabootcampjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shouvik.dsabootcampjava to javafx.fxml;
    exports com.shouvik.dsabootcampjava;
}