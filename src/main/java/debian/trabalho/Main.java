package debian.trabalho;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Tabelas tabela = new Tabelas();
        tabela.conectar();
        
        
        try {
            Connection conexao = ConfigBanco.getConnection();
            System.out.println("Conexão Aura");
        } catch (SQLException e) {
            System.out.println("Deu errado, chapa. Aqui o por quê: " + e.getMessage());
        }
    }
}
