package com.Wolf_IV.LGPUNUHC.Team;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class JListener implements Listener{
	Joueur joueur;
	public JListener(Joueur joueur) {
		this.joueur = joueur;
	}
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		Player player =(Player) event.getWhoClicked();
		ItemStack current= event.getCurrentItem();
		if(joueur.player.equalsIgnoreCase(player.getName()) && inv.getName().equalsIgnoreCase("§aA vous de jouer") && current != null) {
			if(joueur.role.isTurn) {
				//Bukkit.broadcastMessage("slot : "+event.getRawSlot());
				joueur.role.clickPlayer(joueur.team.getRoleWithSlot(event.getRawSlot()), player);
			}else {
				// "//" A retirer en bas v
				player.sendMessage("§cCe n'est pas a votre tour de joué");
			}
			event.setCancelled(true);
		}
	}

}
