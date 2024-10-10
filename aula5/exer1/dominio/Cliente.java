package aula5.exer1.dominio;

public abstract class Cliente {
    protected String endereco;
    protected String telefone;

    public Cliente (String endereco, String telefone)
    {
        super();
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}