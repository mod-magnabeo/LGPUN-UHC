package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Drunk extends Role{
	@Override
	public Role create(Joueur player) {
		return new Drunk(player);
	}
	
	public Drunk(Joueur player) {
		this.setRolePlayed(this, "Drunk");
		this.init(player);
	}
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle) {
			//Ne marche pas attention faire que les joueur au role modifier peuvent comme jouer et que les role puissent changer plusieurs fois
			Role container = p.nvRole;
			p.nvRole = this.nvRole;
			this.nvRole = container;
			end();
				
		}else {
			player.sendMessage("§cChoisiser une carte au milieu pas un joueur");
		}
	}
}
