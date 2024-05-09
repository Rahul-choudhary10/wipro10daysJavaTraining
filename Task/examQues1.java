package Task;
import java.util.*;
public class examQues1 {
	public static void main(String[] args) {
	        double[] skills = {4.2, 7.3, 1, 8, 6, 51};//no of skills = no of players
	        int winner = findTournamentWinner(skills);
	        System.out.println("Tournament winner: Player " + winner);
	    }
	 
	    public static int findTournamentWinner(double[] skills) {
	        // Sort the players based on their skill levels
	        Arrays.sort(skills);
	 
	        // Keep track of the remaining players
	        int remainingPlayers = skills.length;//7
	        int currentRound = 1;
	 
	        // Continue the tournament until only one player remains
	        while (remainingPlayers > 1) {
	            System.out.println("Round " + currentRound + ":");
	 
	            // Pair up players for matches in the current round
	            for (int i = 0; i < remainingPlayers / 2; i++) {// 3 times
	                double player1Skill = skills[i];
	                double player2Skill = skills[remainingPlayers - 1 - i];// 7-1-0=6
	                System.out.println("Match " + (i + 1) + ": Player " + player1Skill + " vs Player " + player2Skill);
	                // Eliminate the player with lower skill level
	                if (player1Skill < player2Skill) {
	                    skills[i] = Double.NaN; // Mark player 1 as eliminated
	                } else {
	                    skills[remainingPlayers - 1 - i] = Double.NaN; // Mark player 2 as eliminated
	                }
	            }
	 
	            // Remove eliminated players
	            remainingPlayers /= 2;
	            currentRound++;
	        }
	 
	        // Find the winner
	        int winnerIndex = -1;
	        for (int i = 0; i < skills.length; i++) {
	            if (!Double.isNaN(skills[i])) {
	                winnerIndex = i;
	                break;
	            }
	        }
	 
	        return winnerIndex;
	    }
}
