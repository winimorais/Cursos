package operadoresaritimeticos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

//        Operadores Aritiméticos
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);

//        Operadores Unários
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);

//        Operadores de Atribuição
        int x = 4;
        x *= 2;
        System.out.println(x);

//        Classe Math
        int ar = (int) Math.round(v);
        System.out.println(ar);

//        Gerador de Números
        double ale = Math.random();
        int n = (int) (15 + ale * (50 - 15));
        System.out.println(n);
    }

}
