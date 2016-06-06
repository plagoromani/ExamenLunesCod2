
package examenfinalparte2;

import javax.swing.JOptionPane;

/**
 * Clase en la cual se va a crear un contador, y nos muestre por pantalla los números seleccionados.
 * @author Pablite5
 */


public class Principal {

    public static boolean p = false;
    
    public static void main(String arg[]){
        /**
         * Aqui pedimos por pantalla que ingresemos el numero de digitos que queremos que se nos muestre.
         * @param ndig es igual a 0 para que no tome otro valor.
         */
        
        int dig= Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        int ndig=0;
        
        
     /**
      * Si el dígito es mayor que 0 se procede a funcionar el bucle, si se pone cero no iniciará el bucle.
      */
        
        if(dig<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        
        /**
         * Se crea un for para recorrer el bucle.
         * @param aux es un parámetro que tenemos que crear, ya que si fuese i el resultado sería distinto
         */
        for(int i = 1; i <= 99999; i++ )
        {
            int aux = i;
 
            int contador=0;
 
            while (aux != 0){
            aux = aux / 10;
            contador++;
        }
        /**
         * Se procede a realizar las operaciones del bucle.
         * Aquí el bucle decirirá si mostrarlo luego o no.
         * Si es igual a true se mostrará.
         * Si es igual a false no se mostrará nada.
         */
            ndig=contador;
            
            
            if(ndig==dig){
                   if (i < 4) p = true;
            else
            {
            if (i % 2 == 0) p = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int k = (i - 1) / 2; 
                    if  (k % 2 == 0) k--;  
             
                    while(i1 <= k)
                    {
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = k + 1;
                    }
 
        if (contador1 == 1) p = true;
            } 
        } 
     /**
      * Aquí se mostrará si el resultado es igual a true.
      */
                if (p == true) 
                    System.out.println(i);    
            }
        }
        }
 
       
 
    
}
