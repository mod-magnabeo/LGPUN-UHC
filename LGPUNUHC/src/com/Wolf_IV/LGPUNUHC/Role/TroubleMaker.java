package com.Wolf_IV.LGPUNUHC.Role;

import org.bukkit.entity.Player;

import com.Wolf_IV.LGPUNUHC.Team.Joueur;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class TroubleMaker extends Role{
	boolean aP = false;
	Role aR;
	@Override
	public Role create(Joueur player) {
		return new TroubleMaker(player);
	}
	
	public TroubleMaker(Joueur player) {
		this.setRolePlayed(this, "Robber");
		this.init(player);
	}
	
	@Override
	public void clickPlayer(Role p, Player player) {
		if(p.rMiddle) {
			player.sendMessage("§cChoisiser un joueur pas une carte au milieu");	
		}else if(aP == false) {
			aP = true;
			aR = p;
			player.sendMessage("Premier joueur choisi veuiller maintenant choisir un deuième joueur");
		}else {
			Role container = p.nvRole;
			p.nvRole = aR.nvRole;
			aR.nvRole = container;
			player.sendMessage("Les roles de "+aR.player.player+" et de "+p.player.player+" ont été invertit");
			end();
		}
	}
}
