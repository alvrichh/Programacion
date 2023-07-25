package ejercicio;

public class FibonacciRecursivo {
 
    public static void main(String[] args) {
 
        int serie = 10;
 
        for (int i = 0; i < serie; i++) {
 
            System.out.println(fibonacciRecursivo(i));
        }
 
    }
 
    /**
     * Devuelve el numero fibonacci dado su posicion
     *
     * @param n Posicion del numero fibonacci
     * @return Numero de la lista de fibonacci
     */
    public static int fibonacciRecursivo(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
    }
 
}