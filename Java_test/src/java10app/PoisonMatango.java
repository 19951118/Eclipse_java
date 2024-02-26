package java10app;

public class PoisonMatango extends Matango {
	int poisonAttack = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if(poisonAttack > 0) {
			System.out.println("更に毒の胞子をばらまいた！");
			int dmg =h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonAttack--;
		}
	}

}
