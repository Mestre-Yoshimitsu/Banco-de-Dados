package debian.trabalho;

public class Aluguel {

    private String diaInicial;
    private String diaFinal;
    private double valorTotal;
    private int quilometragemInicial;
    private int quilometragemFinal;
    private boolean statusAluguel;

    //chaves estrangeiras
    private int idCarro;
    private int idCliente;

    public Aluguel(String dia_inicial, String dia_final, int quilometragem_inicial, int quilometragem_final, int idCarro, int idCliente) {
        this.diaInicial = dia_inicial;
        this.diaFinal = dia_final;
        this.quilometragemInicial = quilometragem_inicial;
        this.quilometragemFinal = quilometragem_final;
        this.idCarro = idCarro;
        this.idCliente = idCliente;
        statusAluguel = true;
    }

    public String getDiaInicial() {
        return diaInicial;
    }

    public String getDiaFinal() {
        return diaFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public int getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public boolean isStatusAluguel() {
        return statusAluguel;
    }

    public void setStatusAluguel(boolean statusAluguel) {
        this.statusAluguel = statusAluguel;
    }

}
