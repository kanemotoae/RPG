package monsters;

import bases.Living;
import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	// コンストラクタ
	public Oak(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(170, 230); // ヒットポイントをランダムに設定
		this.offensive = Dice.get(9, 15); // 攻撃力をランダムに設定
	}

	// attackメソッドの実装
	@Override
	public void attack(Living target) {
		int damage = Dice.get(1, 10) * this.offensive;
		target.setHp(target.getHp() - damage);

		System.out.println(
				this.getName() + "が" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた。");
	}
}