package java8app.main;

public class Java8cleric {
	String name = "聖職者";
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("聖職者はセルフエイドを使った！\nMPを５消費、HPが" + this.hp + "まで回復した！");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った！");
		int mpup = sec + new java.util.Random().nextInt(3);
		int aid = this.MAX_MP - this.mp;
		this.mp += mpup;
		
		if (this.mp >= MAX_MP) {
			this.mp = MAX_MP;
			System.out.println("MPが" + aid + "回復、MPが最大になった！");
			return aid;
		}else {
			System.out.println("MPが" + mpup + "回復し、" + this.mp + "になった！");
			return mpup;
		}
		//反省
		//APIを使えばもっと簡略化できた
	}
}
//こたえ
//import java.util.*;
//
//public class Cleric {
//  String name;
//  int hp = 50;
//  final int MAX_HP = 50;
//  int mp = 10;
//  final int MAX_MP = 10;
//
//  public void selfAid() {
//    System.out.println(this.name + "はセルフエイドを唱えた！");
//    this.hp = this.MAX_HP;
//    this.mp -= 5;
//    System.out.println("HPが最大まで回復した");
//  }
//
//  public int pray(int sec) {
//    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
//
//    // 論理上の回復量を乱数を用いて決定する
//    int recover = new Random().nextInt(3) + sec;
//
//    // 実際の回復量を計算する
//    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
//
//    this.mp += recoverActual;
//    System.out.println("MPが" + recoverActual + "回復した");
//    return recoverActual;
//  }
//}
//
