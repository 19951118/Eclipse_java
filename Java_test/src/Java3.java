
public class Java3 {
	
	public static void main(String[]args) {
		//条件分岐if文
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			//一行しかない場合は波カッコを省略できる。（ブロックの指定ができないため推奨ではない）
			System.out.println("映画を観に行きます");
		}
		//繰り返し文
		//ブロック内で宣言した変数はブロック内でのみ機能する。
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ドアをノックする");
			System.out.println("1分待つ");
		}
		//関係演算子は真偽値にて評価される
		//文字列の比較は==を使わず下記で表す
		String str = "スッキリ";
		if(str.equals("スッキリ")) {
			System.out.println("文字列スッキリ");
		}
		//ifを使った占いゲーム。もっとシンプルにできる
		System.out.println("あなたの運勢を占います");
		int fortone = new java.util.Random().nextInt(4) + 1;
		if (fortone == 1) {
			System.out.println("大吉");
		}else if (fortone == 2){
			System.out.println("中吉");
		}else if (fortone == 3) {
			System.out.println("吉");
		}else {
			System.out.println("凶");
		}
		//switchを使った占いゲーム。こっちのがスッキリしている
		System.out.println("もう一回占います");
		int fortone2 = new java.util.Random().nextInt(5) + 1;
		switch (fortone2) {
			case 1,2 -> {
				System.out.println("いいね！");
			} 
			case 3 -> {
				System.out.println("普通です");
			}
			case 4,5 -> {
				System.out.println("うーん・・・");
			}
		}
		//記述方法には{}ではなく:とbreak;で囲むswitch文もある。
		//do-while文というブロックが最低一回は実行される記述がある。
		
		//for文による繰り返し処理
		//左から初期化処理、繰り返し条件、繰り返し後処理。変数はブロック内でのみ機能。すでに使われてるものは使えない。
		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + i + "週目");
		}
		//2重のfor文。繰り返しの中断として、if文でのbreak;や今回の中を中止して次の周にいくcontinue;がある。
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
		//練習3-1
		/* 
		 * ①weight == 60
		 * ②(age1 + age2) * 2 > 60
		 * ③age % 2 != 0　またはage % 2 == 1
		 * ④name.eqals("湊")
		 */
		//練習3-2
		/*
		 * C.age != 30
		 * D.true
		 * E.b + 5 < 20
		 */
		//練習3-3
		int isHungry = 1;
		String food = "カレーライス";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		//練習3-4
		//波括弧を忘れないこと
		//練習3-5
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1 -> {
				System.out.println("検索します");
			}
			case 2 -> {
				System.out.println("登録します");
			}
			case 3 -> {
				System.out.println("削除します");
			}
			case 4 -> {
				System.out.println("変更します");
			}
		}
		//switchを変数に格納したり、Sysoutの中にそのままswitchを入れることでスッキリできる
		
		//練習3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり！");
				break;
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
