
package debian.trabalho;

import javafx.fxml.FXML;


public class LocadoraController extends BaseController {
    @FXML
    private void criarTabelas() {
        Tabelas tabela = Tabelas.getTabela();
        tabela.conectar();
    }
}
