/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.metodos;

/**
 *
 * @author Julio Qurino
 */
public class TareaMetodos {
    
    public static int operaciones(int a, int b){
    return a + b;
}
    public static int operaciones2(int ab, int bc){
    return ab - bc;
}
    public static int operaciones3(int abc, int bcd){
    return abc * bcd;
    }
    public static int operaciones4(int abcd, int bcde){
    return abcd / bcde;    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado1 = TareaMetodos.operaciones(5,3);
        System.out.println("La suma es "+ resultado1);
        int resultado2 = TareaMetodos.operaciones2(8, 2);
        System.out.println("La resta es "+ resultado2);
        int resultado3 = TareaMetodos.operaciones3(12, 5);
        System.out.println("La multiplicación es "+ resultado3);
        int resultado4 = TareaMetodos.operaciones4(10, 5);
        System.out.println("La division es "+ resultado4);
        
    }
    
}
