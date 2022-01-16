package jp.ac.uryukyu.ie.e215743;


public class Main {

	public static void main(String[] args) {
        /* 変数宣言 */
		int cpuhand;	// コンピュータの手 0:グー 1:チョキ 2: パー
		int playerhand;		// プレイヤーの手   0:グー 1:チョキ 2: パー
		int result;		// 勝敗の結果      0:負け 1:引き分け 2:勝ち -1:エラー

        Cpu c = new Cpu();
        Player p = new Player();
        Output out = new Output();
        Judge judge = new Judge();

        out.Message();
        playerhand = p.playerHand();
        cpuhand = c.cpuHand();
        out.playeroutput(playerhand);
        out.cpuoutput(cpuhand);
        result = judge.judgeHand(cpuhand, playerhand);
        out.Message(result);


		
    }
		
}


