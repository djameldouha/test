package predator;

public class Organism {

    private int time ; //time steps
    private int x,y; //coordinates
    private String body;

    public Organism(){
    }

    public Organism(int newX, int newY){
        x = newX;
        y = newY;
    }

    public void setBody(String newBody){
        body = newBody;
    }

    public String getBody(){
        return body;
    }

    public void incTime(){
        time++;
    }

    public void resetTime(){
        time = 0;
    }

    public int getTime(){
        return time;
    }

    public void setX(int newX){
        x = newX;
    }

    public int getX(){
        return x;
    }

    public void setY(int newY){
        y = newY;
    }

    public int getY(){
        return y;
    }

    public void getCoordinates(){
        
    }

    /*
    1 = north
    2 = east
    3 = south
    4 = west
    */
    public void direction(int cardinal){
        switch (cardinal){
            case 1:

                this.setY(this.getY()+1);
            case 2:
                this.setX(this.getX()+1);
            case 3:
                this.setY(this.getY()-1);
            case 4:
                this.setX(this.getX()-1);
        }
    }

    

    public void timesteps(){

    }

    public void move(Board testBoard){

    }

    public void breed(){}
}
