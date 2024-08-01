package Ejercicio22;

import javax.swing.*;

public class Main22 {
    public static void main(String[] args) {

        String playerName = JOptionPane.showInputDialog("Enter your name:");
        BlackJack game = new BlackJack(playerName);
        game.game();
    }
}
