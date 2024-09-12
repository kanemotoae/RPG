package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	// コンストラクタ
	public Wizard(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(120, 180); // ヒットポイントを乱数で設定
		this.offensive = Dice.get(12, 18); // 攻撃力を乱数で設定
	}
}