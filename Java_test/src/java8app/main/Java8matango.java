package java8app.main;
public class Java8matango {
	int hp;
	final int LEVEL = 10; //初期値設定。finalをつけ変更不可の定数フィールドとしている。大文字がわかりやすい
	char suffix;
	public void run() {
		System.out.println("おばけきのこ" + suffix + "は逃げ出した！");
	}
}
