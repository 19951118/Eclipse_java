package java8app.main;
public class Java8hero {
	/*フィールドとメソッドは　メンバ　と総称。命名ルールとして以下参照
	 * クラス名　　　名詞　頭大文字
	 * フィールド名　名詞　最初以外の単語頭大文字
	 * メソッド名　　動詞　最初以外の単語頭大文字　
	 */
	
	//属性の定義。クラス属性内で定義した変数は　フィールド　と呼ぶ
	String name; //名前の定義
	int hp;      //HPの宣言
	
	//操作の定義
	public void attack(){
		
	}
	public void sleep() {
		this.hp = 100;//this変数は自身のインスタンスを意味している。
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit (int sec) {//座る。引数により座る秒数取得。秒数分回復
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！\nHPが" + sec + "ポイント回復した");
	}
	public void slip() {//転ぶ
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！\n5のダメージ！");
	}
	public void run() {//逃げる
		System.out.println(this.name + "は、逃げ出した！\nGAMEOVER\n最終HPは" + this.hp + "でした");
	}

}
