package Ejercicio3;
import java.io.FileNotFoundException;
import java.io.IOException;

public class app2 {
 
    public static void main (String [] args) throws Exception{

for (int i = 0; i<10; i++) {
    try {
        Ejercicio3.excepcionAleatoria();
} catch (NumberFormatException e) {
System.out.println("Excepcion Number")
}

catch (FileNotFoundException e) {
    System.out.println("Excepcion Number")
    }

    catch (IOException e) {
        System.out.println("Excepcion Number")
        }
    }

    catch (IndexOutOfBoundsException e) {
        System.out.println("Excepcion Number")
        }

        catch (ArithmeticException e) {
            System.out.println("Excepcion Number")
            }
    }
}

 }
    
