
public class JavaCRreochi {
//CRおもっち1/319 
	public static void main(String[] args) {
		int dedama = 0;
		int win = 0;
		for (int i = 0;;i++) {
			int heso = new java.util.Random().nextInt(319);
			if(win == heso) {
				System.out.println(i + "回転目");
				//大当たり振り分け抽選
				int fever = new java.util.Random().nextInt(2);
				if(win == fever) {
					int renchan = 1;
					dedama += 1500;
					System.out.println("ビッグボーナス！\n 出玉"+ dedama + "発");
					//フィーバーモード1/100を100回
					for(int n = 0; n < 144; n++) {
						int migiuti = new java.util.Random().nextInt(100);
						if(win == migiuti) {
							dedama += 1500;
							renchan ++;
							System.out.println(n +"回転目" + renchan + "連ボーナス！\n 出玉"+ dedama + "発");
							n = 0;
						}
					}
				}else {
					System.out.println("丸焦げボーナス！1500");
				}				
				break;
			}
		}
	}
}
