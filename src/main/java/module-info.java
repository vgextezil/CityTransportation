module com.example.citytransportation {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.citytransportation to javafx.fxml;
    exports com.example.citytransportation;
}