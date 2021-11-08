package ejerciciosbuclesycondicionales;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        boolean paso = false;
        int año = 0;
        int mes = 0;
        int dia = 0;

        while (paso == false) {
            System.out.println("Escribe un año: ");
            año = sc.nextInt();

            if (false == (año >= 1970 && año < 3000)) {
            } else {
                paso = true;
            }
        }
        paso = false;

        while (paso == false) {
            System.out.println("Escribe un mes (1-12): ");
            mes = sc.nextInt();

            if (mes > 12 || mes < 1) {
            } else {
                paso = true;
            }
        }

        paso = false;

        while (paso == false) {
            System.out.println("Escribe un dia: ");
            dia = sc.nextInt();

            if (dia < 31 && dia > 1) {
                switch (mes) {
                    case 1:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 2:
                        if (dia > 28) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 3:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 4:
                        if (dia > 30) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 5:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 6:
                        if (dia > 30) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 7:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 8:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 9:
                        if (dia > 30) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 10:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 11:
                        if (dia > 30) {
                        } else {
                            paso = true;
                        }
                        break;
                    case 12:
                        if (dia > 31) {
                        } else {
                            paso = true;
                        }
                        break;
                }
            }
        }
        System.out.println("Fecha: " + año + "-" + mes + "-" + dia);

    }
}
