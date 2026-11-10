package debian.trabalho;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tabelas {

    private static Tabelas tabela = new Tabelas();

    public static Tabelas getTabela() {
        return tabela;
    }
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

    public boolean conectar() {
        try {
            Connection conexao = ConfigBanco.getConnection();
            Statement comando = conexao.createStatement();
            comando.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
