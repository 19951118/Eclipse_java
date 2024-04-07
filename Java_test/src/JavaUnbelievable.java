
public class JavaUnbelievable {

	public static void main(String[] args) {
		//奇跡体験！アンビリバボー
		char[] miracle = {'奇', '跡', '体', '験', '！','ア', 'ン', 'ビ', 'リ', 'バ', 'ボ', 'ー'};
		for(int i = 0; i < miracle.length; i++) {
			int num = new java.util.Random().nextInt(12);
			System.out.print(miracle[num]);
		}

	}

}
