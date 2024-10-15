package Ejercicio3;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ejercicio3 {

    public static void excepcionAleatoria() throws 
    NumberFormatException, IOException, FileNotFoundException, IndexOutOfBoundsException, ArithmeticException{


            int excep = (int)(Math.random()*5 + 1);
            switch(excep){
                case 1:
                throw new NumberFormatException();
                //break; no need to
                case 2:
                throw new IOException();
                case 3:
                throw new FileNotFoundException();
                case 4:
                throw new IndexOutOfBoundsException();
                case 5:
                throw new ArithmeticException();
            }


    }

    
    
}
