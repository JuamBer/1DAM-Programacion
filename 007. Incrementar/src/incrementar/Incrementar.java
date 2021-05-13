package incrementar;

public class Incrementar {

    public static void main(String[] args) {

        int a = 4, b = 3;

        System.out.println("a + ++b = " + (a + ++b));
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
        a = 4;
        b = 3;
        System.out.println("a + b++ = " + (a + b++));
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
        a = 4;
        b = 3;
        System.out.println("a + ++b = " + a + ++b);
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
        a = 4;
        b = 3;
        System.out.println("a + b++ +b= " + (a + b++ + b));
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
        a = 4;
        b = 3;
        System.out.println("a+++b + b= " + (a++ + b + b));
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
        a = 4;
        b = 3;
        System.out.println("a+ ++b + b++= " + (a + ++b + b++));
        System.out.println("a= " + a);
        System.out.println("b=" + b + "\n");
    }

}
