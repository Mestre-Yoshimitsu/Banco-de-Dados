
package debian.trabalho;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class LocadoraController extends BaseController {
    @FXML
    private Label reportLabel;
    @FXML
    private void criarTabelas() {
        Tabelas tabela = Tabelas.getTabela();
        if (tabela.conectar()) {
            popUp(reportLabel, "Sucesso", true);
        } else {
            popUp(reportLabel,"Erro", false);
        }
    }
}
