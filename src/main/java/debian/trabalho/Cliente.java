package debian.trabalho;

public class Cliente {

    private int idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String cnh;
    private String cartaoCredito;
    private String cpf;

    public Cliente(String nome, String email, String telefone, String endereco, String cnh, String cartaoCredito, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnh = cnh;
        this.cartaoCredito = cartaoCredito;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCnh() {
        return cnh;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public String getCpf() {
        return cpf;
    }

}
