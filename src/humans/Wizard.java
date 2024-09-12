package humans;

import bases.Human;
import bases.Living;
import utils.Dice;

public class Wizard extends Human {

	// コンストラクタ
	public Wizard(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(120, 180); // ヒットポイントを乱数で設定
		this.offensive = Dice.get(12, 18); // 攻撃力を乱数で設定
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		int damage = Dice.get(1, 10) * this.offensive;
		target.setHp(target.getHp() - damage);
		this.offensive--;

		System.out.println("「" + this.getName() + "」" + "が" + "「" + this.getWeapon() + "」" + "で攻撃！" + "「"
				+ target.getName() + "」" + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}