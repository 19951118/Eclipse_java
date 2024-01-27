//クラスが増えてきたらパッケージで分けることができる
package java6app.main;
//import文を使うことでその後のFQCNを省略することができる
//全クラスインポートしたい場合は .* とつけることでパケ内すべてをインポートできるが、パケ外には影響しない。
import java6app.logic.Java6Logic;
public class Java6 {

	public static void main(String[] args) {
		//メソッドを呼び出す際にもパケ名とメソッドを宣言（完全限定クラス名（FQCN））して呼び出す
		//省略形
		int total = Java6Logic.tasu(10, 2);
		//FQCNで指定しても良い
		int delta = java6app.logic.Java6Logic.hiku(10, 2);
		System.out.println("足すと" + total + "、引くと" + delta);
		
		

	}

}
