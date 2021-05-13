package herencia2;

public class Herencia2 {

    public static void main(String[] args) {
        Multimedia mp3 = new Multimedia("Stand by Me", "Ben E. King", 2.55, "mp3");
        Multimedia wav = new Multimedia("Now We Are Free", "Hans Zimmer", 4.17, "wav");
        Multimedia midi = new Multimedia("midi", "Juan Sáez", 7, "midi");
        Multimedia avi = new Multimedia("avi", "Han Solo", 4, "avi");
        Multimedia mov = new Multimedia("mov", "Peter Jackson", 2, "mov");
        ListaMultimedia lista = new ListaMultimedia(5);
        System.out.println("Creanciónd de la lista:\n" + lista);
        System.out.println("Probando Función Size (Vacía):\n" + lista.size());
        lista.add(mp3);
        lista.add(wav);
        lista.add(midi);
        lista.add(avi);
        lista.add(mov);
        System.out.println("Probando Función Add:\n" + lista);
        System.out.println("Probando Función Size (Llena):\n" + lista.size());
        System.out.println("Probando Función IndexOf (objeto midi):\n" + lista.indexOf(midi));
        System.out.println("Probando Función get (posición 3):\n" + lista.get(3));
    }
}
