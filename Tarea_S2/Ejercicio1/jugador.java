public class jugador {

    //Asignación de atributos

    String nombre;
    String posicion;
    int edad;
    int nu_camiseta;

    // Metodo Constructor

    public jugador (String nombre, String posicion, int edad,  int Nu_camiseta){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad= edad;
        this.nu_camiseta  = Nu_camiseta;
    }

    //Modulo , Accion( visualizar datos del jugador)

    public void mostrar_informacion() {

        System.out.println("Nombre: " + nombre  );
        System.out.println("Posición: " + posicion  );
        System.out.println("Edad: " + edad  );
        System.out.println("Num_camiseta: " + nu_camiseta);
        System.out.println("---------------------------------------------");
    }
}
