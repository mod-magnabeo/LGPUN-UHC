package com.Wolf_IV.LGPUNUHC.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.Wolf_IV.LGPUNUHC.Role.Doppelganger;
import com.Wolf_IV.LGPUNUHC.Role.Drunk;
import com.Wolf_IV.LGPUNUHC.Role.Insomiac;
import com.Wolf_IV.LGPUNUHC.Role.Robber;
import com.Wolf_IV.LGPUNUHC.Role.Seer;
import com.Wolf_IV.LGPUNUHC.Role.Tanner;
import com.Wolf_IV.LGPUNUHC.Role.TroubleMaker;
import com.Wolf_IV.LGPUNUHC.Role.Wolf;
import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class CStart implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		if(cmd.getName().equalsIgnoreCase("startlg")) {
			//A set a l'envers
			Team team = new Team();
			Joueur j9 = new Joueur("Wolf_IV",team);
			j9.setRole(new Insomiac(j9));
			Joueur j8 = new Joueur("Wolf_IV",team);
			j8.setRole(new Drunk(j8));
			Joueur j7 = new Joueur("Wolf_IV",team);
			j7.setRole(new TroubleMaker(j7));
			Joueur j6 = new Joueur("Wolf_IV",team);
			j6.setRole(new Robber(j6));
			Joueur j5 = new Joueur("Wolf_IV",team);
			j5.setRole(new Seer(j5));
			Joueur j4 = new Joueur("Wolf_IV",team);
			j4.setRole(new Wolf(j4));
			Joueur j3 = new Joueur("Wolf_IV",team);
			j3.setRole(new Wolf(j3));
			Joueur j2 = new Joueur("Wolf_IV",team);
			j2.setRole(new Doppelganger(j2));
			Joueur j1 = new Joueur("Wolf_IV",team);
			j1.setRole(new Tanner(j1));
			
			return true;
		}
		return false;
	}
	
	//Set Joueur pour après

}
