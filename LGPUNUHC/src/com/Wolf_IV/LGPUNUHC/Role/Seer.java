package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Seer extends Role{
	int rm = 0;
	@Override
	public void create(String player, Team team) {
		new Seer(player, team);
	}
	
	public Seer(String player, Team team) {
		this.setRolePlayed(this, "Seer");
		this.init(player, team);
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
