import java.util.Scanner;

public class exec002{
    public static void  preencherMatriz(int [][]m){
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m[i].length ; j++){
                System.out.println("Digite o valor para a posição m[" + i + "][" + j + "]");
                m[i][j] = in.nextInt();
            }
        }
    }
    
    public static void printMatriz(int [][]m){
        System.out.println("Printando matriz \n");
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m.length ; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int somaMatriz(int [][]a ){
        int soma = 0;
        for(int i =0 ; i < a.length ; i++){
            for(int j  = 0 ; j < a.length ; j++){
                soma += a[i][j];
            }
        }
        
        return soma;
    }
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Preencha a matriz A ");
        int [][] a = new int [5][5];
        preencherMatriz(a);
        
        System.out.println("Printando matriz A");
        printMatriz(a);
    System.out.println("\nSoma dos elementos da matriz A = " + somaMatriz(a));
       
    }
}