package fcu.iecs.oop.pokemon;

import java.util.Deque;

public class Pokemon {
	private String name;
	private int cp;
	private PokemonType type;
	public enum PokemonType {
		  FIRE , WATER, GRASS
	}
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.cp=cp;
		this.type=type;
	}
	public String getName(){
		return name;
	}
	public PokemonType getPokemonType(){
		return type;
	}
	public void setCp(int Cp){
		this.cp = Cp;
	}
	public int getCp(){
		return cp;
	}
	
}
