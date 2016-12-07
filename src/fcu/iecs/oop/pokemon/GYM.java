package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class GYM {
	public static Player fight(Player player1,Player player2){
		Player p3 = new Player("");
		Pokemon[] p1 = player1.getPokemon();
		Pokemon[] p2 = player2.getPokemon();
		int i,t,a=0,b=0;
		for(i=0;i<3;i++){
			if(p1[i].getPokemonType()==PokemonType.FIRE){
				if(p2[i].getPokemonType()==PokemonType.FIRE){
					if(p1[i].getCp()>p2[i].getCp())
						a++;				
					else if(p1[i].getCp()==p2[i].getCp()){
						t = (int)(Math.random()*2);
						if(t==1)
							a++;
						else
							b++;
					}
					else
						b++;
				}
				else if(p2[i].getPokemonType()==PokemonType.WATER)
					b++;
				else
					a++;
			}
			else if(p1[i].getPokemonType()==PokemonType.WATER){
				if(p2[i].getPokemonType()==PokemonType.WATER){
					if(p1[i].getCp()>p2[i].getCp())
						a++;
					else if(p1[i].getCp()==p2[i].getCp()){
						t = (int)(Math.random()*2);
						if(t==1)
							a++;
						else
							b++;
					}
					else
						b++;
				}
				else if(p2[i].getPokemonType()==PokemonType.GRASS)
					b++;
				else
					a++;
				
			}
			else{
				if(p2[i].getPokemonType()==PokemonType.GRASS){
					if(p1[i].getCp()>p2[i].getCp())
						a++;
					else if(p1[i].getCp()==p2[i].getCp()){
						t = (int)(Math.random()*2);
						if(t==1)
							a++;
						else
							b++;
					}
					else
						b++;
				}
				else if(p2[i].getPokemonType()==PokemonType.FIRE)
					b++;
				else
					a++;
			}
			if(a==2){
				p3 = player1;
				break;
			}
			if(b==2){
				p3 = player2;
				break;
			}
		}
		p3.setLevel(p3.getLevel()+1);
		System.out.println("Winner is " + p3.getPlayerName() + ",and his/her level become" + p3.getLevel());
		return p3;
		
	}

}
