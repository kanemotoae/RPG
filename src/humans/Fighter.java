package humans;

import bases.Human;
import utils.Dice;

// FighterクラスはHumanクラスを継承する
public class Fighter extends Human {

	// コンストラクタ
	public Fighter(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(240, 300); // ヒットポイントを乱数で設定
		this.offensive = Dice.get(17, 23); // 攻撃力を乱数で設定
	}
}