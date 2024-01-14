
public class Java2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("式は\"オペランド\"と\"演算子\"からなる。具体的な数値は\"リテラル\"という。"
				+ "ちなみに今重要句も囲っているバックスラッシュを\"エスケープシーケンス\"という");
		String TextBlock1 = "改行したい場合は\nと打つことで改行できる他\n";
		String TextBlock2 = """
							このように囲むことで、改行を含めた情報を入力できる。
							インデントはこのような感じで合わせよう。
							因みに最も左に打った文字が左端の基準になるからインデントは合わせてok。
							""";
		System.out.println(TextBlock1 + TextBlock2);
		System.out.println("式の計算は通常の計算と同じの優先順がある。文字と計算を一つの変数にいれるときなどは（）を使って優先順位を上る必要がある。");
		System.out.println("同じ変数にを使い計算する代入演算子は、複合代入演算子として下記のように省略できる。\n"
				+ "また1だけ足し引きしたい場合はインクリメント、デクリメント演算子が便利。\n"
				+ "ただしバグの原因となることがあるため他の演算子とは一緒に使わないこと");
		int a = 2;
		int b = 3;
		a = a + 2;
		a += 2;
		b++;
		a--;
		System.out.println(a + b);
		System.out.println("javaにはデータ型を自動変換する機能がある。数列型にはそれぞれ箱の大きさがあり、大きい方には代入できる。\n"
				+ "異なる型同士の計算をすると自動代入される。強制代入は使わないこと。");
		
		System.out.println("命令文、改行なし、比較、文字から整数、乱数、文字を受け取る");
		System.out.print("この出力の仕方は前文から改行されない");
		
		int c = Math.max(a,b);
		System.out.println("比較実験" + a + "と" + b + "では大きいのは" + c);
		
		String agee = "28";
		int aage = Integer.parseInt(agee);
		System.out.println("私は今年" + (aage + 1) + "歳になります");
		
		int r = new java.util.Random().nextInt(80);
		System.out.println("あなたの年齢はおそらく" + r + "歳ですね");
		
		System.out.println("１行分の文字列を入力できる。");
		String namee = new java.util.Scanner(System.in).nextLine();
		System.out.println("一つの整数を入力できる");
		int aaage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + aaage + "歳の" + namee + "さん");
		
		System.out.println("練習2-1");
		int x = 5;
		int y = 10;
		String ans = "x + yは" + (x + y);
		System.out.println(ans);
		
		System.out.println("練習2-2");
		System.out.println("正しい文法を選ぶ");
		System.out.println("②④⑤⑦");
		double d = 2.0F;
		String s = 2 + "人目";
		byte m = 1;
		short n = (byte)2;
		
		System.out.println("練習2-3");
		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください>");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力してください>");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果がでました。");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です！");
		System.out.println("(1:大吉 2:中吉 3:吉 4:凶");
		
	}
}
