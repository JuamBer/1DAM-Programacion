package herencia1;

public class Herencia1 {

    public static void main(String[] args) {

        Multimedia mp3 = new Multimedia("Stand by Me", "Ben E. King", 2.55, "mp3");
        Multimedia wav = new Multimedia("Now We Are Free", "Hans Zimmer", 4.17, "wav");
        System.out.println(mp3);

        System.out.println(mp3.equals(wav));
        System.out.println(mp3.equals(mp3));
    }
}
