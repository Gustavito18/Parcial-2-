
package tarjetasbancarias;

  
public class MetodoPagar {
    
    double CreditoActual = 10000;
    double PagoIngresado;
    double solucion;
 
public double ClasePagar (double PagoIngresado){
    
    solucion = CreditoActual + PagoIngresado;
    
    return solucion;
}
    
}
