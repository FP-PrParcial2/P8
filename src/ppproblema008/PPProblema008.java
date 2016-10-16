/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema008;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        //c2=a2+b2
        cateto1=entradaDato1();
        cateto2=entradaDato2();
        hipotenusa=Resultados(cateto1,cateto2);
    }
    public static double entradaDato1(){
        Scanner entrada= new Scanner(System.in);
        double cateto1;
        System.out.println("Introduce el cateto 1");
        cateto1= entrada.nextInt();
     return cateto1;
    }
    public static double entradaDato2(){
        Scanner entrada= new Scanner(System.in);
        double cateto2;
        System.out.println("Introduce el cateto 2");
        cateto2= entrada.nextInt();
        return cateto2;
    }

    private static double Resultados(double cateto1, double cateto2) {
        double res;
        res =Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("La hipotenusa es:"+ res);
        return res;
        
    }
}
