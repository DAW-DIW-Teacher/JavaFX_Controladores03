package com.example.changewindow;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ControladorB {

    @FXML
    private TextField fieldApellido;

    @FXML
    private TextField fieldDNI;

    @FXML
    private TextField fieldNombre;
    public void setUsuario(Usuario usuario) {
       fieldNombre.setText(usuario.getNombre());
       fieldApellido.setText(usuario.getApellido());
       fieldDNI.setText(usuario.getDni());
    }
}
