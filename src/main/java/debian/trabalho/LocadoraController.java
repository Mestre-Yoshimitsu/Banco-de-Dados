
package debian.trabalho;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.fxml.FXML;


public class LocadoraController extends BaseController {
    @FXML
    private void criarTabelas() {
        Tabelas tabela = Tabelas.getTabela();
        try {
            Connection conexao = ConfigBanco.getConnection();
            Statement comando = conexao.createStatement();
            comando.executeUpdate(tabela.sql);
            AlertInformacao("Sucesso", "O comando foi executado com sucesso", "Tabelas criadas").showAndWait();
        } catch (SQLException e) {
            AlertErro("Erro!", "Falha ao executar o comando", e.getMessage()).showAndWait();
        }
    }
}
