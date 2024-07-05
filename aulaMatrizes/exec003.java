import java.util.Scanner;

public class exec003{
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
    
    public static int [] somaDiagonais(int [][]m){
        int auxDiagonalSegundaria = m.length;
        //posição 0 diag principal posição 2 diag Secundaria
        int [] diagonais = new int[2];
        for(int i =0 ; i < m.length ; i++){
            diagonais[0] += m[i][i];
            diagonais[1] += m[i][--auxDiagonalSegundaria];
        }
        
        return diagonais;
    }
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Preencha a matriz A ");
        int [][] a = new int [6][6];
        preencherMatriz(a);
        System.out.println("Printando matriz A");
        printMatriz(a);

        int [] diagonais = somaDiagonais(a);
        System.out.println("\nSoma da diag principal = " + diagonais[0] + "\nSoma das Diagonal secundaria = " + diagonais[1]);
       
    }
}