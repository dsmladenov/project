package backend.ablility;

import java.util.List;

import backend.champion.Champion;

public interface Ability {

	public void execute(final Champion sourceChampion, final List<Champion> targets);
	
}
