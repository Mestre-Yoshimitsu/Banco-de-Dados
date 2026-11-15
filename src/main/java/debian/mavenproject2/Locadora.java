/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debian.mavenproject2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author edu
 */
public class Locadora {
    public void cadastrarCarro(Carro carro) {

        String sql = """
            INSERT INTO carro
            (modelo, marca, ano,placa, valor_diaria)
            VALUES (?, ?, ?, ?,?)
        """;

        try (
            Connection Conexao = ConfigBanco.getConnection();
            PreparedStatement comando = Conexao.prepareStatement(sql)
        ) {

            comando.setString(1, carro.modelo);
            comando.setString(2, carro.marca);
            comando.setInt(3, carro.ano);
            comando.setString(4, carro.placa);
            comando.setDouble(5, carro.valorDiaria);

            comando.executeUpdate();

            System.out.println("Carro cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println("Erro ao cadastrar carro: " + e.getMessage());

        }
    }
}
