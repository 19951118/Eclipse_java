package java10app;

public class SuperHero extends Hero{//継承。基本的にはHeroと同じと宣言
	//ここから下は追加分
	boolean flying;
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void attack(Matango m) {
		super.attack(m);//superを使うことで、親のメソッドを使うことができる。親の親は呼び出し不可
		if (this.flying) {
			super.attack(m);
		}
	}
	public void run() {
		System.out.println(this.name + "は撤退した！");//再定義により上書きできる
	}

}
