
public class Java4 {

	public static void main(String[] args) {
		
		System.out.println("少年テスト点数管理プログラム");
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;
		int sum = sansu + kokugo + rika + eigo + syakai;
		
		int avg = sum / 5;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);
		//配列の作成の仕方
		int[] scores = new int[5];
		//配列の要素数の取得
		int num = scores.length;
		System.out.println("要素の数;" + num);
		scores[1] = 30; //2つめの要素に代入。要素は0からスタートするため要注意
		System.out.println(scores[1]); //2つめの要素表示（代入されていない場合は0が出力される）
		//省略記法
		int[] scoress = new int[] {20, 30, 40, 50, 80};
		int[] scoresss = {20, 30, 40, 50, 80};
		
		System.out.println("少年テスト点数管理プログラム2");
		int [] scores2 = {20, 30, 40, 50, 80};
		int sum2 = scores2[0] + scores2[1] + scores2[2] + scores2[3] + scores2[4];
		int avg2 = sum / scores2.length;
		System.out.println("合計点" + sum2);
		System.out.println("平均点" + avg2);
		
		System.out.println("少年テスト点数管理プログラム3改");
		int[] scores3 = {20, 30, 40, 50, 80};
		int sum3 = 0; //変数を事前に初期化
		int count = 0;
		for(int i = 0; i < scores3.length; i++) {
			sum3 += scores3[i];
			if(scores3[i] >= 50) {
				count++;
			}
		}
		int avg3 = sum3 / scores3.length;
		System.out.println("合計点" + sum3);
		System.out.println("平均点" + avg3);
		System.out.println("50点以上の科目の数は" + count);
		
		//拡張for文
		int[] scores4 = {20, 30, 40, 50, 80};
		for (int value : scores4) { //要素の型　任意の変数名：配列変数名
			System.out.println(value);
		}
		
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		//配列のアドレスは代入すると同じアドレスになるため、このように代入先に変数を宣言すると代入元も変わってしまう。
		//ブロックの中で使った配列はガレージコレクション、＝nullを使い参照を切るようにする。
		
		//多次元配列
		int[][] scores5 = new int[2][3]; //2行と3列の配列
		scores5[0][0] = 40;
		scores5[0][1] = 50;
		scores5[0][2] = 60;
		scores5[1][0] = 80;
		scores5[1][1] = 60;
		scores5[1][2] = 70;
		//int[][] scores5 = {{40,50,60}{80,60,70}};こちらでも可能
		System.out.println(scores5[1][1]);
		System.out.println(scores5.length);
		System.out.println(scores5[0].length);
		
		//練習問題4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		//練習4-2
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for ( int money : moneyList) {
			System.out.println(money);
		}
		
		//練習4-3
		
		//練習4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int nums : numbers) {
			if (nums == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
