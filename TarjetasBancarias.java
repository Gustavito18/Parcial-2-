
package tarjetasbancarias;

import java.util.Scanner;

public class TarjetasBancarias {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     int decision1 = 0;
     int TarjetaDeCredito = 0;
     int TarjetaDeDebido = 0;
     int decision2 = 0;
     int decision3 = 0;
     
     
     System.out.println("Ingrese el nombre de la tarjeta: ");
     String nombre = sc.nextLine();
     
     System.out.println("Ingrese el numero de la tarjeta: ");
     float numero = sc.nextFloat();
     
     System.out.println("Ingrese su saldo actual");
     float saldo = sc.nextFloat ();
     
     System.out.println("Que clase de tarjeta desea utilizar: ");
     System.out.println("1. Tarjeta de Credito");
     System.out.println("2. Tarjeta de Debito");
     decision1 = sc.nextInt();
     
     
        Limite Limite = new Limite();//Tarjeda de Credito
        TasaDeInteres TarjetasBancarias1 = new TasaDeInteres();//Tarjeta de Credito
        MetodoComprar TarjetasBancarias3 = new MetodoComprar();//Tarjeta de Credito 
        MetodoPagar TarjetasBancarias2 = new MetodoPagar();//Tarjeta de Credito
        
        
        
        LimiteSaldo LimiteSaldo = new LimiteSaldo();//Tarjeta de Debito
        MetodoDepositar TarjetasBancarias = new MetodoDepositar ();//Tarjeta de Debito
         MetodoComprarDos TarjetasBancarias4 = new MetodoComprarDos();//Tarjeta de Debito
     
     switch (decision1){ //switch para las tarjetas
         
        case 1: //CREDITO
            
     System.out.println("Que operacion desea usar: ");
     System.out.println("1. Obtener limite de credito");
     System.out.println("2. Obtener tasa de interés");
     System.out.println("3. Método comprar");
     System.out.println("4. Método pagar");
     decision2 = sc.nextInt();
            
            switch (decision2){ //switch para la tarjeta de credito
        
                case 1:
                    System.out.println("Su limite de crédito es de: "+Limite.LimiteCredito);
                    break;
                case 2:
                    
                    System.out.println("Ingrese la tasa de interes: ");
                    double TasaInteres2 = sc.nextDouble();
                 
                 
                         System.out.println(TarjetasBancarias1.Clasetasa(TasaInteres2));
                
                    System.out.println("Su total a cancelar es de: "+TarjetasBancarias1.total);
                    break;
                case 3:
                    //metod comprar
                    System.out.println("Cuanto desea sacar: ");
                    double sacar = sc.nextDouble();
                    
                    System.out.println(TarjetasBancarias3.ClaseComprar(sacar));
                    
                    System.out.println("Ahora su saldo es de: "+TarjetasBancarias3.Operacion);
                      break;
                 case 4:
                     //metodo pagar
                     System.out.println("Ingrese la cantidad que va a pagar: ");
                     double PagoIngresado = sc.nextDouble();
                     
                     System.out.println(TarjetasBancarias2.ClasePagar(PagoIngresado));
                     
                     System.out.println("Ahora su saldo es de: "+TarjetasBancarias2.solucion);
                    break;
                
            }
           break;
           
 
        case 2: //DEBITO
            
     System.out.println("Que operacion desea usar: ");
     System.out.println("1. Obtener limite del saldo");
     System.out.println("2. Método depositar");
     System.out.println("3. Método comprar");
     decision3 = sc.nextInt();
            
                switch (decision3){ //switch para la tarjeta de debito
                    case 1:
                        
                        System.out.println("Su saldo es de: "+LimiteSaldo.saldo);
                        break;
                    case 2:
               
                 System.out.println("Ingrese la cantidad que desea depositar: ");
                    double deposito = sc.nextDouble(); 
        
                    System.out.println(TarjetasBancarias.ClaseDeposito(deposito));
                    
                       System.out.println("Ahora tiene un saldo de: "+TarjetasBancarias.operacion);
               
                        break;
                    case 3:
                        //metodo comprar2
                        
                         System.out.println("Ingrese la cantidad que va a sacar: ");
                     double SacarDos = sc.nextDouble();
                     
                     System.out.println(TarjetasBancarias4.ClaseComprarDos(SacarDos));
                     
                     System.out.println("Ahora su saldo es de: "+ TarjetasBancarias4.solucion);
                     
                     break;
            
        }
     
           break;
        
    }

    }

  
}
