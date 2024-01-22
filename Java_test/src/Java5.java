
public class Java5 {

	public static void main(String[]args) {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
		//mainメソッド以外からでも呼び出せるがmainに繋がらないと動かない
		method();
		hellos("山田");
		hellos("田中");
		hellos("高橋");
		//（）内を実引数という
		add(100,20);
		add(200,50);
		//戻り値を使ったメソッド
		int ans2 = add2(100,10);
		System.out.println("100 + 10 = " + ans2);
		System.out.println(add2(50,50));
	}
	//メソッド
	public static void hello() {
		System.out.println("山田さん、こんにちは");
	}
	//main以外でのメソッドの呼びだし
	public static void method() {
		hello();
	}
	//引数を使ったメソッド
	public static void hellos(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	//複数の引数を渡す(仮引数）
	public static void add(int x,int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	//戻り値を使ったメソッド
	public static int add2(int x2, int y2) {
		int ans2 = x2 + y2;
		return ans2;
	}
}
