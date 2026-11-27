package debian.trabalho;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AluguelController extends BaseController {

    @FXML
    private TextField diaInicialTextField;
    @FXML
    private TextField diaFinalTextField;
    @FXML
    private TextField quilometragemITextField;
    @FXML
    private TextField quilometragemFTextField;
    @FXML
    private TextField idCarroTextField;
    @FXML
    private TextField idClienteTextField;

    @FXML
    private void cadastrarAluguel() {
        try {
            if (diaInicialTextField.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Dia inicial não pode ser vazio");
            }
            if (diaFinalTextField.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Dia final não pode ser vazio");
            }
            Integer.parseInt(quilometragemITextField.getText().trim());
            Integer.parseInt(quilometragemFTextField.getText().trim());
            Integer.parseInt(idCarroTextField.getText().trim());
            Integer.parseInt(idClienteTextField.getText().trim());

            Aluguel aluguel = new Aluguel(diaInicialTextField.getText().trim(),
                    diaFinalTextField.getText(), Integer.parseInt(quilometragemITextField.getText().trim()),
                    Integer.parseInt(quilometragemFTextField.getText().trim()),
                    Integer.parseInt(idCarroTextField.getText().trim()), Integer.parseInt(idClienteTextField.getText().trim()));
            cadastrarAluguel();

        } catch (IllegalArgumentException e) {
            AlertErro("Erro!", "Falha ao executar o comando", e.getMessage()).showAndWait();
        }
    }

    public void cadastrarAluguel(Aluguel aluguel) {
        AlertErro("Falha", "Falha na execução", "Funcionalidade ainda não suportada");
    }
}
