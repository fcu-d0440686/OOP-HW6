package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class Player {
	private String PlayerName;
	private Pokemon[] pokemons = new Pokemon[3];
	private int level;
	public Player(String PlayerName){
		this.level=1;
		this.PlayerName=PlayerName;
	}
	
	public String getPlayerName(){
		return PlayerName;
	}
	public void setPlayerName(String playerName){
		this.PlayerName = playerName;
	}
	
	public void setPokemon(Pokemon[] pokemons){
		this.pokemons=pokemons;
	}
	public Pokemon[] getPokemon(){
		return pokemons;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	
}