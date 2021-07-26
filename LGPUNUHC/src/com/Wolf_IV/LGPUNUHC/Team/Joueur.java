package com.Wolf_IV.LGPUNUHC.Team;

import com.Wolf_IV.LGPUNUHC.MainL;
import com.Wolf_IV.LGPUNUHC.Role.Role;

public class Joueur {
	public static Joueur[] joueurs = new Joueur[100];
	static int i = 0;
	public String player;
	public Role role;
	public Team team;
	public Joueur(String player, Team team) {
		joueurs[i] = this;
		i++;
		this.player = player;
		this.team = team;
		MainL.main.getServer().getPluginManager().registerEvents(new JListener(this), MainL.main);
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
