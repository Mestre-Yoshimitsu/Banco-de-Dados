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

    String sql = """
                 create table if not exists carro(
                 id serial primary key,
                 modelo varchar(200),
                 marca varchar(200),
                 ano integer,
                 placa varchar(8),
                 valor_diaria numeric(10,2),
                 disponivel boolean default true
                 );
                 
                 """;

    public void conectar() {
        try {
            Connection conexao = ConfigBanco.getConnection();
    Statement comando = conexao.createStatement();
            comando.executeUpdate(sql);
            System.out.println("Sucesso");
    }
            catch (SQLException e) {
            System.out.println("Deu errado");
}
    }

    
}

