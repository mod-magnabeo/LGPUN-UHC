package com.Wolf_IV.LGPUNUHC.Role;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Tanner extends Role{
	@Override
	public Role create(Joueur player) {
		return new Tanner(player);
	}
	
	public Tanner(Joueur player) {
		this.setRolePlayed(this, "Drunk");
		this.init(player);
		this.wPlay = false;
	}
	
}
