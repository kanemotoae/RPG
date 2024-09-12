package humans;

import bases.Human;
import utils.Dice;

// BraveクラスはHumanクラスを継承する
public class Brave extends Human {

	// コンストラクタ
	public Brave(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(170, 230); // ヒットポイントを乱数で設定
		this.offensive = Dice.get(7, 13); // 攻撃力を乱数で設定
	}
}