package unico;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int altura;
				
		altura = 7;//Util.leerInt("Introduce la altura");
		
		arbolNavidad(altura);
	}

	public static void arbolNavidad(int altura) {
		int limite;
		limite =1;
		for (int lin = 1; lin <= altura; lin++) {
			for (int colSpaces = altura-1; colSpaces >= lin; colSpaces--) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= limite; col++) {
				if(col <= limite) {
					if(lin == 1) {
						System.out.print("*");
					}else {
						if(lin == altura) {
							System.out.print(" ");
						}
						if(lin != altura) {
							if(lin > 1 && lin < altura-1) {
								if(col == 1 || col == limite) {
									System.out.print("^");
								}else {
									System.out.print(" ");
								}
								
							}else {
								System.out.print("^");
							}
							
							
							
						}
						
					}
					if(lin == altura && col == limite/2) {						
						System.out.print("Y");
					}
				}
			}
			limite+=2;
			
			System.out.println();
		}
		
	}
}
/*
    *
    ^
   ^ ^
  ^   ^
 ^     ^
^^^^^^^^^
    Y
    
       *
       ^
      ^ ^
     ^   ^
    ^     ^
   ^       ^
  ^         ^
 ^           ^
^^^^^^^^^^^^^^^
       Y
*/