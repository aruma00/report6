package jp.ac.uryukyu.ie.e215743;

public class Judge {
    public int judgeHand(int cpuhand, int playerhand) {
		/* 変数宣言 */
		int janken;					
		/* 定数宣言 */
		final int ROCK = 0;		// グー
		final int SCISSORS = 1;	// チョキ
		final int PAPER = 2;	// パー
		final int LOSE = 0;		// 負
		final int DRAW = 1;		// 引き分け
		final int WIN = 2;		// 勝ち
		/* 勝敗判定 */
		if(cpuhand == ROCK && playerhand == ROCK){
            janken = DRAW;
        }
		else if(cpuhand == ROCK && playerhand == SCISSORS){
            janken = LOSE;
        }
		else if(cpuhand == ROCK && playerhand == PAPER){
            janken = WIN;
        }
		else if(cpuhand == SCISSORS && playerhand == ROCK){
            janken = WIN;
        }
		else if(cpuhand == SCISSORS && playerhand == SCISSORS){
            janken = DRAW;
        }
		else if(cpuhand == SCISSORS && playerhand == PAPER){
            janken = LOSE;
        }
		else if(cpuhand == PAPER && playerhand == ROCK){
            janken = LOSE;
        }
		else if(cpuhand == PAPER && playerhand == SCISSORS){
            janken = WIN;
        }
		else if(cpuhand == PAPER && playerhand == PAPER){
            janken = DRAW;
        }
        else{
            janken = -1;
        }
		return janken;
        
	}

}
