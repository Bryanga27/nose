
package repasito;

import java.util.Scanner;

public class Repasito {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int hola[][] = {{10,20,30}, {40,50,60}, {70,80,90}};
         System.out.println("La diagonal principal es" + diagonalprincipal(hola));
        
    
    }
    public static String diagonalprincipal(int matriz[][]){
        String  resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado + String.valueOf(matriz[i][i] + "|");
        }
        return resultado;
    }
}
