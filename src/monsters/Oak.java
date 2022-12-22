package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	public Oak(String name, String weapon) {
		super(name, weapon);
		
		//ヒットポイント
		this.hp = Dice.get(170, 230);
		
		//攻撃力
		this.offensive = Dice.get(9, 15);
	}
}
