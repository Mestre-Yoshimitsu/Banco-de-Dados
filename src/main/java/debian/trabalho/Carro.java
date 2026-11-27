package debian.trabalho;

public class Carro {

    private int idCarro;
    private String modelo;
    private String marca;
    private String tipo;
    private int quilometragem;
    private int ano;
    private String placa;
    private double valorDiaria;
    private boolean status;

    public Carro(String modelo, String marca, String tipo, int quilometragem, int ano, String placa, double valorDiaria) {

        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.quilometragem = quilometragem;
        this.ano = ano;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        status = true;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
