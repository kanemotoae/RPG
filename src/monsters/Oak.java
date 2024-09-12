package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	// コンストラクタ
	public Oak(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(170, 230); // ヒットポイントをランダムに設定
		this.offensive = Dice.get(9, 15); // 攻撃力をランダムに設定
	}
}