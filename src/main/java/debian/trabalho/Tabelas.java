package debian.trabalho;

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
}
