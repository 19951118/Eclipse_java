package java9app;

public class Java9main {
	public static void main(String[]args) {
		Java9sword s = new Java9sword();
		s.name = "炎の剣";
		s.damage = 10;
		Java9hero h = new Java9hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword =s;
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println(h.name + "は" + h.sword.name +"で攻撃した！\n相手に" + h.sword.damage + "のダメージ！");
		
		Java9hero h2 = new Java9hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Java9wizard w = new Java9wizard("スガワラ");//コンストラクタに名前の引数を渡している。
		Java9wizard w2 = new Java9wizard();
		
		w.heal(h);
		w.heal(h2);
		w.heal(h2);
		w2.meiso();
		
	}

}
