package com.Wolf_IV.LGPUNUHC.Role;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Insomiac extends Role{
	@Override
	public void create(String player, Team team) {
		new Insomiac(player, team);
	}
	
	public Insomiac(String player, Team team) {
		this.setRolePlayed(this, "Insomiac");
		this.init(player, team);
	}
	
	@Override
	public void onPlay() {
		if(this.getPlayer() != null) {
		this.getPlayer().sendMessage("Actuellement vous etes "+this.nvRole.sRolePlayed);
		end();
	}
	}
	
}
