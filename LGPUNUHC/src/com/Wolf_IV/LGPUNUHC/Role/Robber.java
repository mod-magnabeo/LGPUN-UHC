package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Robber extends Role{
	@Override
	public void create(String player, Team team) {
		new Seer(player, team);
	}
	
	public Robber(String player, Team team) {
		this.setRolePlayed(this, "Robber");
		this.init(player, team);
	}
	
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle) {
			player.sendMessage("§cChoisiser un joueur pas une carte au milieu");	
		}else {
			//Ne marche pas attention faire que les joueur au role modifier peuvent comme jouer et que les role puissent changer plusieurs fois
			Role container = p.nvRole;
			p.nvRole = this.nvRole;
			this.nvRole = container;
			player.sendMessage("Votre role et celui de "+p.player+" on été invertis vous devenez donc "+this.nvRole);
		}
	}
}
