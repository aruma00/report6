package jp.ac.uryukyu.ie.e215743;

import java.util.Scanner;


public class Player{
    public int playerHand(){
        Scanner scan = new Scanner(System.in);
        int hand = scan.nextInt();
        //scan.close();
        return hand;
    }
}

