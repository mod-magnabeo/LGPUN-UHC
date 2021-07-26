package com.Wolf_IV.LGPUNUHC;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.Wolf_IV.LGPUNUHC.Team.JListener;
import com.Wolf_IV.LGPUNUHC.commands.CPlay;
import com.Wolf_IV.LGPUNUHC.commands.CStart;

public class MainL extends JavaPlugin implements Listener{
	//Petit pb quand le role est au milieux c instantané le deuieume joueur sait s'il ya un dopelganger 
	//Autre chose est-ce que les role du milieu marche
	public static MainL main;
	@Override
	public void onEnable() {
		main = this;
		getCommand("play").setExecutor(new CPlay());
		getCommand("startlg").setExecutor(new CStart());
		
	}
	@Override
	public void onDisable() {
	System.out.println("-Wolf_IV");
	}

}
