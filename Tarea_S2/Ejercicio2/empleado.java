public class empleado {

    //Asignacion de Atributos

    String  nombre;
    String cargo;
    double salario;
    String fecha_ingreso;


    // Metodo Constructor
    public empleado(String nombre, String cargo, double salario, String fecha_ingreso){
        this.nombre=nombre;
        this.cargo=cargo;
        this.salario=salario;
        this.fecha_ingreso=fecha_ingreso;
    }

    //Modulo, Accion (Visualización de los datos)

    public void mostrar_informacion_empleados(){

        System.out.println("Nombre: " + nombre  );
        System.out.println("Cargo: " + cargo );
        System.out.println("Salario: " + salario  );
        System.out.println("Fecha_ingreso: " + fecha_ingreso);
        System.out.println("--------------------------------------");
    }
  //Hola
}