
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File:");        
        String fileName = scanner.nextLine();
        
        System.out.println("Team:");
        String team = scanner.nextLine();
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineArr = line.split(",");                
                String awayTeam = lineArr[0];
                String homeTeam = lineArr[1];
                int awayTeamScore = Integer.valueOf(lineArr[2]);
                int homeTeamScore = Integer.valueOf(lineArr[3]);
                
                if(team.equals(awayTeam) || team.equals(homeTeam)) {
                    count++;                   
                }
                
                if(
                    team.equals(awayTeam) && (awayTeamScore > homeTeamScore) ||
                    team.equals(homeTeam) && (homeTeamScore > awayTeamScore)
                ) {
                    
                    wins++;
                    
                } else if(
                    team.equals(awayTeam) && awayTeamScore < homeTeamScore ||
                    team.equals(homeTeam) && homeTeamScore < awayTeamScore
                ) {
                    
                    losses++;
                }
                
                
                        
                

                
                
            }
            
            
        } catch(Exception err) {
            
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
