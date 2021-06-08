package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Wolf extends Role{
	@Override
	public void create(String player, Team team) {
		new Wolf(player, team);
	}
	
	public Wolf(String player, Team team) {
		this.setRolePlayed(this, "WereWolf");
		this.init(player, team);
	}
	@Override
	public void onPlay() {
		int wCount = 0;
		String player = "";
		for(Role r : this.role) {
			if(r != null && r instanceof Wolf) {
				wCount++;
				if(!r.player.equalsIgnoreCase(this.player)) {
					player = r.player;
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
