package asignatura.poo1;

public class AsignaturaPOO1 {

    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura();

        matematicas.asignarValores(1017, "Matemáticas", "1");

        System.out.println(matematicas.mostrarId());
        System.out.println(matematicas.mostrarNombre());
        System.out.println(matematicas.mostrarCurso());
    }
}
