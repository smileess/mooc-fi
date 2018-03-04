import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        
        
        
        
        Player brian = new Player("Brian");
        
        
        Player pekka = new Player("Pekka", 39);
        
        
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(new Player("Mikael", 1));
        
        barcelona.printPlayers();
        
        System.out.println("Number of players: " + barcelona.size());
        
        System.out.println("number of goals: " + barcelona.goals());
        
        
        
    }
}
