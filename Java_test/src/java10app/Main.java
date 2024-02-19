package java10app;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();//このように親クラスに同じメンバがあれば上書きされなければ追加される（オーバーライド）オバロではない
	}

}
