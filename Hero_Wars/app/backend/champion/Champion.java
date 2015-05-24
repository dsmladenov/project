package backend.champion;

import java.util.List;

import backend.ablility.Ability;
import backend.effect.Effect;

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

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getManaCrystals() {
		return manaCrystals;
	}

	public void setManaCrystals(int manaCrystals) {
		this.manaCrystals = manaCrystals;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	public double getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(double magicAttack) {
		this.magicAttack = magicAttack;
	}

	public double getMagicDefence() {
		return magicDefence;
	}

	public void setMagicDefence(double magicDefence) {
		this.magicDefence = magicDefence;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public List<Effect> getAppliedEffects() {
		return appliedEffects;
	}

	public void setAppliedEffects(List<Effect> appliedEffects) {
		this.appliedEffects = appliedEffects;
	}
	
	
	
}
