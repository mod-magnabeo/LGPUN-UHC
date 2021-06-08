package com.Wolf_IV.LGPUNUHC;

import com.Wolf_IV.LGPUNUHC.Role.Doppelganger;
import com.Wolf_IV.LGPUNUHC.Role.Role;
import com.Wolf_IV.LGPUNUHC.Role.Wolf;
import com.Wolf_IV.LGPUNUHC.Team.Team;

public class Try {

	public static void main(String[] args) {
		Role w = new Doppelganger("Wolf_IV", new Team());
		/*Role c = new Role();
		c.setRolePlayed(c, "autre role");
		c.init("clement", new Team());*/
		Role c = new Wolf("clement", new Team());
		System.out.println(w.role[0].player+ w.role[1].player/*+w.role[2].player*/);
		System.out.println(w.role[0].active+ ""+ w.role[1].active/*+w.role[2].player*/);
		c.play();
		//w.clickPlayer(c, null);
		System.out.println(w.role[0].player+ w.role[1].player+w.role[2].player);
		System.out.println(w.role[0].active+ ""+ w.role[1].active/*+w.role[2].player*/);

	}

}
