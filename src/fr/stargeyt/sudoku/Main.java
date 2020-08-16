package fr.stargeyt.Sudoku;

public class Main {

    public static long debut=0;

    public static void main(String args[]){

        debut = System.currentTimeMillis();
        int[][] grille = //Fill your Sudoku default grid here
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

        if(Grille.Solved) System.out.println("Le programme a mis "+(System.currentTimeMillis()-debut)+ " millisecondes pour remplir la grille");




    }





}
