import java.util.Scanner;


public class Main_Empleado {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        empleado empleado1=null;
        empleado empleado2=null;
        empleado empleado3=null;


        for(int i=1;i<=3;i++){

            System.out.print("\n Ingrese los datos empleado "+ i + "\n");
            System.out.print("---------------------------------------------\n");

            //Atributo con scanner
            System.out.print("Ingrese un Nombre:");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el cargo que ocupa:");
            String cargo = scanner.nextLine();

            System.out.print("Ingrese su salario:");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese la fecha de ingreso:");
            String fecha_ingreso = scanner.nextLine();

            //Creacion del objeto
            if(i==1){

                // objeto (empleado-01)
                 empleado1=new empleado(nombre,cargo, salario,fecha_ingreso);
            } else if (i==2) {
                // objeto (empleado-02)
                 empleado2=new empleado(nombre,cargo, salario,fecha_ingreso);
            }else if (i==3){
                // objeto (empleado-03)
                empleado3=new empleado(nombre,cargo, salario,fecha_ingreso);
            }

        }

        //visualizar informacion
        empleado1.mostrar_informacion_empleados();
        empleado2.mostrar_informacion_empleados();
        empleado3.mostrar_informacion_empleados();
        scanner.close();
    }
}
