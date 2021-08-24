package predator;

public class PredatorPrey {

    private final static int MAX_X = 20;
    private final static int MAX_Y = 20;

    private static Organism[][] grid = new Organism[MAX_Y][MAX_X];
    private static Organism[] tracking = new Organism[400];
    
    public PredatorPrey(){
    }

    public void displayGrid(){
        for (int x = 0; x < 20; x++)
        {
            for (int xx = 0; xx < 20; xx++)
            {
                if (grid[x][xx] == null)
                    System.out.print(" ");
                else
                    System.out.print(grid[x][xx].getBody());
            }
            System.out.println();
        }
    }
   
    //Checks grid[y][x] for Ants class
    public static boolean checkAnts(int x, int y){
        Ants otherObject = new Ants();
        return (grid[y][x].getClass() == otherObject.getClass());
    }

    //Rolls dice 1-4
    //1 = north
    //2 = east
    //3 = south
    //4 = west
    public static int cardinalDirection(){
        double ran = Math.floor(Math.random()*4)+1;
        int cardinal = (int)ran;
        return cardinal;
    }

    public void checkCoordinates(){
        switch (PredatorPrey.cardinalDirection()){
            case 1: //north
                break;
            case 2: //east
                break;
            case 3: //south
                break;
            case 4: //west
                break;
        }
    }

    public void addAntsTracking(int newX, int newY){
        boolean cellNotNull = true;
        while (cellNotNull){
            for (int i = 0; i < 400; i++)
                if (tracking[i] == null){
                    tracking[i] = new Ants(newX, newY);
                    cellNotNull = false;
                }
        }
    }
    
    public static void main(String[] args){
        PredatorPrey test = new PredatorPrey();
        Board board2 = new Board(20,20);
        test.displayGrid();
        board2.board[5][6].setOrg(new Ants(6,5));
        board2.board[5][6].displayGrid();
        board2.board[5][6].org.getCoordinates();
       // board2.board[5][6].org.getBoardPt(board2.board,5,6);
    }
}
