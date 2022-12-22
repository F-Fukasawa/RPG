package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		super(name, weapon);
		
		//ヒットポイント
		this.hp = Dice.get(170, 230);
		
		//攻撃力
		this.offensive = Dice.get(7, 13);
	}
}
