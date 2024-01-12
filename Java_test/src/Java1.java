
public class Java1 {

	public static void main(String[] args) {
		//ここからmainメソッド
		System.out.println("Hello Java!!");
		System.out.println("+をつけると変数や数列型と併用できる"+ 20);
		System.out.println("計算もできるが文字列とは併用で来なさそう");
		System.out.println(10+10);
		int  x;
		x = 5;
		//このような形でまとめられる。finalをつけることで再宣言を防げる。
		final int y = 3;
		System.out.println(x * x * 5 + 3);
		// 変数の再宣言。データ型は宣言しない。
		x = 2;
		System.out.println(y + x);
	}
}
