package predator;

public class Ants extends Organism {
    
    public Ants(){
        super.setBody("o");
    }

    public Ants(int newX, int newY){
        super.setBody("O");
        super.setX(newX);
        super.setY(newY);
    }

    public void timesteps(){
        super.incTime();
        if (getTime() == 3){
            super.resetTime();
        }
    }

    public void move(Board testBoard){
        int direction = (int)Math.floor(Math.random()*4+1);
        Board boardClass = new Board();

        switch (direction){
            case 1: //north
                if (testBoard.board[this.getX()][this.getY()+1].getOrg() == null)
                    System.out.println("north");
                    break;
            case 2: //east
                if (testBoard.board[this.getX()+1][this.getY()].getOrg() == null)
                    System.out.println("east");
                    break;
            case 3: //south
                if (testBoard.board[this.getX()][this.getY()-1].getOrg() == null)
                    System.out.println("south");
                    break;
            case 4: //west
                if (testBoard.board[this.getX()-1][this.getY()].getOrg() == null)
                    System.out.println("west");
                    break;
        }
    }

    public void breed(){
        if (super.getTime() == 3)
            super.resetTime();
    }
}
