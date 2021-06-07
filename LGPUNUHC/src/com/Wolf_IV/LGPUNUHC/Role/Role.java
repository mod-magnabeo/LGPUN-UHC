package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Role {
	Role rolePlayed;
	String sRolePlayed;
	boolean active = true;
	int ordre;
	static Role[] role = new Role[25];
	String player;
	Team team;
	static Role rNow;
	public void init(String p, Team t) {
		this.player = p;
		this.team = t;
		if(Bukkit.getPlayer(this.player) != null) {
			Bukkit.getPlayer(this.player).sendMessage("Vous Etes "+this.sRolePlayed);
		}
		for(int i=0;i<24;i++) {
			if(role[i] != null) {
				ordre = i;
				role[i] = this;
			}
		}
	}
	
	public boolean play() {
		Player player = Bukkit.getPlayer(this.player);
		if(player != null) {
			player.sendMessage("A votre tour de jouer");
			rNow = this;
		return true;
		}
		return false;
		
	}
	
	public void change(Role r, int o, Role rA) {
		role[o].active = false;
		 r.create(rA.player, rA.getTeam());
	}
	
	public void create(String player, Team team) {
		
	}

	public void clickPlayer(Role p, Player player) {
		
	}
	
	
	public Player getPlayer() {
		return Bukkit.getPlayer(player);
		
	}
	
	public Team getTeam() {
		return team;
		
	}
	
	public void setRolePlayed(Role r, String s) {
		this.rolePlayed = r;
		this.sRolePlayed = s;
	}
	
	

}
