package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Role {
	boolean rMiddle = false;
	Role rolePlayed;
	String sRolePlayed;
	public boolean active = true;
	static int numOrdre;
	int ordre;
	public static Role[] role = new Role[25];
	public String player;
	Team team;
	static Role rNow;
	public void init(String p, Team t) {
		System.out.println("hello");
		if(p == null) {
			rMiddle = true;
		}else {
		this.player = p;
		this.team = t;
		}
		/*if(Bukkit.getPlayer(this.player) != null) {
			Bukkit.getPlayer(this.player).sendMessage("Vous Etes "+this.sRolePlayed);
		}*/
		
				ordre = numOrdre;
				role[ordre] = this;
				numOrdre++;
				System.out.println(ordre);
		
		
	}
	
	public boolean play() {
		//System.out.println("A votre tour de jouer");
		if(this.player == null) {
			return false;
		}
		Player player = Bukkit.getPlayer(this.player);
		if(player != null) {
			player.sendMessage("A votre tour de jouer");
		}
		
		rNow = this;
		this.onPlay();
		return true;
		
	}
	
	public void change(Role r, int o, Role rA) {
		role[o].active = false;
		 r.create(rA.player, rA.getTeam());
	}
	/**
	 * A override créer un nouveau role du meme type
	 */
	public void create(String player, Team team) {
		
	}
	/**
	 * Actionner quand joueur click
	 * @param p
	 * @param player
	 */
	public void clickPlayer(Role p, Player player) {
		
	}
	/**
	 * Actionner quand joueur joue
	 */
	public void onPlay() {
		
	}
	/**
	 * Passe au prochain joueur
	 */
	public void end() {
		if(this.getPlayer() != null) {
			this.getPlayer().sendMessage("§aC'est la fin de votre tour");
		}
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
