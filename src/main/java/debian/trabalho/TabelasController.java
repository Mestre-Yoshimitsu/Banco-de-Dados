package debian.trabalho;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TabelasController extends BaseController {

    @FXML
    private TextArea tabelasTextArea;

    @FXML
    public void criarTabela() throws IOException, SQLException {

        String sqlScript = tabelasTextArea.getText();

        try (
                Connection conexao = ConfigBanco.getConnection(); Statement comando = conexao.createStatement()) {

            comando.executeUpdate(sqlScript);

            AlertInformacao("Sucesso", "O comando foi executado com sucesso", "Tabela criada com sucesso!").show();
            Launcher.setRoot("LocadoraView");
        } catch (SQLException e) {
            AlertErro("Erro!", "Falha ao executar o comando", e.getMessage()).showAndWait();

        }
    }
}
