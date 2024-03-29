package lab1p2_joseseron;

import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jose Seron
 */
public class Lab1P2_JoseSeron {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Usuario> Database = new ArrayList();
        boolean salir = true;

        System.out.println("Laboratorio 1 : Registro de Usuarios\n"
                + "Jose Roberto Seron\n\n");

        do {

            System.out.println("\nMenu\n"
                    + "1.- Registrar Usuario\n"
                    + "2.- Listar Todo\n"
                    + "3.- Listar Por Dominio");

            int opcionMenu0 = inputInt.nextInt();

            switch (opcionMenu0) {
                case 1: // Registrar Usuario
                    //Nombre, apellido, fecha de nacimiento, correo, contraseña

                    Database = regUsuario(Database);
                    System.out.println(Database);

                    break;
                case 2: // Listar Todo
                    ListarTodo(Database);
                    break;
                case 3: // Listar por Dominio

                    break;
                case 4: // Salir
                    salir = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (salir);

    }

    public static ArrayList regUsuario(ArrayList<Usuario> lista) {
        
        System.out.print("Ingrese nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = input.nextLine();
        int mes, dia, ano;

        Date fechaActual = new Date();
        Date fechaNacimiento;
        boolean fechanac = true;

        do {
            System.out.println("Ingrese fecha de nacimiento (dd/mm/aaaa): ");
            String fn = input.nextLine();
            String[] tokens = fn.split("/");
            dia = Integer.parseInt(tokens[0]);
            mes = Integer.parseInt(tokens[1]);
            ano = Integer.parseInt(tokens[2]);

            if (mes > fechaActual.getMonth() && (dia - 1) > fechaActual.getDate()) {
                ano++;
            }

            fechaNacimiento = new Date(ano - 1900, mes - 1, dia);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

           

            int anoact = fechaActual.getYear();
            int anonac = fechaNacimiento.getYear();
            int mesact = fechaActual.getMonth();
            int mesnac = fechaNacimiento.getMonth();
            int diaac = fechaActual.getDate();
            int dianac = fechaNacimiento.getDate();

            if ((anoact - anonac) > 13) {
                fechanac = false;
            }
            System.out.println("No alcanza la edad minima");

        } while (fechanac);

        System.out.print("Ingrese correo: ");
        String correo = input.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contraseña = input.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, apellido, correo, contraseña, fechaNacimiento);

        lista.add(nuevoUsuario);

        return lista;
    }

    public static void ListarTodo(ArrayList<Usuario> lista) {
        System.out.println("");

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(i + 1 + ")" + lista.get(i));
        }
        System.out.println("");
    }

}
