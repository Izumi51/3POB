package aula7.interface2.dominio;

public class Triangulo implements FiguraGeo {
    private int altura;
    private int base;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    //construct
    public Triangulo (int altura, int base, int ladoA, int ladoB, int ladoC) {
        this.altura = altura;
        this.base = base;
        this.ladoA = ladoA;
        this.ladoC = ladoC;
        this.ladoB = ladoB;
    }

    //get
    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }
    
    public int getLadoC() {
        return ladoC;
    }

    //set
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }
    @Override
    public int getArea() {
        return (base*altura)/2;
    }
    @Override
    public int getPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
