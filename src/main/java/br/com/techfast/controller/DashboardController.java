package br.com.techfast.controller;

import br.com.techfast.util.SessionManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class DashboardController {

    @FXML
    private Button btnUsuarios;

    @FXML
    private AnchorPane painelCentral;

    public void inicialize() {
        if(!SessionManager.isGerente()) {
            btnUsuarios.setVisible(false);
        }
    }

    @FXML
    private void abrirDashboard() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/br/com/techfast/view/fxml/dashboard.fxml"));
    }

    @FXML
    private void abrirUsuarios() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/br/com/techfast/view/fxml/usuario.fxml"));
    }

}
