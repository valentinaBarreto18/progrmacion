package Ejercicio22;

import javax.swing.*;

public class Main22 {
    public static void main(String[] args) {
        BlackJack play = new BlackJack();
        JOptionPane.showMessageDialog(null, "RULES OF THE GAME \n 1. A deck is used with cards that can have numbers from 1 to 10, and any number can be repeated \n 2. The game starts by dealing the user two randomly chosen cards and does the same for the machine, but does not reveal them. \n 3. Then for both players, one randomly chosen card is dealt that is not revealed until the user selects 'Yes' or 'NO'. \n 4. The winner is the one with the highest score that is 21 or less. If one score is over 21 and the other is 21 or less, the player with 21 or less is declared the winner");
        play.namePlayer = JOptionPane.showInputDialog(null,"Enter your id player:  ");

        play.game();
    }
}


