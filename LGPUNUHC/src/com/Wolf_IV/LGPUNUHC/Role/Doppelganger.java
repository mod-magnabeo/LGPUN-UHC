package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Doppelganger extends Role {
	
	@Override
	public void create(String player, Team team) {
		new Doppelganger(player, team);
	}
	
	public Doppelganger(String player, Team team) {
		this.setRolePlayed(this, "Doppelgänger");
		this.init(player, team);
	}
	
	@Override
	public void clickPlayer(Role p, Player player) {
		player.sendMessage(p.player+" est "+p.sRolePlayed+" vous devenez donc ce role");
		this.change(p, this.ordre, this);
	}
	
	

}
