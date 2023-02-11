import java.util.*;

/**
 * @author Joel Layedra
 */

public class App {
    
    // Declaring variables
    private List lst;
    private int info = 11;
    private int initialInfo = 0;
    private String menu;
    private Scanner sc;

    // The constructor of the class App.
    public App(){
        
        this.lst = new List();
        this.sc = new Scanner(System.in);
        this.menu =

        // A menu that is displayed to the user.
        "Listas enlazadas Simples \n" +
        "1. Crear lista \n" +
        "2. Imprimir lista \n" +
        "3. Agregar Nodos al inicio \n" +
        "4. Agregar Nodos al final \n" +
        "5. Buscar Nodo \n" +
        "6. Borrar Nodo inicial \n" +
        "7. Borrar Nodo final \n" +
        "8. Salir \n";
    }

    /**
     * The function `displayMenu()` displays a menu of options to the user, and then executes the
     * corresponding function based on the user's input
     */
    public void displayMenu(){
       int number = 0;
       do{
        System.out.println(menu);
        number = sc.nextInt();
        switch (number){
            case 1:this.createList(); break;
            case 2:System.out.println(this.lst.print()); break;
            case 3:this.unshiftNode(); break;
            case 4:this.pushNode(); break;
            case 5:this.searchNode(); break;
            case 6:this.shiftNode(); break;
            case 7:this.popNode(); break;
            case 8:System.out.println("Goodbye"); break;
            default:System.out.println("Opcion incorrecta"); break;
        }
       } while(number != 8);
    }
    
   /**
    * The function creates a list and pushes 10 elements into it
    */
    public void createList(){
        this.lst = new List();
         for(int info = 1; info<=10; info++)
            this.lst.push(info);
        System.out.println(this.lst.print());
    }

   /**
    * This function adds a new node to the beginning of the list
    */
    public void unshiftNode(){
        this.lst.unshift(initialInfo);
        --initialInfo;
        System.out.println(this.lst.print());
    }

   /**
    * It pushes a node to the stack.
    */
    public void pushNode(){
        info++;
        this.lst.push(info);
        System.out.println(this.lst.print());
    }

 // Searching for a node in the list.
    public void searchNode(){
        int n = 0;
        System.out.println("Digita el numero a buscar");
        n = sc.nextInt();
        if(this.lst.search(n)){
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }

 /**
  * Elimina el primer nodo de la lista
  */
    public void shiftNode(){
        if(this.lst.shift()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }
/**
 * It removes the last node of the list
 */

    public void popNode(){
        if(this.lst.pop()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }

/**
 * The main function is the entry point of the program. It calls the displayMenu function
 */
    public static void main(String[] args) throws Exception {
        App list = new App();
        list.displayMenu();
    }
}