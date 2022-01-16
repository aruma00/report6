package jp.ac.uryukyu.ie.e215743;

public class Output{
	/*メッセージ出力*/
    public void Message(){
    System.out.printf("じゃんけん 0:グー 1:チョキ 2:パー >");
    }
	public void playeroutput(int playerhand) {
		System.out.print("あなたは" + HandName(playerhand) + ",");
	}
	public void cpuoutput(int cpuhand) {
		System.out.println("コンピュータは" + HandName(cpuhand));
	}

	public String HandName(int hand) {
		String handName;
		if(hand == 0){
            handName = "グー";
        }
		else if(hand == 1){
            handName = "チョキ";
        }
		else if(hand == 2){
            handName = "パー";
        }
		else handName = "？";{
		return handName;
        }
    }

    public void Message(int messageType){
        final int LOSE = 0;		// 負け
		final int DRAW = 1;		// 引き分け
		final int WIN = 2;		// 勝ち
		/* メッセージ出力 */
		switch(messageType) {
		case LOSE:
			System.out.println("あなたの負けです");
			break;
		case DRAW:
			System.out.println("引き分けです");
			break;
		case WIN:
			System.out.println("あなたの勝ちです");
			break;
		default:
			System.out.println("エラーです");
        }
    }
}
