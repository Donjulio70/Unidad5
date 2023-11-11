/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo2;

/**
 *
 * @author Julio Qurino
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
        public static double[] prome(double[][] calificaciones) {
        double[] est = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            est[i] = suma / calificaciones[i].length;
        }
        return est;
    }

    public static double[] promm(double[][] calificaciones) {
        double[] mat = new double[calificaciones[0].length];
        for (int i = 0; i < calificaciones[0].length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                suma += calificaciones[j][i];
            }
            mat[i] = suma / calificaciones.length;
        }
        return mat;
    }

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        double[] promediofinal = Arreglo2.prome(calificaciones);
        for (int i = 0; i < promediofinal.length; i++) {
            System.out.println("El promedio del estudiante " + (i + 1) + " es " + promediofinal[i]);
        }

        double[] promediofinal2 = Arreglo2.promm(calificaciones);
        for (int i = 0; i < promediofinal2.length; i++) {
            System.out.println("El promedio de la materia " + (i + 1) + " es " + promediofinal2[i]);
        }
    }
    
}
