module br.edu.uepb.sistemarestaurante.sistemarestaurante {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.uepb.sistemarestaurante to javafx.fxml;
    exports br.edu.uepb.sistemarestaurante;
}