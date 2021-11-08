package veterinario;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Scanner sc = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario("Mascocotas", "46920");

        String url = "src\\veterinario\\exportaciones\\clientes.dat";
        File fichero = null;
        FileInputStream intputstream = null;
        ObjectInputStream objectinputstream = null;

        try {
            fichero = new File(url);
            intputstream = new FileInputStream(fichero);
            objectinputstream = new ObjectInputStream(intputstream);

            veterinario = (Veterinario) objectinputstream.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        int op = 0;
        do {
            System.out.println("1.Dar de alta un Cliente\n2.Añadir una Mascota a un Cliente\n3.Borrar un Cliente\n4.Vacunar una Mascota\n5.Listar Clientes y exportar Perros vacunados a datos.txt\n6.Salir y exportar datos a clientes.dat");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    añadirCliente(veterinario);
                    break;
                case 2:
                    añadirMascota(veterinario);
                    break;
                case 3:
                    borrarCliente(veterinario);
                    break;
                case 4:
                    vacunarMascota(veterinario);
                    break;
                case 5:
                    listarClientes(veterinario);
                    break;
                case 6:
                    guardarClientes(veterinario);
                    break;
            }
        } while (op != 6);

    }

    private static void añadirCliente(Veterinario veterinario) {
        System.out.println("Introduce el Dni:");
        sc.nextLine();
        String dni = sc.nextLine();
        System.out.println("Introduce el Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el Apellidos:");
        String apellidos = sc.nextLine();
        try {
            veterinario.añadirCliente(dni, nombre, apellidos);
            System.out.println(nombre + " se ha añadido correctamente");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void añadirMascota(Veterinario veterinario) {
        System.out.println("Introduce el Dni del propietario:");
        sc.nextLine();
        String dni = sc.nextLine();
        System.out.println("Introduce el Id de la mascota:");
        int id = sc.nextInt();
        System.out.println("Introduce el Tipo de animal:");
        sc.nextLine();
        String tipo = sc.nextLine();
        System.out.println("Introduce el Nombre del " + tipo + ":");
        String nombre = sc.nextLine();
        try {
            Cliente cliente = veterinario.buscarCliente(dni);
            cliente.añadirMascota(id, tipo, nombre);
            System.out.println(nombre + " es ahora mascota de " + cliente.getNombre());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void borrarCliente(Veterinario veterinario) {
        System.out.println("Introduce el Dni:");
        sc.nextLine();
        String dni = sc.nextLine();

        try {
            veterinario.borrarCliente(dni);
            System.out.println("borrado");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void vacunarMascota(Veterinario veterinario) {
        System.out.println("Introduce el Dni:");
        sc.nextLine();
        String dni = sc.nextLine();
        System.out.println("Introduce el Id de la mascota que quieres vacunar:");
        int id = sc.nextInt();

        try {
            Mascota mascota = veterinario.buscarCliente(dni).buscarMascota(id);
            mascota.setVacunado(true);
            mascota.setFechavacunacion(new Date());
            System.out.println(mascota.getNombre() + " Se ha vacunado");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void listarClientes(Veterinario veterinario) {
        System.out.println(veterinario);
        String url = "src\\veterinario\\exportaciones\\datos.txt";
        File fichero = null;
        FileWriter writerfichero = null;
        PrintWriter printwriter = null;

        try {
            fichero = new File(url);
            writerfichero = new FileWriter(fichero);
            printwriter = new PrintWriter(writerfichero);

            for (int i = 0; i < veterinario.getClientes().size(); i++) {
                for (int e = 0; e < veterinario.getClientes().get(i).getMascotas().size(); e++) {
                    if (veterinario.getClientes().get(i).getMascotas().get(e).isVacunado()) {
                        printwriter.println("Dni: " + veterinario.getClientes().get(i).getDni());
                        printwriter.println("Nombre: " + veterinario.getClientes().get(i).getNombre() + " " + veterinario.getClientes().get(i).getApellidos());
                        printwriter.println("Nombre Mascota: " + veterinario.getClientes().get(i).getMascotas().get(e).getNombre());
                        printwriter.println("Fecha Vacunación: " + veterinario.getClientes().get(i).getMascotas().get(e).getFechavacunacion());
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (printwriter != null) {
                printwriter.close();
            }
        }
    }

    private static void guardarClientes(Veterinario veterinario) {

        String url = "src\\veterinario\\exportaciones\\clientes.dat";
        File fichero = null;
        FileOutputStream outputstream = null;
        ObjectOutputStream objectoutputstream = null;

        try {
            fichero = new File(url);
            outputstream = new FileOutputStream(fichero);
            objectoutputstream = new ObjectOutputStream(outputstream);

            for (int i = 0; i < veterinario.getClientes().size(); i++) {
                objectoutputstream.writeObject(veterinario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (objectoutputstream != null) {
                try {
                    objectoutputstream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
