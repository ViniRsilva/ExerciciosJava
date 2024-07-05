import java.util.Scanner;

public class exec001{
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
    
    public static int[][] somaMatrizes(int [][]a , int [][]b){
        int [][] c = new int[4][4];
        for(int i =0 ; i < c.length ; i++){
            for(int j  = 0 ; j < c.length ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return c;
    }
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Preencha a matriz A ");
        int [][] a = new int [4][4];
        int [][] b = new int [4][4];
        preencherMatriz(a);
        System.out.println("Preencha a matriz B ");
        
        preencherMatriz(b);
        int [][]c = new int[4][4];
        c = somaMatrizes(a,b);
        
        System.out.println("Printando matriz A");
        printMatriz(a);
        System.out.println("Printando matriz B");
        printMatriz(b);
        System.out.println("Printando matriz C");
        printMatriz(c);
    }
}