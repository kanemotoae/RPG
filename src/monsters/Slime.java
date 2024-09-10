package monsters;

import bases.Living;
import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	// コンストラクタ
	public Slime(String name, String weapon) {
		super(name, weapon);
		this.hp = Dice.get(70, 130); // ヒットポイントをランダムに設定
		this.offensive = Dice.get(5, 11); // 攻撃力をランダムに設定
	}

	// attackメソッドの実装
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