package debian.trabalho;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController extends BaseController {

    @FXML
    private TextField urlTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    
    @FXML
    private void conectar() throws IOException {
        ConfigBanco.setUrl(urlTextField.getText());
        ConfigBanco.setUsername(usernameTextField.getText());
        ConfigBanco.setPassword(passwordTextField.getText());
        try {
            Connection conexao = ConfigBanco.getConnection();
            Launcher.setRoot("TabelasView");
            AlertInformacao("Sucesso", "O comando foi executado com sucesso", "Conexão bem sucedida").show();
        } catch (SQLException e) {
            AlertErro("Erro!", "Erro ao conectar ao banco de dados", e.getMessage()).showAndWait();
        }
    }
}
