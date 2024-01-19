
public class JavaUnbelievable {

	public static void main(String[] args) {
		//奇跡体験！アンビリバボー
		int[] num = new int[12];
		for(int i = 0; i < num.length; i++) {
			num[i] = new java.util.Random().nextInt(12);
		}
		for(int value : num) {
		char[] miracle = {'奇', '跡', '体', '験', '！','ア', 'ン', 'ビ', 'リ', 'バ', 'ボ', 'ー'};
		System.out.print(miracle[value] + " ");
		}

	}

}
