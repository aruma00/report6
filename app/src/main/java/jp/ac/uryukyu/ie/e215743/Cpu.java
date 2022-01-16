package jp.ac.uryukyu.ie.e215743;

import java.util.Random;

public class Cpu{
    public int cpuHand(){
    Random r = new Random();
    int hand = r.nextInt(3);
    return hand;
    }
}
