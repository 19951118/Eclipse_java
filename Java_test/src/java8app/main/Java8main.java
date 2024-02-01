package java8app.main;

public class Java8main {

    public static void main(String[] args) {
        // 勇者インスタンスを生成
        Java8hero h = new Java8hero();  // パッケージも修正
        // フィールドを初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");
        // 勇者のメソッドを呼び出しておく
        h.sit(5);  // 5秒座れ
        h.slip();  // 転べ
        h.sit(25);  // 25秒座れ
        h.run();  // 逃げろ

        Java8matango m1 = new Java8matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Java8matango m2 = new Java8matango();
        m2.hp = 50;
        m2.suffix = 'B';

        // 冒険の始まり
        h.slip();
        m1.run();
        m2.run();
        h.run();
        
        //練習問題
        Java8cleric c = new Java8cleric();
        c.selfAid();
        c.pray(4);
        
        
    }
}
