package fr.stargeyt.sudoku;

public class Main {


    public static void main(String args[]){
        long debut = System.currentTimeMillis();

        int[][] grille =
                {
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,3,0,8,5},
                        {0,0,1,0,2,0,0,0,0},
                        {0,0,0,5,0,7,0,0,0},
                        {0,0,4,0,0,0,1,0,0},
                        {0,9,0,0,0,0,0,0,0},
                        {5,0,0,0,0,0,0,7,3},
                        {0,0,2,0,1,0,0,0,0},
                        {0,0,0,0,4,0,0,0,9},
                };


        Grille.solve(grille);

        System.out.println("Le programme a mis "+(System.currentTimeMillis()-debut)+ " millisecondes pour remplir la grille");




    }





}
