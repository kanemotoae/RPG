package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	// コンストラクタ
	public Dragon(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(270, 330); // ヒットポイントをランダムに設定
		this.offensive = Dice.get(12, 18); // 攻撃力をランダムに設定
	}
}