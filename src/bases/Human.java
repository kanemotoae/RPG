package bases; //basesというフォルダの中にこのプログラムが入っていることを示す。

//人間を表現する抽象クラス(＝処理を記述しない、abstractを指定)
//人間というキャラクターを作るための設計図を作る。Livingという他の設計図をもとにして人間の特徴を追加する。
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) { // 引数をname,weaponの2つとするコンストラクタを作成、人間を作るにあたりnameとweaponを決める。
		super(name, weapon);// Livingクラスで定義したコンストラクタを利用
	}

	// attackメソッドのオーバーライド
	// 人間が他のキャラクターを攻撃するための方法を決める。targetは攻撃される相手。
	@Override
	public void attack(Living target) {

		// 1から10までのサイコロを振る(Diceクラスを利用する)、
		// 自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = utils.Dice.get(1, 10) * this.offensive;

		target.setHp(target.getHp() - damage);// 相手のHPをダメージ値だけ減らす

		this.offensive--;// 自分の攻撃力を1だけ減らす

		// コンソールにステータスを表示
		// thisは今のキャラクター(人間)を指す。gerName()はそのキャラクターの名前を取得するメソッド。
		System.out.println("「" + this.getName() + "」" + "が" + "「" + this.getWeapon() + "」" + "で攻撃！" + "」" + "「"
				+ target.getName() + "」" + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。"); // コンソールにステータスを表示

	}
}