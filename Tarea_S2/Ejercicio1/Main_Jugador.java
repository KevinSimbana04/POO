import java.util.Scanner;

public class Main_Jugador {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Atributos quemados

        //objeto (Jugador-01)
        jugador jugador1 = new jugador("Kevin Simbaña", "Defensa", 21, 15);

        //objeto(Jugador-02)
        jugador jugador2 = new jugador("Moices Caicedo","Medio Campista",23, 25);


        //Atributo con scanner
        System.out.print("Ingrese un Nombre");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese La Posición");
        String posicion = scanner.nextLine();

        System.out.print("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el Num_Camiseta");
        int num_camiseta = scanner.nextInt();

        // objeto (Jugador-03)
        jugador jugador3=new jugador(nombre, posicion, edad, num_camiseta);

        // visualizar los atributos de cada objeto

        jugador1.mostrar_informacion();
        jugador2.mostrar_informacion();
        jugador3.mostrar_informacion();


        // HOLA COMO ESTAS
        // Buenos Dias

        //que haces

        scanner.close();
    }
}
