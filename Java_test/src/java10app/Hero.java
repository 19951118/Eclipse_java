package java10app;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("5ポイントのダメージを与えた！");
		m.hp -= 5;
	}
	public final void slip() {//finalが付いているメソッドはオーバーライドが禁止になる。クラスも同様である
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
		
	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
