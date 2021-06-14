package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Drunk extends Role{
	@Override
	public void create(String player, Team team) {
		new Drunk(player, team);
	}
	
	public Drunk(String player, Team team) {
		this.setRolePlayed(this, "Drunk");
		this.init(player, team);
	}
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle) {
			//Ne marche pas attention faire que les joueur au role modifier peuvent comme jouer et que les role puissent changer plusieurs fois
			Role container = p.nvRole;
			p.nvRole = this.nvRole;
			this.nvRole = container;
				
		}else {
			player.sendMessage("§cChoisiser une carte au milieu pas un joueur");
		}
	}
}
