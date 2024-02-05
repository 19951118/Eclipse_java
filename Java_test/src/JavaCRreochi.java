
public class JavaCRreochi {
//CRれおっち
	public static void main(String[] args) {
		int win = 0;
		for (int i = 0;;i++) {
			int heso = new java.util.Random().nextInt(319);
			if(win == heso) {
				System.out.println(i + "回転目");
				int fever = new java.util.Random().nextInt(2);
				if(win == fever) {
					System.out.println("ビッグボーナス！");
					for(int n = 0; n < 100; n++) {
						int renchan = new java.util.Random().nextInt(100);
						if(win == renchan) {
							System.out.println("an");
						}
					}
				}else {
					System.out.println("レギュラーボーナス！");
				}
				
				break;
			}
		}
	}

}
