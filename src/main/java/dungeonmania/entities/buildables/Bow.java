package dungeonmania.entities.buildables;

import dungeonmania.Game;
import dungeonmania.battles.BattleStatistics;
import dungeonmania.entities.BattleItem;

public class Bow extends Buildable implements BattleItem {
    private int durability;

    public Bow(int durability) {
        this.durability = durability;
    }

    @Override
    public BattleStatistics applyBuff(BattleStatistics origin) {
        return BattleStatistics.applyBuff(origin, new BattleStatistics(
            0,
            0,
            0,
            2,
            1));
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public void use(Game game) {
        durability--;
        if (durability <= 0) {
            game.useInventoryItem(this);
        }
    }
}
