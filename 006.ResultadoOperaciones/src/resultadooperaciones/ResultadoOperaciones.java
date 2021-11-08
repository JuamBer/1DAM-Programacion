package resultadooperaciones;

public class ResultadoOperaciones {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        double ra = (-a + (5 % b)) - (a * a);
        double rb = 5 + 3 % 7 * b * a - b % a;
        double rc = (a + 1) * (b + 1) - b / a;
        double rd = a * ((a + 2) / b);

        System.out.println("a)" + ra);
        System.out.println("b)" + rb);
        System.out.println("c)" + rc);
        System.out.println("d)" + rd);

    }

}
