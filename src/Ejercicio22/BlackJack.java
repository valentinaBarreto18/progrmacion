package Ejercicio22;

import javax.swing.*;
import java.util.Random;
//EJERCICIO22

public class BlackJack {
    public Random cards = new Random();

    public int card1Machine = cards.nextInt(10) +1;
    public int card2Machine = cards.nextInt(10) +1;
    public int card3Machine = cards.nextInt(10) +1;


    public int card1User = cards.nextInt(10) +1;
    public int card2User = cards.nextInt(10) +1;
    public int card3User = cards.nextInt(10) +1;

    public int totalMachine = card1Machine + card2Machine + card3Machine;
    public String namePlayer;


    public void game(){
        int decision1 = JOptionPane.showConfirmDialog(null,"Your cards are: " + card1User + " and " + card2User + "\n Push 'Yes' to take the tird cart or Push 'No' to stay with two cards");
        if(decision1 == JOptionPane.YES_OPTION){
            int total = card1User + card2User + card3User;

            if (total <= 21 && total == totalMachine){
                JOptionPane.showMessageDialog(null,"Both players have the same number of cards. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total <= 21 && total > totalMachine) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has won. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total <= 21 && total < totalMachine) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has lost. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (totalMachine > 21) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has won. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total > 21) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has lost. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total == totalMachine) {
                JOptionPane.showMessageDialog(null,"Both players have the same number of cards. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }


        }
        else if (decision1 == JOptionPane.NO_OPTION){
            int total = card1User + card2User;

            if (total <= 21 && total == totalMachine){
                JOptionPane.showMessageDialog(null,"Both players have the same number of cards. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+ ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total <= 21 && total > totalMachine) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has won. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+ ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total <= 21 && total < totalMachine) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has lost. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+ ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (totalMachine > 21) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has won. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+ ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total > 21) {
                JOptionPane.showMessageDialog(null,"The player " + namePlayer + " has lost. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }
            else if (total == totalMachine) {
               JOptionPane.showMessageDialog(null,"Both players have the same number of cards. \n Total " + namePlayer+ " cards: "+card1User+","+card2User+","+card3User + ". Total = "+ total+ " \n Total machine cards: " + card1Machine + "," + card2Machine + "," + card3Machine + " Total = " + totalMachine);
            }


        }
    }
}

