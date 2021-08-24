package predator;

import java.util.Scanner;

public class Board {
    
    Organism org;
    private int x,y;
    
    public static Board[][] board;
    public static Organism[] tracking = new Organism[400];

    public Board()
    {
        org = null;
        x = 0;
        y = 0;
    }

    //creates the board size and also initializes each cell with their
    //corresponding x & y coordinates
    public Board(int X, int Y)
    {
        board = new Board[X][Y];
        for (int i = 0; i < X; i++)
            for (int ii = 0; ii < Y; ii++)
            {
                board[i][ii] = new Board();
                board[i][ii].x = i;
                board[i][ii].y = ii;
            }
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public Organism getOrg(){
        return org;
    }

    public void setOrg(Organism newOrg){
        org = newOrg;
    }

    public boolean isNull(int x, int y)
    {
        if (board[x][y].getOrg() == null)
            return true;
        else
            return false;
    }

    /*
    public boolean isAnts(int x, int y){
        Ants ant = new Ants();
        return (board[x][y].org()==ant.getClass());
    }
*/
    
    //Loops through tracking[] for the first null index and attempts to
    //attempts to initialize it on random coordinates
    public void setRandomAnt(){
        Ants ant = new Ants();
        boolean notSet = true;

        for (int i=0; i < 400; i++){
           if (tracking[i] == null){
                while (notSet){
                    int randomPointX = (int)Math.floor(Math.random()*20);
                    int randomPointY = (int)Math.floor(Math.random()*20);

                    if(board[randomPointX][randomPointY].isNull(randomPointX,randomPointY))
                    {
                        tracking[i] = new Ants(randomPointX, randomPointY);
                        board[randomPointX][randomPointY].setOrg(tracking[i]);
                        notSet = false;
                    }
                }
           }
       }
    }

    public void printTracking(){
        for (int i = 0; i < tracking.length; i++)
            if(tracking[i] == null)
                System.out.println("nothing is here yet");
            else
            System.out.println(tracking[i].getBody());
    }

    public void displayGrid(){
        Ants ants = new Ants();
        Doodlebugs doodlebug = new Doodlebugs();

        for (int x = 0; x < 20; x++)
        {
            for (int xx = 0; xx < 20; xx++)
            {
                if (board[x][xx].getOrg() == null)
                    System.out.print(" -----");
                else if (board[x][xx].getOrg().getClass() == ants.getClass()) 
                    System.out.print("o");
                else if (board[x][xx].getOrg().getClass() == doodlebug.getClass())
                    System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Board test = new Board(20,20);
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i <= 1; i++)
            test.setRandomAnt();
        
        System.out.println(tracking[0].getClass());
        tracking[0].move(test);
//        test.printTracking();
        //test.displayGrid();


    }
} 
