/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.muon.gutierrez;

/**
 *
 * @author MUON
 */
public class Ex01MuonGutierrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // header
        System.out.println("Favorite Formula 1 Drivers");
        
        // driver 1 information
        String name1 = "Charles Leclerc";
        String team1 = "Scuderia Ferrari";
        String nat1 = "Monegasque";
        int exp1 = 5;
        int podiums1 = 19;
        int wins1 = 5;
        
        // driver 2 information
        String name2 = "Carlos Sainz";
        String team2 = "Scuderia Ferrari";
        String nat2 = "Spanish";
        int exp2 = 8;
        int podiums2 = 13;
        int wins2 = 1;
        
        // driver 3 information
        String name3 = "Lewis Hamilton";
        String team3 = "Mercedes-AMG Petronas";
        String nat3 = "British";
        int exp3 = 16;
        int podiums3 = 188;
        int wins3 = 103;
        
        // driver 1 output statements
        System.out.print("\n#1\n");
        System.out.print("Name: " + name1 + "\n");
        System.out.print("Team: " + team1 + "\n");
        System.out.print("Nationality: " + nat1 + "\n");
        System.out.print("Years in Formula 1: " + exp1 + "\n");
        System.out.print("Podiums: " + podiums1 + "\n");
        System.out.print("Wins: " + wins1 + "\n");
        
        // driver 2 output statements
        System.out.print("\n#2\n");
        System.out.print("Name: " + name2 + "\n");
        System.out.print("Team: " + team2 + "\n");
        System.out.print("Nationality: " + nat2 + "\n");
        System.out.print("Years in Formula 1: " + exp2 + "\n");
        System.out.print("Podiums: " + podiums2 + "\n");
        System.out.print("Wins: " + wins2 + "\n");
        
        // driver 3 output statements
        System.out.print("\n#3\n");
        System.out.print("Name: " + name3 + "\n");
        System.out.print("Team: " + team3 + "\n");
        System.out.print("Nationality: " + nat3 + "\n");
        System.out.print("Years in Formula 1: " + exp3 + "\n");
        System.out.print("Podiums: " + podiums3 + "\n");
        System.out.print("Wins: " + wins3 + "\n");
        
        // performing operations
        System.out.print("\nCharles Leclerc and Carlos Sainz drive for the same team: ");
            if (team1 == team2) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
        System.out.print("Charles Leclerc, Carlos Sainz, and Lewis Hamilton are all of the same nationality: ");
            if (nat1 == nat2 && nat2 == nat3 && nat1 == nat3) {
                System.out.print("true\n");
            } else
                System.out.print("false\n");
    }
    
}
