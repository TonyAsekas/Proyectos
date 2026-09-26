import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    do{
        System.out.println("Bienvenido a tu calculadora personal, escoge una opción: ");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Resto");
        System.out.println("6- Salir");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Indícame el primer número: ");
                int numSuma1 = sc.nextInt();
                System.out.println("Indícame el segundo número: ");
                int numSuma2 = sc.nextInt();
                int suma = numSuma1 + numSuma2;
                System.out.println(suma);
                break;
            case 2:
                System.out.println("Indícame el primer número: ");
                int numResta1 = sc.nextInt();
                System.out.println("Indícame el segundo número: ");
                int numResta2 = sc.nextInt();
                int resta = numResta1 - numResta2;
                System.out.println(resta);
                break;
            case 3:
                System.out.println("Indícame el primer número: ");
                int numMulti1 = sc.nextInt();
                System.out.println("Indícame el segundo número: ");
                int numMulti2 = sc.nextInt();
                int multiplicacion = numMulti1 * numMulti2;
                System.out.println(multiplicacion);
                break;
            case 4:
                System.out.println("Indícame el primer número: ");
                double numDivi1 = sc.nextInt();
                System.out.println("Indícame el segundo número: ");
                double numDivi2 = sc.nextInt();
                    if(numDivi2 != 0){
                        double division = numDivi1 / numDivi2;
                        System.out.println(division);
                        break;
                    } else {
                        System.out.println("System error");
                        break;
                    }
            case 5:
                System.out.println("Indícame el primer número: ");
                int numResto1 = sc.nextInt();
                System.out.println("Indícame el segundo número: ");
                int numResto2 = sc.nextInt();
                    if (numResto2 != 0){
                        int resto = numResto1 % numResto2;
                        System.out.println(resto);
                        break;
                    }else{
                        System.out.println("System error");
                        break;
                    }
            case 6:
                System.out.println("Saliendo de la calculadora, hasta pronto!");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                break;
        }
    }while(opcion != 6);

    }

}



