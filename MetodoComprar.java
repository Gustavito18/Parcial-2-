
package tarjetasbancarias;


public class MetodoComprar {
    
    double CreditoComprar = 10000;
    double Sacar;
    double Operacion;
    
    public double ClaseComprar (double Sacar){
        
        Operacion = CreditoComprar - Sacar;
        
        return Operacion;
    }
 
    
}
