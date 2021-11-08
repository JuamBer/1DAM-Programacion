package excepciones4;

public class Excepciones4 {

    public static void main(String[] args) {
        try {
            System.out.println(enviarMensaje("contacto@juamber.com"));
        } catch (DirCorreoIncorrectaExcepcion e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(enviarMensaje("hola@gmail.com"));
        } catch (DirCorreoIncorrectaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    public static String enviarMensaje(String correo) throws DirCorreoIncorrectaExcepcion {

        if ("contacto@juamber.com".equals(correo)) {
            //Aquí todas las comprobaciones
            return "Correo válido";
        } else {
            throw new DirCorreoIncorrectaExcepcion("Correo no válido");
        }
    }

}
