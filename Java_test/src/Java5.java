
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
		//変数を使わずにも戻り値は受け取れる
		System.out.println(add2(50,50));
		
		/*メソッドのオーバーロード
		 *仮引数の型か個数(シグネチャ）が違えば同じ名前のメソッドも複数定義できる
		 */
		
		int[] array = {1,2,3};
		//メソッドに渡しているのはアドレス情報のみ
		printArray(array);
		/*基本型の変数の場合引数として中身がコピーされる（値渡し）が、配列の場合は配列先頭のアドレスが渡されるため
		 * メソッド内で書き換えた内容は呼び出し元にも影響される。
		 * メソッドの方を拡張for文にしたら影響されなさそう。
		 */
		for (int i : array) {
			System.out.print(i);
			//コラムーこれでprint文のfor文でも最後に改行できる
			if(i == array[array.length - 1]) {
				System.out.println();
			}
		}
		//戻り値に配列を用いる
		int[] n = makeArray(3);
		for(int i : n) {
			System.out.println(i);
		}
		//練習5-1
		introduceOneself();
		//練習5-2
		String title = "メールのタイトル";
		String address = "メールの宛先アドレス";
		String text = "メールの本文";
		email(title,text,address);
		//練習5-3
		email(address,text);
		//練習5-4
		double bottom = 10.0;
		double height = 5.0;
		double triangleAns = calcTriangleArea(bottom,height);
		System.out.println(triangleAns);
		
		double radius = 5.0;
		double circleAns = calcCircleArea(radius);
		System.out.println(circleAns);
		//引数には値を直接入れても良い
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
		//returnは戻り値だけではなくメソッドの終了も意味するためこれより下のブロック内は実行されない
	}
	//配列を使ったメソッド
	public static void printArray(int[] array){
		for(int i : array) {
			i++;
			System.out.println(i);
		}
		for(int i = 0; i < array.length; i++) {
			array[i]++;
			System.out.println(array[i]);
		}
	}
	//配列の戻り値を使ったメソッド
	public static int[] makeArray(int size) {
		int newArray[] = new int[size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] =i;
		}
		return newArray;
	}
	//練習5-1
	public static void introduceOneself(){
		String name = "湊雄輔";
		int age = 22;
		double height = 169.9;
		char eto = '辰';
		System.out.println("私の名前は" + name + "です。歳は" + age + "です。身長は" + height + "です。\n"
				+ "十二支は" + eto + "です。");
	}
	//練習5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました\n件名:" + title + "\n本文:" + text);
	}
	//練習5-3
	public static void email(String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました\n件名：無題\n本文：" + text);
	}
	//練習5-4
	public static double calcTriangleArea(double bottom,double height) {
		double triangleAns = bottom * height / 2;
		return triangleAns;
	}
	public static double calcCircleArea(double radius) {
		double circleAns = radius * radius * 3.14;
		//変数に入れずに、式を直接戻り値にしても良い
		return circleAns;
	}
}
