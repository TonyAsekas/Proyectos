import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        ArrayList<String> tasks = new ArrayList<>();

        do{

            System.out.println("ToDoList-u, que quieres hacer?");
            System.out.println("1- Ver tareas");
            System.out.println("2- Modificar tareas");
            System.out.println("3- Agregar tareas");
            System.out.println("4- Eliminar tareas");
            System.out.println("5- Salir");
            option = sc.nextInt();

            switch (option){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
            }
        }while(option != 5);
    }
}