import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static String rock = "rock";
    public static String paper = "paper";
    public static String scissor = "scissor";
    
        public static <computerMove> void main(String[] args) {
       System.out.println("Enter rock\\ paper\\ scissor");

       String playerMove = getPlayerMove();
       String computerMove = getComputerMove();

       if (playerMove.equals(computerMove))
       System.out.println("Game is Tie");
       else if (playerMove.equals(rock))
       System.out.println(computerMove.equals(paper) ? "Computer Win":"Player Win");
       else if (playerMove.equals(paper))
       System.out.println(computerMove.equals(scissor) ? "Computer Win":"Player Win");
       else 
       System.out.println(computerMove.equals(rock) ? "Computer Win":"Player Win");

        
       
    }
    public static String getPlayerMove() {
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       String playermove = input.toLowerCase();
       System.out.println("Player Move is: "+playermove);
       return playermove;


    }
    public static String getComputerMove() {
        String computermove;
        Random random = new Random();
        int output = random.nextInt(2);
        if (output==0)
        computermove = rock;
        else if (output==1)
        computermove = paper;
        else
        computermove = scissor;
        System.out.println("Computer Move is: "+computermove);
        return computermove;

        
    }
}