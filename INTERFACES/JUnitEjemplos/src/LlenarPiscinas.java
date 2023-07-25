import java.util.Scanner;

public class LlenarPiscinas {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("¿Cuántas veces quieres decir la palabra 'leña'? ");
	        int num = sc.nextInt();
	        
	        for (int i = 0; i < num; i++) {
	            System.out.println("leña");
	        }
	    }
	}
