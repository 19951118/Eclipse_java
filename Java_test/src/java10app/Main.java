package java10app;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		PoisonMatango pm = new PoisonMatango('A');
		Hero h = new Hero();
		SuperHero sh = new SuperHero();
		m.attack(h);
		pm.attack(h);
		h.run();
		sh.run();//このように親クラスに同じメンバがあれば上書きされなければ追加される（オーバーライド）オバロではない
		/* 練習問題10-1
		 * 2,3,5
		 * 練習問題10-3
		 * ポイズンマタンゴ
		 */
	}

}
