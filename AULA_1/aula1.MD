# Progamação Orientada a Objetos
![java](https://arquivo.devmedia.com.br/artigos/henrique_gasparotto/4_pilares_oo/image001.png)

## MVC - Model View Control:
- Pasta Modelo (classes);
- Pasta Visão (visão do usuário);
- Pasta Controle (tratamento de dados da visão e envio para o Modelo).


### Primeira classe de Hello World!
```java
package AULA_1; //equivale a pasta onde está o .java
//Visão Pública - Definição de Classe - Nome da Classe
public class HelloWorld {
    //Visão Pública - Não será alterado durante a exec - Não retorna valor - Nome do Método - Argumentos
    public static void main (String[] args) {

        System.out.println("Hello World!");
    }
}
```

> __Nome de Classe começa com maiúsculo.__ 

!comentar cod!
```Java
package AULA_1;
import java.until.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        int valor = 10;
        System.out.println("Valor: " + valor);

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int valor1 = leia.nextInt();//nextDouble-nextFloat-next(pega em carac)
        System.out.println("Digite outro valor:");
        int valor2 = leia.nextInt();
        int total = valor1 + valor2;
        System.out.println("Soma:" + total);
        leia.close();
    }
}
```
## Variaveis
- int 
- float
- double

```java
```