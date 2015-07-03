package game.data.champions;

import game.data.abilities.Ability;
import game.data.effects.Effect;

import java.util.List;

public class ChampionHelper {

	public static Champion copyChampion(final Champion cmp) {
		final Champion copy = new Champion();

		copyStats(copy, cmp);

		return copy;
	}

	public static Champion copyChampion(final Champion cmp,
			final List<Ability> abilities, final List<Effect> appliedEffects) {
		final Champion copy = new Champion();

		copyStats(copy, cmp);

		if (abilities != null) {
			copy.setAbilities(abilities);
		}

		if (appliedEffects != null) {
			copy.setAppliedEffects(appliedEffects);
		}

		return copy;
	}

	private static void copyStats(final Champion copy, final Champion cmp) {
		copy.setHealth(cmp.getHealth());
		copy.setManaCrystals(cmp.getManaCrystals());
		copy.setAttack(cmp.getAttack());
		copy.setDefence(cmp.getDefence());
		copy.setMagicAttack(cmp.getMagicAttack());
		copy.setMagicDefence(cmp.getMagicDefence());
		copy.setSpeed(cmp.getSpeed());
	}


}
