
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author seankeever
 */
public class UserInterface {

    private Scanner reader;
    private List<JumperStats> jumpers = new ArrayList<JumperStats>();

    public UserInterface(Scanner reader) {
        this.reader = reader;

    }

    public void start() {
        getJumperNames();
        jumpingPhase();
        printResults();

    }

    public void getJumperNames() {
        System.out.println("Kumpula ski jumping week\n"
                + "\n"
                + "Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = getInput();
            if (!name.isEmpty()) {
                jumpers.add(new JumperStats(name));
            } else {
                break;
            }
        }
        System.out.println();
    }

    public void jumpingPhase() {
        System.out.println("The tournament begins!\n");
        int round = 1;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = getInput();
            if (input.equalsIgnoreCase("jump")) {
                System.out.println("\n" + "Round " + round + "\n");

                printJumpingOrder();

                System.out.println("Results of round " + round);
                executeRound();

                Collections.sort(jumpers);

                round++;
                // repeat the loop
                System.out.println();
            } else {
                break;
            }

        }
        System.out.println();
    }

    public void executeRound() {
        for (JumperStats jumper : jumpers) {
            System.out.println("  " + jumper.getName() + "\n"
                    + "    length: " + jumper.getNewLength() + "\n"
                    + "    judge votes: " + jumper.getNewJudgeResults());
        }

    }

    public void printJumpingOrder() {
        System.out.println("Jumping order:");

        int i = 1;
        for (JumperStats jumper : jumpers) {
            System.out.println("  " + i + ". " + jumper);
        }
        System.out.println();
    }

    public void printResults() {
        System.out.println("Thanks!\n"
                + "\n"
                + "Tournament results:\n"
                + "Position    Name");
        Collections.reverse(jumpers);
        int i = 1;
        for (JumperStats jumper : jumpers) {
            System.out.println(i + "           " + jumper + "\n"
                    + "            jump lengths: " + jumper.getLengths());
            i++;
        }

    }

    public String getInput() {
        return reader.nextLine().trim();
    }

}
