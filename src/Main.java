import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eleccion();
    }

    //Metodo para seleccionar la operacion que se quiera hacer con las matricez
    public static void Eleccion() {
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        System.out.println("Practiquemos con las matricez");
        System.out.println("Seleccione una opcion: " +
                "\n 1:Sumar matricez " +
                "\n 2:Restar matricez" +
                "\n 3:Multiplicar matricez");
        eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            default:
                System.out.println("Eleccion incorrecta \n vuelva a intentar");

        }
    }

    public static void suma() {
        System.out.println("suma");
    }

    public static void resta() {
        System.out.println("resta");
    }

    public static void multiplicacion() {

        //creacion de matricez
        int m1[][] = new int[2][2];  //matriz uno
        int m2[][] = new int[2][2];  //matriz dos
        int mR[][] = new int[2][2];  //matriz resultante

        //llenado matriz uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = (int) (Math.random() * 5); // genera numero al azar no mayores a 5
            }
        }
        //llenado matriz dos
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = (int) (Math.random() * 5); // genera numero al azar no mayores a 5
            }
        }
        //multiplicacion de matricez
        for (int i = 0; i < 4; i++) {

//se va a llenar el primer espacio de la matriz resultante al multiplicar filas por columnas en su respectivo orden
            if (mR[0][0] == 0) {
                int temporal = (m1[0][0] * m2[0][0]) +
                        (m1[0][1] * m2[1][0]);

                mR[0][0] = temporal;
//llenado del segundo resultado
            } else if (mR[1][0] == 0) {
                int temporal = (m1[1][0] * m2[0][0]) +
                        (m1[1][1] * m2[1][0]);

                mR[1][0] = temporal;
//llenado del tercer resultado
            } else if (mR[0][1] == 0) {
                int temporal = (m1[0][0] * m2[0][1]) +
                        (m1[0][1] * m2[1][1]);

                mR[0][1] = temporal;
//llenado del cuarto resultado
            } else if (mR[1][1] == 0) {
                int temporal = (m1[1][0] * m2[0][1]) +
                        (m1[1][1] * m2[1][1]);

                mR[1][1] = temporal;
            }

        }
        //imprecion de resultados

                               //matriz uno                               //matriz dos
        System.out.println("["+m1[0][0]+"]"+"["+m1[0][1]+"]"+" x "+"["+m2[0][0]+"]"+"["+m2[0][1]+"]"+" = "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]"+
                         "\n["+m1[1][0]+"]"+"["+m1[1][1]+"]"+"   "+"["+m2[1][0]+"]"+"["+m2[1][1]+"]"+"   "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]");
    }
}

