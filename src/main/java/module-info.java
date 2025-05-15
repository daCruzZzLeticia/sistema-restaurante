module br.edu.uepb.restaurante.sistemarestaurante {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.uepb.restaurante to javafx.fxml;
    exports br.edu.uepb.restaurante;
}