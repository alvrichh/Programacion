package start;

import bombilla.Casa;

public class Principal {

	public static void main(String[] args) {
		Casa casa1 = new Casa();
		
		
		//casa1.getBombillas()[0].encenderBombilla();
		System.out.println(casa1);
		casa1.setLuzGeneral(false);
		System.out.println(casa1);
		casa1.setLuzGeneral(true);
		System.out.println(casa1);
		casa1.setInterruptorGeneral(false);
		System.out.println(casa1);
		casa1.setInterruptorGeneral(true);
		casa1.getBombillas()[1].apagarBombilla();
		System.out.println(casa1);
		casa1.getBombillas()[1].encenderBombilla();
		System.out.println(casa1);


	}

}
