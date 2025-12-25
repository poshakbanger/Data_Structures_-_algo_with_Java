package Accenture_Coding_Questions;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        String playerA = "paper";
        String playerB = "";

        if (playerA == "rock"){
            System.out.println("paper");
        } else if (playerA == "paper") {
            System.out.println("scissors");
        } else if (playerA =="scissors"){
            System.out.println("rock");
        }
    }
}
