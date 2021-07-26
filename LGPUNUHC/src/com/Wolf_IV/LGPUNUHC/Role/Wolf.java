package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Wolf extends Role{
	@Override
	public Role create(Joueur player) {
		return new Wolf(player);
	}
	
	public Wolf(Joueur player) {
		this.setRolePlayed(this, "WereWolf");
		this.init(player);
	}
	@Override
	public void onPlay() {
		int wCount = 0;
		String player = "null";
		for(Role r : this.player.team.role) {
			if(r != null && r instanceof Wolf) {
				wCount++;
				if(!r.player.player.equalsIgnoreCase(this.player.player)) {
					if(player.equalsIgnoreCase("null")) {
					player = r.player.player;
					}else {
						player = player+" et "+r.player.player;
					}
				}
			}
		}
		if(wCount >=2) {
			if(this.getPlayer() != null){
				this.getPlayer().sendMessage("Tu est seul, tu peut donc visioner une carte du milieu");
			}
		}else {
			if(this.getPlayer() != null){
				this.getPlayer().sendMessage("§bVous etes loup-garou avec"+player);
			}
			end(); 
		}

	}
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle == false) {
			player.sendMessage("Le Role que vous avez visioner est "+p.sRolePlayed);
			//System.out.println(p.player+" est "+p.sRolePlayed+" vous devenez donc ce role");
			this.end();
			}else {
				player.sendMessage("§cChoisiser une carte du milieu");
			}
	}
}
