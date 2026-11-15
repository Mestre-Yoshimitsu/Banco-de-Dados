/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debian.mavenproject2;

import java.sql.*;

/**
 *
 * @author edu
 */
public class Tabelas {

    public static void criarTabela() {

        String sql = """
            CREATE TABLE IF NOT EXISTS carro (
                id SERIAL PRIMARY KEY,
                modelo VARCHAR(100) NOT NULL,
                marca VARCHAR(60) NOT NULL,
                ano INTEGER NOT NULL,
                valor_diaria NUMERIC(10,2) NOT NULL,
                disponivel BOOLEAN DEFAULT TRUE
            );
        """;

        try (
                Connection Conexao = ConfigBanco.getConnection(); Statement comando = Conexao.createStatement()) {

            comando.executeUpdate(sql);

            System.out.println("Tabela carro criada com sucesso!");

        } catch (SQLException e) {

            System.out.println("Erro ao criar tabela: " + e.getMessage());

        }
    }

}
