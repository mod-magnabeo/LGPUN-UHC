package com.Wolf_IV.LGPUNUHC.Team;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.Wolf_IV.LGPUNUHC.Role.Role;

public class Team {
	public Role roleNow;
	public static Role[] role = new Role[25];
	//Randomiser car la on peut savoir qui est qui
	public Joueur[] joueurs =new Joueur[10];//A changer dans le futur pour de plus grosse équipe
	int itemLocJ[] = {3,5,17,44,50,48,36,9,21,31,23};
	//int itemLocM[] = {21,31,23};
	//Team Joueur a définir
	
	public void display(Player player) {
		Inventory inv = Bukkit.createInventory(null, 54, "§aA vous de jouer");
		int i = -1;
		for(Joueur joueur : joueurs) {
			i++;
			if(joueur != null) {
				ItemStack skull = new ItemStack(397, 1, (short) 3);
   				SkullMeta meta = (SkullMeta) skull.getItemMeta();
   				if(!joueur.player.equalsIgnoreCase("")) {
   				meta.setDisplayName("§b"+joueur.player);
   				meta.setOwner(joueur.player);
   				
   				}else {
   					meta.setDisplayName("§aN°"+(i+1));
   	   				meta.setOwner("py3_3");
   				}
   				skull.setItemMeta(meta);
   				inv.setItem(itemLocJ[i], skull);
			}
		}
		player.openInventory(inv);
		
	}
	
	public Role getRoleWithSlot(int slot) {
		int i = 0;
		for(int slotCompared : itemLocJ) {
			if(slot == slotCompared) {
				return joueurs[i].role;
			}
			i++;
		}
		return null;
	}

}
