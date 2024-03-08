package Java_Assignment;
//Write a program to - (Use appropriate String methods)
//Correct the spelling mistake from “Davi Beckham” to “David Beckham”
//Correct the number of goals scored by Lionel Messi from 400 to 579
public class Problem_19
{
    public static void main(String[] args) {
        // Original strings
        String playerName1 = "Davi Beckham";
        String playerName2 = "Lionel Messi (400 goals)";

        // Correct the spelling mistake in playerName1
        String correctedName1 = correctSpelling(playerName1);
        System.out.println("Corrected Name 1: " + correctedName1);

        // Update the number of goals in playerName2
        String updatedGoals2 = updateGoals(playerName2, 579);
        System.out.println("Updated Name 2: " + updatedGoals2);
    }

    // Function to correct the spelling mistake in a name
    private static String correctSpelling(String name) {
        return name.replace("Davi", "David");
    }

    // Function to update the number of goals in a string
    private static String updateGoals(String playerName, int newGoals) {
        // Using regular expression to match the number of goals in parentheses
        return playerName.replaceAll("\\(\\d+ goals\\)", "(" + newGoals + " goals)");
    }
}
