package game.data.abilities;

import game.data.champions.Champion;

import java.util.List;

public interface Ability {

	public void execute(final Champion sourceChampion, final List<Champion> targets);
	
}
