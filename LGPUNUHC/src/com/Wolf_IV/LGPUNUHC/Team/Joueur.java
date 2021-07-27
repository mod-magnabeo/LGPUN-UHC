package com.Wolf_IV.LGPUNUHC.Team;

import org.bukkit.Bukkit;

import com.Wolf_IV.LGPUNUHC.MainL;
import com.Wolf_IV.LGPUNUHC.Role.Role;

public class Joueur {
	public static Joueur[] joueurs = new Joueur[100];
	static int i = 0;
	public String player;
	public Role role;
	public Team team;
	public Joueur(String player, Team team) {
		this.player = player;
		this.team = team;
		joueurs[i] = this;
		team.joueurs[i] = this;
		i++;
		if(!player.equalsIgnoreCase("")) {
		MainL.main.getServer().getPluginManager().registerEvents(new JListener(this), MainL.main);
		}
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
