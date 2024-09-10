package bases;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ

	public Monster(String name, String weapon) {
		super(name, weapon);// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		int damage = utils.Dice.get(1, 10) * this.offensive;// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする

		target.setHp(target.getHp() - damage);// 相手のHPをダメージ値だけ減らす

		// コンソールにステータスを表示
		System.out.println(
				this.getName() + "が" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた。");

	}
}