package aula6.echo.dominio;

public class Paciente {
    private int numero;
    private double peso;
    private double altura; 

    public Paciente (int num, double peso, double altura) {
        super();
        this.numero = num;
        this.peso = peso;
        this.altura = altura;
    }

    /* GET */
    public double getAltura() {
        return altura;
    }

    public int getNumero() {
        return numero;
    }

    public double getPeso() {
        return peso;
    }

    /* SET */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /* METODOS */
    public void listarPaciente() {
        System.out.println("\n\tNumero do paciente: " + numero + "\n\tPeso do paciente: " + peso + "\n\tAltura do paciente: " + altura);
    }
}
