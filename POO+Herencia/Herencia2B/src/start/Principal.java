package start;

import model.Instrumento.NotaMusical;
import model.Piano;

public class Principal {

	public static void main(String[] args) {


		Piano p = new Piano();
		
		p.add(NotaMusical.DO);
		p.add(NotaMusical.RE);
		p.add(NotaMusical.MI);
		p.add(NotaMusical.FA);
		p.add(NotaMusical.SOL);
		p.add(NotaMusical.LA);
		p.add(NotaMusical.SI);
		p.add(NotaMusical.FA);
		p.add(NotaMusical.FA);
		
		System.out.println(p.interpretar());
		
		
	}

}
