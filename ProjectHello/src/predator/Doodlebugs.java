package predator;

public class Doodlebugs extends Organism{
    
    public Doodlebugs(){
        super.setBody("X");
    }

    public void timeSteps(){
        super.incTime();
        if (getTime() == 8)
            super.resetTime();
    }

    public void starve(){
        if (super.getTime() == 3)
            System.out.println("Hello");
    }
}
