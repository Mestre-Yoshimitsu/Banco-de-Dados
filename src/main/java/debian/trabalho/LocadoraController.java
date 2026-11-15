package debian.trabalho;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LocadoraController extends BaseController {

    @FXML
    private TextField modeloTextField;
    @FXML
    private TextField marcaTextField;
    @FXML
    private TextField anoTextField;
    @FXML
    private TextField placaTextField;
    @FXML
    private TextField valorTextField;

    @FXML
    public void criarCarro() {
        try {
            if(modeloTextField.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Modelo não pode ser vazio");
            }
            if(marcaTextField.getText().trim().isEmpty()){
                throw new IllegalArgumentException("Marca não pode ser vazio");
            }
            Integer.parseInt(anoTextField.getText().trim());
            if(placaTextField.getText().trim().isEmpty()){
                throw new IllegalArgumentException("Placa não pode ser vazio");
            }
            Double.parseDouble(valorTextField.getText().trim());
            Carro carro = new Carro(modeloTextField.getText(), marcaTextField.getText(), Integer.parseInt(anoTextField.getText().trim()), placaTextField.getText(), Double.parseDouble(valorTextField.getText().trim()));
            cadastrarCarro(carro);
    
        } catch (IllegalArgumentException e) {
            AlertErro("Erro!", "Falha ao executar o comando", e.getMessage()).showAndWait();
        }
    }

    public void cadastrarCarro(Carro carro) {

        String sqlScript = """
            INSERT INTO carro
            (modelo, marca, ano,placa, valor_diaria)
            VALUES (?, ?, ?, ?,?)
        """;

        try (
                Connection Conexao = ConfigBanco.getConnection(); PreparedStatement comando = Conexao.prepareStatement(sqlScript)) {

            comando.setString(1, carro.modelo);
            comando.setString(2, carro.marca);
            comando.setInt(3, carro.ano);
            comando.setString(4, carro.placa);
            comando.setDouble(5, carro.valorDiaria);

            comando.executeUpdate();

            AlertInformacao("Sucesso", "O comando foi executado com sucesso", "Carro cadastrado com sucesso!").show();

        } catch (SQLException e) {

            AlertErro("Erro!", "Falha ao executar o comando", e.getMessage()).showAndWait();

        }
    }

}
