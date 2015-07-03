package game.data.champions;

import game.data.abilities.Ability;
import game.data.effects.Effect;

import java.util.ArrayList;
import java.util.List;

public class Champion {

	private double health;

	private int manaCrystals;

	private List<Ability> abilities;

	private double attack;

	private double defence;

	private double magicAttack;

	private double magicDefence;

	private double speed;

	private List<Effect> appliedEffects;

	public Champion() {
		this.setAbilities(new ArrayList<>());
		this.setAppliedEffects(new ArrayList<>());
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(final double health) {
		this.health = health;
	}

	public int getManaCrystals() {
		return manaCrystals;
	}

	public void setManaCrystals(final int manaCrystals) {
		this.manaCrystals = manaCrystals;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(final List<Ability> abilities) {
		this.abilities = abilities;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(final double attack) {
		this.attack = attack;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(final double defence) {
		this.defence = defence;
	}

	public double getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(final double magicAttack) {
		this.magicAttack = magicAttack;
	}

	public double getMagicDefence() {
		return magicDefence;
	}

	public void setMagicDefence(final double magicDefence) {
		this.magicDefence = magicDefence;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(final double speed) {
		this.speed = speed;
	}

	public List<Effect> getAppliedEffects() {
		return appliedEffects;
	}

	public void setAppliedEffects(final List<Effect> appliedEffects) {
		this.appliedEffects = appliedEffects;
	}

}
