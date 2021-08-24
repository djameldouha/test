package predator;
import predator.Ants;
public class test {

    public static void main(String[] args)
    {
        Board test = new Board(5,5);
        System.out.println(test.board[0][0].getOrg());

        int randomInt = (int)Math.floor(Math.random()*4+1);

        switch (randomInt){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
        }

        test.board[1][1] = new  Ants();// Ants();
        test.board[1][1].getOrg().move(test);
    }
}
