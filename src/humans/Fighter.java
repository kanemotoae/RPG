package humans;

import bases.Human;
import bases.Living;
import utils.Dice;

// FighterクラスはHumanクラスを継承する
public class Fighter extends Human {

	// コンストラクタ
	public Fighter(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(240, 300); // ヒットポイントを乱数で設定
		this.offensive = Dice.get(17, 23); // 攻撃力を乱数で設定
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		int damage = Dice.get(1, 10) * this.offensive;
		target.setHp(target.getHp() - damage);
		this.offensive--;

		System.out.println(
				this.getName() + "が" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}