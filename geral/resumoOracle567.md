```java
    for (int i = 0; i < partes.length(); i++)
    {
        System.out.print(partes[i]);
    }

    // for each :
    for (String unidade : partes)
    {
        System.out.print(unidade);
    }
```
```Java 
    try {

    } catch(exception e){

    }
```

```Java 
    // metodo de argumento variavel, no caso recebe qualquer quantidade de inteiros, uso mais apropriado no do array nesse caso pois para usar o array precisariamos saber qual o tamanho do arra
    // esse metodo funciona com os tipos primitivos objetos e arrays
    public int total (int ... nums)
    {
        int sum = 0;
        for (int i = 0; i < num.length; i++>)
        {
            sum += nums[i];
        }

        return sum;
    }
```

```Java
    // variaveis estaticas 
    public static final int MODEL_NUM = 883;
    // public se refere ao nivel de acesso
    // static diz que mesmo que haja 30 instancias de MODEL_NUM todas elas teram o mesmo valor 883
    // final define a variavel como uma constante, ou seja, nao podera/devera ser modificada
    // as variaveis estaticas que nao sao constantes podem ser modificadas

    // e possivel acessar as variaveis estaticas mesmo que nao haja instancias de uma classe, ex: 
    public static String food = "pizza";
    Human.food;
    // ClassName.VariableName
```

```Java
    // metodos estaticos
    // so podem acessar variaveis estaticas e nao variaveis de instancia ou nao estaticas
    // so podem acessar outros metodos estaticos e nao metodos de instancia ou nao estaticos
    // podem ser redefinidos em subclasses 
    
    // e possivel criar uma instancia de uma classe por meio do metodo estatico caso a classe use um construtor private, ex: 
    private Nesting ()
    {    }

    public static Nesting getInstance(){
        Nesting nest = new Nesting();
        return nest;
    }

    Nesting n1 = Nesting.getInstance
```

```Java
    // classe statica
    // so poderam existir dentro de outras classes e nao como classes independentes, essas sao chamadas de classes conteiner
    // podem extender comportamentos da classe conteiner

    public class Space
    {
        public static class Planet {
            public Planet()
            {   }
        }
    }
```

# Herança
Permite que classes herdem metodos e campos de outras classe, herdar significa receber algo de seu antecessor/pai

## SuperClasse
A classe mais generica no qual as outras classes derivam seus metodos e dados

## SubClasse
A classe mais especifica que e derivada ou herdada de outra classe (a superclasse)

```Java
    public class Crab extends Animal 
    {   }
```

## Regra da heranca Simples
> Significa que nao se pode declarar ou estender mais de uma superclasse por classe

# Encapsulamento
Diz respeito ao nivel de acesso concedido pela classe para acessar seus campos / metodos
Tipo   | Nivel
--------- | ------
Public | Todas a classes tem acesso
Private | Somente a propria classe 
Protected | Todas as subclasses e classes do mesmo pacote

# Polimorfismo
Subclasses podem "caber" dentro do tipo de referencia de uma Superclasse
![alt text](../assets/img16.png)

```Java 
    // um array e um conjunto de um mesmo tipo, portanto nao seria possivel fazer uma colecao de uma de uma classe estendida
    // mas e possivel fazer um array da superclasse, ja que, esta pode armazenar qualquer tipo de subclasse dela 
    // vamor supor que temos uma classe Funcionario e duas subclasses uma FunCLT e outra FunPJ, uma array seria feito da classe funcionario ja que poderia armazenar qualquer uma dos tipos

    Funcionario[] funci = new Funcionario[size];
```

# Metodo equals e toString 
equals() = verifica se duas referencias estao consultando um mesmo objeto 
toString() = retorna uma string que representa o objeto

# Classe Abstrata
Uma classe abstrata nao pode ser instanciada, pode apenas instanciar uma de suas subclasses
```Java
    Bycicle bike = new mountainBike();
    Bycicle bike2 = new roadBike();
    // nesse caso Bycicle continua servindo de referencia mas nao pode ser mais instanciado sem ser em uma de suas subclasses
```