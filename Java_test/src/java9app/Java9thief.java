package java9app;

public class Java9thief {
	//練習問題
	String name;
	int hp;
	int mp;
	public Java9thief(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Java9thief(String name, int hp){
		this(name, hp, 5);//引数を使って一個目のメソッド参照

	}
	public Java9thief(String name){
		this(name, 40);//引数を使って二個目のメソッド参照
	}

}
