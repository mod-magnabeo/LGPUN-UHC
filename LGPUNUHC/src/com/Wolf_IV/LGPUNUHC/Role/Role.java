package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Role {
	boolean rMiddle = false;
	Role rolePlayed;
	String sRolePlayed;
	Role nvRole;
	
	Role pre;
	Role next;
	
	public boolean active = true;
	public boolean isTurn = false;
	static int numOrdre;
	int ordre;
	//public static Role[] role = new Role[25];
	public Joueur player;

	static Role rNow;
	public boolean wPlay = true;
	public void init(Joueur p) {
		p.role = this;
		System.out.println("hello");
		if(p == null) {
			rMiddle = true;
		}else {
		this.player = p;
		}
		/*if(Bukkit.getPlayer(this.player) != null) {
			Bukkit.getPlayer(this.player).sendMessage("Vous Etes "+this.sRolePlayed);
		}*/
		
				ordre = numOrdre;
				if(player.team.roleNow != null) {
					player.team.roleNow.pre = this;
					this.next = player.team.roleNow;
					player.team.roleNow = this;
				}else {
					player.team.roleNow = this;
				}
				player.team.role[ordre] = this;
				numOrdre++;
				nvRole = this;
				System.out.println(ordre);
				
		
		
	}
	
	public boolean play() {
		if(this.player == null) {
			return false;
		}
		Player player = Bukkit.getPlayer(this.player.player);
		if(player != null) {
			player.sendMessage("A votre tour de jouer faire /play");
		}
		isTurn = true;
		this.player.team.roleNow = this;
		if(wPlay) {
		this.onPlay();
		}else {
			end();
		}
		return true;
		
	}
	
	public void change(Role r, int o, Role rA) {
		//role[o].active = false;
		Joueur joueur = player.team.role[o].player;
		player.team.role[o]=null;
		 joueur.role = r.create(rA.player);
	} 
	/**
	 * A override créer un nouveau role du meme type
	 * @return 
	 */
	public Role create(Joueur player) {
		return null;
		
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
		isTurn = false;
		if(player.team.roleNow.next != null) {
			player.team.roleNow.next.play();
		}else {
			Bukkit.broadcastMessage("Role Terminé");
		}
		
	}
	
	
	public Player getPlayer() {
		return Bukkit.getPlayer(player.player);
		
	}
	
	
	
	public void setRolePlayed(Role r, String s) {
		this.rolePlayed = r;
		this.sRolePlayed = s;
	}
	
	
	

}
