package RockScissorPaperGame;

import javax.swing.*;
public class Main {
    public static int userScore;
    public static int computerScore;
    public static int i=1;  //Declare i to be an integer variable and i represent round number

    public static void main(String[] args) {
        play();
    }

    public static void play(){
        while (true){
            determineWinner(computerChoice(), userChoice());
            if (computerScore == 5) {
                JOptionPane.showMessageDialog(null, "You lose!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            if (userScore==5) {
                JOptionPane.showMessageDialog(null, "Congrats! You win!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    public static String computerChoice (){
        int computerChoice = (int) (Math.random() * 3);
        String computer=null;
        if ( computerChoice== 0)
            computer = "Rock";
        if (computerChoice == 1)
            computer = "Scissor";
        if (computerChoice == 2)
            computer = "Paper";
        return computer;
    }

    public static String userChoice (){
        String user = JOptionPane.showInputDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" +"Rock? Scissor? or Paper? ", "Round " + i++, JOptionPane.INFORMATION_MESSAGE);
        return user;
    }

    public static void determineWinner (String computerChoice, String userChoice) {
        if (computerChoice.equals("Rock")) {
            switch (userChoice) {
                case "scissor": case "SCISSOR": case "Scissor":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + "  My Score= " + computerScore + "\n" + "My answer was rock.Rock breaks scissors.You lose!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    computerScore++;
                    break;
                case "paper": case "PAPER": case "Paper":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "My answer was rock.Paper eats rock.You win!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    userScore++;
                    break;
                case "rock": case "ROCK": case "Rock":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "It's a tie!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
        else if (computerChoice.equals("Scissor")) {
            switch (userChoice) {
                case "rock": case "ROCK": case "Rock":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "My answer was scissor. Rock breaks scissors. You win!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    userScore++;
                    break;
                case "paper": case "PAPER": case "Paper":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "My answer was scissor. Scissors cut paper. You lose!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    computerScore++;
                    break;
                case "scissor":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "It's a tie!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
        else if(computerChoice.equals("Paper")){
            switch (userChoice) {
                case "rock": case "ROCK": case "Rock":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "My answer was paper. Paper eats rock.You lose!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    computerScore++;
                    break;
                case "scissor": case "SCISSOR": case "Scissor":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "My answer was paper. Scissors cut paper.You win!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    userScore++;
                    break;
                case "paper": case "PAPER": case "Paper":
                    JOptionPane.showMessageDialog(null, "Your Score= " + userScore + "-" + " My Score= " + computerScore + "\n" + "It's a tie!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }
}