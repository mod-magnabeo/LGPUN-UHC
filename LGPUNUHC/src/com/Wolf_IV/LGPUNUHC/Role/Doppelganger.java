package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Doppelganger extends Role {
	
	@Override
	public Role create(Joueur player) {
		return new Doppelganger(player);
	}
	
	public Doppelganger(Joueur player) {
		this.setRolePlayed(this, "Doppelgänger");
		this.init(player);
	}
	
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle == false) {
		player.sendMessage(p.player+" est "+p.sRolePlayed+" vous devenez donc ce role");
		//System.out.println(p.player+" est "+p.sRolePlayed+" vous devenez donc ce role");
		this.change(p, this.ordre, this);
		//Si marche pas faire un /play
		this.end();
		}else {
			player.sendMessage("§cChoisiser un joueur");
		}
	}
	
	

}
