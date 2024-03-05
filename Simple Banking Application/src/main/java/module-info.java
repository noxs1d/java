module org.example.bankingapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bankingapplication to javafx.fxml;
    exports org.example.bankingapplication;
}