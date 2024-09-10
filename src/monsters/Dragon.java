package monsters;

import bases.Living;
import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	// コンストラクタ
	public Dragon(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(270, 330); // ヒットポイントをランダムに設定
		this.offensive = Dice.get(12, 18); // 攻撃力をランダムに設定
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