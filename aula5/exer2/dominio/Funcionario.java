package aula5.exer2.dominio;

public class Funcionario {
    protected String matricula;
    protected String cpf;
    protected String nome;
    protected float salario;

    public Funcionario (String matricula, String cpf, String nome, float salario)
    {
        super();
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
