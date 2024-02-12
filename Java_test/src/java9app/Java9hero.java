package java9app;

public class Java9hero {
	String name;
	int hp;
	Java9sword sword;
	public void attack(){
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	public Java9hero() {//newされた直後に実行されるメソッド。コンストラクタ
		this.hp = 100;
	}

}
