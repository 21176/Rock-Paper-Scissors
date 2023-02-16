import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args) {
        System.out.println("Let's play Rock-Paper-Scissors!!!");
        System.out.println("When the message 'SHOOT' appears; Choose: ROCK or PAPER or SCISSORS");
        System.out.println("Are you ready? Type 'YES' if you are!!!");
        Scanner read = new Scanner(System.in);
        String ready = read.nextLine();
        if(ready.equals("yes")){
            System.out.println("Great!! LESSGOOO");
            System.out.println("rock-paper-scissors, shoot!!");
            String choice = read.nextLine();
            String computer = computerMoves();
            String result = result(choice,computer);
            print(choice,computer,result);
        }
        else{
            System.out.println("Ok :(");
            System.out.println("Let's play sometime later!!!");
        }
        read.close();
    }
    public static String computerMoves(){
        double random = Math.random() * 3; //Math.random() => picks random number between 0 and 1
        int integer = (int)random;
        switch(integer){
            case 0:
            return "rock";
            case 2:
            return "paper";
            case 3:
            return "scissors";
            default: 
            return "";
        }
    }
    public static String result(String yourChoice,String computerChoice){
        String result="";
        if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result = "YOU WIN!!! XD";
        }
        else if(computerChoice.equals("rock") && yourChoice.equals("scissors")){
            result = "YOU LOSE :( ";
        }
        else if(yourChoice.equals("rock") && computerChoice.equals("paper")){
            result = "YOU LOSE :( ";
        }
        else if(computerChoice.equals("rock") && yourChoice.equals("paper")){
            result = "YOU WIN!!! XD ";
        }
        else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            result = "YOU WIN!!! XD ";
        }
        else if(computerChoice.equals("paper") && yourChoice.equals("rock")){
            result = "YOU LOSE :( ";
        }
        else if(yourChoice.equals("paper") && computerChoice.equals("scissors")){
            result = "YOU LOSE :( ";
        }
        else if(computerChoice.equals("paper") && yourChoice.equals("scissors")){
            result = "YOU WIN!!! XD ";
        }
        else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result = "YOU WIN!!! XD ";
        }
        else if(computerChoice.equals("scissors") && yourChoice.equals("paper")){
            result = "YOU LOSE :( ";
        }
        else if(yourChoice.equals("scissors") && computerChoice.equals("rock")){
            result = "YOU LOSE :( ";
        }
        else if(computerChoice.equals("scissors") && yourChoice.equals("rock")){
            result = "YOU WIN!!! XD ";
        }
        else{
            result = "It's a TIE!!!";
        }
        return result;      
    }
    public static void print(String yourChoice,String computerChoice,String result){
        System.out.println("\nYour choice: "+yourChoice);
        System.out.println("\nComputer's choice: "+computerChoice);
        System.out.println("result: "+result);
    }

}