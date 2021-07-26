package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Seer extends Role{
	int rm = 0;
	@Override
	public Role create(Joueur player) {
		return new Seer(player);
	}
	
	public Seer(Joueur player) {
		this.setRolePlayed(this, "Seer");
		this.init(player);
	}
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle) {
			rm++;
			player.sendMessage("Ce role est "+p.sRolePlayed);
			if(rm == 2) {
				end();
			}
		}else if(rm == 0){
			player.sendMessage("Ce role est "+p.sRolePlayed);
			end();
		}else {
			player.sendMessage("Choisiser un role du milieux");
		}
	}
	
	
	
}
