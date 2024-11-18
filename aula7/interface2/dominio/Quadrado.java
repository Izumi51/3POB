package aula7.interface2.dominio;

public class Quadrado implements FiguraGeo {
    private int lado;

    //construct
    public Quadrado (int lado) {
        this.lado = lado;
    }

    //get
    public int getLado() {
        return lado;
    }

    //set
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
    @Override
    public int getArea() {
        return lado * lado;
    }
    @Override
    public int getPerimetro() {
        return lado * 4;
    }
}
