
public class JavaPomocchi {
//P　javaから始めるおもち生活　鬼がかりVer.1/319 
	public static void main(String[] args) {
		System.out.println("軍資金を入力してください");
		//下記これのエラー出ない書き方　int money = new java.util.Scanner(System.in).nextInt();
		java.util.Scanner scanner = new java.util.Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println("500円あたりの回転数は？");
        int kaiten = scanner.nextInt();
        scanner.close();
        
		if(money < 500) {
			System.out.println("お金を稼いでからまた来てね！");
		}else {
			int dedama = 0;
			int win = 0;
			money -= 500;
			for (int i = 0;;i++) {
				if(money < 500) {
					System.out.println("軍資金がなくなりました。。。");
					break;
				}else if(i % kaiten == 0){
					money -= 500;
				}
				int heso = new java.util.Random().nextInt(319);
				if(win == heso) {
					System.out.println(i + "回転目。残金" + money);
					//大当たり振り分け抽選55%
					int fever = new java.util.Random().nextInt(100);
					if(44 < fever) {
						int renchan = 1;
						dedama += 3000;
						System.out.println("鬼がかり3000！\n 出玉"+ dedama + "発\n鬼がかりラッシュ突入！");
						//フィーバーモード1/100を144回
						for(int n = 0; n < 144; n++) {
							int migiuti = new java.util.Random().nextInt(100);
							if(win == migiuti) {
								//大当たり振り分け
								int huriwake = new java.util.Random().nextInt(100);
								if(huriwake < 55) {
									dedama += 1500;
									renchan ++;
									System.out.println(n +"回転目" + renchan + "連ボーナス！\n おもちボーナス1500！出玉計"+ dedama + "発");
									n = 0;
								}else if(huriwake > 54 && huriwake < 81) {
									dedama += 3000;
									renchan ++;
									System.out.println(n +"回転目" + renchan + "連ボーナス！\n 鬼がかり3000!出玉計"+ dedama + "発");
									n = 0;
								}else if(huriwake > 80 && huriwake < 95) {
									renchan ++;
									System.out.println(n +"回転目" + renchan + "連ボーナス！\n リスタート!出玉計"+ dedama + "発");
									n = 0;
								}else {
									dedama += 300;
									renchan ++;
									System.out.println(n +"回転目" + renchan + "連ボーナス！\n ボーナス300!出玉計"+ dedama + "発");
									n = 0;
								}
								
							}
						}
					}else {
						dedama += 1500;
						System.out.println("通常ボーナス！1500");
					}	
					System.out.println("結果" + dedama + "発獲得！換金します");
					money += dedama * 4;
					System.out.println("こづかいが" + money + "円になった！");
					break;
				}
			}
		}
	}
}
