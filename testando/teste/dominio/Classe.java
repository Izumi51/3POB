package testando.teste.dominio;

public class Classe {
    private int num1;    
    private int num2;    
    private int num3;
    
    public Classe (int num1, int num2, int num3)
    {
        super();
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // get 
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    // set
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }  

    public int soma(){
        return num1 + num2 + num3;
    }
}
