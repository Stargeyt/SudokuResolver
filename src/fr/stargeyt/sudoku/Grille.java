package fr.stargeyt.Sudoku;

public class Grille {

    public static boolean solvable=true;


    public static void solve(int[][] grille) {
        estValide(grille,0);
        for (int row=0; row<9; row++){
            for (int column=0; column<9; column++){
                if(grille[row][column]==0){
                    solvable = false;

                    break;
                }
            }
        }


        print(grille);
        if(!solvable)System.out.println("\nLa grille ne peut pas être résolue");
    }

    public static void print(int[][] grille)
    {
        for (int row=0; row<9; row++)
        {
            for (int column=0; column<9; column++)
            {
                System.out.print(grille[row][column]+" ");
                if(column>=8)System.out.print('\n');

            }

        }
    }

    private static boolean absentSurLigne (int k, int[][] grille, int row)
    {
        for (int column=0; column < 9; column++)
            if (grille[row][column] == k)
                return false;
        return true;
    }

    private static boolean absentSurColonne (int k, int[][] grille, int column)
    {
        for (int row=0; row < 9; row++)
            if (grille[row][column] == k)
                return false;
        return true;
    }

    private static boolean absentSurBloc (int k, int[][] grille, int row, int column)
    {
        int _i = row-(row%3), _j = column-(column%3);
        for (row=_i; row < _i+3; row++)
            for (column=_j; column < _j+3; column++)
                if (grille[row][column] == k)
                    return false;
        return true;
    }

    public static boolean estValide (int[][] grille, int position)
    {
        if (position == 9*9){
            return true;

        }


        int row = position/9, column = position%9;

        if (grille[row][column] != 0)
            return estValide(grille, position+1);



        for (int k=1; k <= 9; k++)
        {
            if (absentSurLigne(k,grille,row) && absentSurColonne(k,grille,column) && absentSurBloc(k,grille,row,column))
            {
                grille[row][column] = k;

                if ( estValide (grille, position+1) )
                    return true;
            }
        }
        grille[row][column] = 0;

        return false;
    }


}
