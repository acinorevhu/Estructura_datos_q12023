package tarea.pkg1;

//Programa que sume las diagonales de una matriz en java 
//Pongo los resultados de cada diagonal por separado.  
//Genere los valores de la matriz de manera aleatoria.

public class Tarea1 {

    public static void main(String[] args) {        
      
        //Definir una matriz de 3x3
        int Array [][] = {{1,1,2},{1,1,1},{5,5,5}};

        //Suma de ambas diagonales que conforman la matriz
        int matriz = 3;
        
        for (int row=0; row<Array.length;row++) {
            for (int col=0; col<Array[0].length;col++) {

                System.out.print(Array[row][col]+"");
            }
            
            System.out.println();
        }
        
         int left_diagonal = 0, right_diagonal = 0;
         
         for (int row=0; row<Array.length;row++) {
            for (int col=0; col<Array[0].length;col++) {
                if (row ==col)
                    left_diagonal += Array [row][col];
                if ((row + col) == (matriz - 1))
                    right_diagonal += Array [row][col];
            }
   
         }
        System.out.println("\n La suma de la dianoal izquierda es: " + left_diagonal);
        System.out.println("\n La suma de la dianoal derecha es:: " + right_diagonal);
   
            
    }
    
}

//int Diag_izq = 0, Diag_derech = 0;
        //for (int i = 0; i < Array.length; i++) {
          //    Diag_izq += Array [i][i]; //Inicia con Array [0][0]
            //  Diag_derech += mat [i][Array - i-1]; //Inicia en array [0][2] y va decreciendo //

        
        
        //System.out.println("La diagonal izquierda tiene una suma de: "+Diag_izq);
        
        //", y la diagonal derecha una suma de: "+Diag_derech+);