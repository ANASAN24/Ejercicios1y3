import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce tres números: ");
         int num1 = Integer.parseInt(s.nextLine());
         int num2 = Integer.parseInt(s.nextLine());
         int num3 = Integer.parseInt(s.nextLine());

         if (num1 > num2 && num1 > num3) {
            System.out.print("El número más grande es: ");
            System.out.println(num1);
            //return num1;
         }else{
            if (num2 > num1 && num2 > num3) {
                System.out.print("El número más grande es: ");
                System.out.println(num2);
            }else{
                System.out.print("El número más grande es: ");
                System.out.println(num3);
            }
         }

    }
}



/*System.out.orint(mensjae);
try{
    int valor = integer.parseInt(sc.nextLine());
    return valor;
} catch (NumberFormatException e){
    System.out.println("debe intrudicr un numero entero");
    return lwwevalorentero(mensaje);
}*/

/* intexep = (int) (Math.random(5)+1) -> 1..5 
 * switch (excep){
 * case1: throw new NumberFormatException};
 * Case2: throw new sdfsdfdf....
*/
