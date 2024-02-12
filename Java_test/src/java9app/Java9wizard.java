package java9app;

public class Java9wizard {
	String name;
	int hp;
	public void heal(Java9hero h) {
		h.hp += 10;
		System.out.println(this.name + "はヒールを唱えた！");
		System.out.println(h.name + "のHPを10回復した！");
		System.out.println("HPが" + h.hp + "になった！");
	}
	public void meiso() {
		this.hp += 50;
		System.out.println(this.name + "は瞑想した！");
		System.out.println(this.name + "のHPを50回復した！");
		System.out.println("HPが" + this.hp + "になった！");
	}
	
	public Java9wizard(String name) {//newされた直後に実行されるメソッドをコンストラクタという。引数を使うことで初期値を設定できる。
		this.hp = 50;//引数ありのコンストラクタを定義すると、その後デフォルトコンスタラクタは使えなくなる。
		this.name = name;
	}
	public Java9wizard() {//コンストラクタのオーバーロード。これにより引数がなくても使えて便利である。
		this("名無し");//同名コンストラクタを呼び出す事ができる。これでhpの再宣言を省略できる。
	}


}
