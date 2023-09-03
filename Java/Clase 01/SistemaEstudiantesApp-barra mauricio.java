package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudiantesDAO;
import UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);//para leer informacion de la consola
        //se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudiantesDAO();
        while(!salir){
            try {
                mostrarMenu();//Mostrar menu
                //Este sera el metodo que devolvera un booleano
                salir = ejecutarOperaciones(consola, estudianteDao);//Esto arroja una excepcion
            } catch(Exception e){
                System.out.println("Ocurrio un error al ejecutar la operacion: "+e.getMessage());
            }
        }//Fin while
    }//Fin main

    private static void mostrarMenu(){
        System.out.print("""
                ******* Sistema de Estudiantes *******
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar estudiantes
                4. Modificar Estudiantes
                5. Eliminar Estudiantes
                6. Salir
                Elige una opcion:
                """);
    }
//Metodo para modificar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es verdadero termina el ciclo while
    private static boolean ejecutarOperaciones(Scanner consola, EstudiantesDAO estudiantesDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch(opcion){
            case 1 -> {
                System.out.println("Listado de Estudiantes...");
                //no muestra la informacion, solo recupera la info y regresa una lista
                var estudiantes = estudiantesDAO.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//para imprimir la lista
            }//Fin caso 1
            case 2 -> {//Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudiantesDAO.buscarEstudiantePorId(estudiante);
                if(encontrado)
                    System.out.println("Estudiante encontrado: "+estudiante);
                else
                    System.out.println("Estudiante NO encontrado: "+estudiante);
            }//Fin case 2
            case 3 -> {//agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crear objeto estudiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudiantesDAO.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Estudiante agregado: "+estudiante);
                else
                    System.out.println("Estudiante NO agregado: "+estudiante);

            }//fin case 3
            case 4 -> { //modificar estudiante
                System.out.println("Modificar estudiante: ");
                //aqui lo primero es especificar cual es el id del objeto a modificar
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante a modificar
                var estudiante =
                        new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudiantesDAO.modificarEstudiante(estudiante);
                if (modificado)
                    System.out.println("Estudiante modificado: "+estudiante);
                else
                    System.out.println("Estudiante NO modificado: "+estudiante);
            }//fin case 4
            case 5 -> {//eliminar estudiante
                System.out.println("Eliminar estudiante: ");
                System.out.println("Id etsudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudiantesDAO.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado: "+estudiante);
                else
                    System.out.println("Estudiante NO eliminado: "+estudiante);

            }//fin case 5
            case 6 -> {//salir
                System.out.println("Hasta pronto!!!");
                salir = true;
            }//fin case 6
            default -> System.out.println("Opcion no reconocida, ingrese otra opcion");
        }//Fin switch
        return salir;
    }

}// Fin clase