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
                    if(tasks.isEmpty()){
                        System.out.println("Lista de tareas vacía");
                        }
                    else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                    break;
                case 2:
                 System.out.println("Que tarea quieres cambiar? (índica el índice de la tarea)");
                   int modTask = sc.nextInt();
                   int index = modTask - 1;
                    if(index >= 0 && index < tasks.size()){sc.nextLine();
                    System.out.println("Indica la modificacionde la tarea: ");
                    String updateTask = sc.nextLine();
                    tasks.set(index, updateTask);
                   }
                  else {
                      System.out.println("El número de tarea introducido no existe");
                  }
                  break;
                case 3:
                    System.out.println("Escribe la nueva tarea:");
                    sc.nextLine();
                    String newTask = sc.nextLine();
                    tasks.add(newTask);
                    System.out.println("Tarea añadida con éxito");
                    break;
                case 4:
                    System.out.println("¿Qué tarea quieres eliminar? (Indica el número)");
                    int deleteTask = sc.nextInt();
                    index = deleteTask - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("¡Tarea eliminada!");
                    } else {
                        System.out.println("El número de tarea introducido no existe.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo.........");
                    System.exit(0);
            }
        }while(option != 5);
    }
}