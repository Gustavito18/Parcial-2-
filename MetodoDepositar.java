
package tarjetasbancarias;

import java.util.Scanner;

public class MetodoDepositar {
 
    double actual = 5000;
    double deposito;
     double operacion;

    
    public double ClaseDeposito (double deposito){
        Scanner s = new Scanner(System.in);
                  
                              
    operacion= actual + deposito;
        
        return  operacion;
    }
}
