package com.Wolf_IV.LGPUNUHC.Role;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Insomiac extends Role{
	@Override
	public Role create(Joueur player) {
		return new Insomiac(player);
	}
	
	public Insomiac(Joueur player) {
		this.setRolePlayed(this, "Insomiac");
		this.init(player);
	}
	
	@Override
	public void onPlay() {
		if(this.getPlayer() != null) {
		this.getPlayer().sendMessage("Actuellement vous etes "+this.nvRole.sRolePlayed);
		end();
	}
	}
	
}
