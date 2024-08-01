package Ejercicio22;

import javax.swing.*;
import java.util.Random;
//EJERCICIO22

public class BlackJack {

    private Random cards = new Random();
    private int card1Machine;
    private int card2Machine;
    private int card3Machine;

    private int card1User;
    private int card2User;
    private int card3User;

    private int totalMachine;
    private String namePlayer;


    public BlackJack(String namePlayer) {
        this.namePlayer = namePlayer;

    this.card1Machine = cards.nextInt(10) + 1;
        this.card2Machine = cards.nextInt(10) + 1;
        this.card3Machine = cards.nextInt(10) + 1;
 this.card1User = cards.nextInt(10) + 1;
        this.card2User = cards.nextInt(10) + 1;
        this.card3User = cards.nextInt(10) + 1;
          this.totalMachine = card1Machine + card2Machine + card3Machine;
}


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

