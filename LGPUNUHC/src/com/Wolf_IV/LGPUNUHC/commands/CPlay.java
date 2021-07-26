package com.Wolf_IV.LGPUNUHC.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;

public class CPlay implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("play")) {
				Player player = (Player) sender;
				for(Joueur joueur : Joueur.joueurs) {
					if(player.getName().equalsIgnoreCase(joueur.player)) {
						joueur.team.display(player);
						return true;
					}
				}
				return true;
			}
		}
		return false;
	}

}
