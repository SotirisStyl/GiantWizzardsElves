/*
 * Author: Sotiris Stylianou (G20967429)
 * Email: sstylianou2@uclan.ac.uk
 * Description: You input your choice to the program, program gives a choice to itself and decides if you won, lost or if it's a tie
 * To compile the program: javac GiantsWizardsElves.java
 * To run the program: java GiantsWizardsElves
 */

import java.util.Scanner;
public class GiantsWizardsElves {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Giants, Wizards, Elves Game ***" + "\n");
        String OppChoice, choice, emoji;
        Scanner scan = new Scanner(System.in);
        int a;
        do {
            System.out.println("What is your choice: giant, wizard, or elf? [To quit the game, type quit].");
            choice = scan.next();                                                                                       /* You give your choice to the program */
            if (!choice.equals("quit")) {                                                                                 /* If your choice is not quit program does this part else it skips this part */
                if (choice.equals("giant") || choice.equals("wizard") || choice.equals("elf"))                               /* If your choice is giant, wizard or elf program does this part else it skips it */ {
                    a = (int) ((Math.random() * 3) + 1);
                    if (a == 1)                                                                                             /* Program decides it's choice (line 21-30) */
                        OppChoice = "giant" + "\t" + "||";
                    else if (a == 2)
                        OppChoice = "wizard" + "\t" + "---*";
                    else OppChoice = "elf" + "\t" + "^_^";
                    if (choice.equals("giant"))
                        emoji = "||";
                    else if (choice.equals("wizard"))
                        emoji = "---*";
                    else emoji = "^_^";
                    System.out.println("Your choice: " + "\t" + "\t" + "\t" + choice + "\t" + emoji);                         /* Program outputs your choice */
                    System.out.println("Opponents choice: " + "\t" + "\t" + OppChoice);                                      /* Program outputs its choice */
                    if (choice.equals("giant") && a == 1)                                                                     /* Program decides if you won, lost or if it's a tie (line 33-50) */
                        System.out.println("It's a tie!");
                    else if (choice.equals("wizard") && a == 2)
                        System.out.println("It's a tie!");
                    else if (choice.equals("elf") && a == 3)
                        System.out.println("It's a tie!");
                    else if (choice.equals("giant") && a == 2)
                        System.out.println("You won!");
                    else if (choice.equals("wizard") && a == 3)
                        System.out.println("You won!");
                    else if (choice.equals("elf") && a == 1)
                        System.out.println("You won!");
                    else if (choice.equals("wizard") && a == 1)
                        System.out.println("You lost!");
                    else if (choice.equals("elf") && a == 2)
                        System.out.println("You lost");
                    else if ((choice.equals("giant") && a == 3))
                        System.out.println("You lost!");
                } else                                                                                                       /* Program outputs this if your choice is not one of giant, wizard or elf */ {
                    System.out.println("Your move: " + choice);
                    System.out.println("This option is not valid! Try again!");
                }
            } else {                                                                                                      /* Program outputs this if your choice is quit */
                System.out.println("Thank you for playing the Giants, Wizards, Elves Game!");
            }
            System.out.println();
        } while (!choice.equals("quit"));
    }
}