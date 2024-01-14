
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
		
		System.out.println("練習1-1");
		System.out.println("javaでプログラムを開発するためには、コンパイラと、インタプリタというソフトウェアが必要です。\n"
				+ "コンパイラは、私達がjavaの文法に沿って記述したソースコードをバイトコードに変換してくれます。\n"
				+ "インタプリタは内部に持っているJVMの仕組みを使ってこれを解釈し、マシン語に変換してCPUに送り、CPUは命令を実行します。");
		System.out.println("練習1-2");
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は" + c);
		System.out.println("練習1-3");
		boolean result = true;
		char yoruni = '駆';
		double pi = 3.14;
		long number = 314159265853979L;
		String msg = "ミナトの攻撃！敵に15Pのダメージを与えた！";
	} 
}

