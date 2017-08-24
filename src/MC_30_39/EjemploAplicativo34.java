package MC_30_39;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class EjemploAplicativo34 {
    /*
    Un banco tiene 3 clientes que pueden hacer depósitos y retiros.
    También el banco requiere que al final del día calcule la cantidad de dinero que hay depositada.
    */
    
    //Entidad Persona
    //Entidad Banco
    
    //*********************************************************************************
    
   public static void main(String[] arg){
       Scanner tec=new Scanner(System.in);
       
       //Se hace una simulación de base de datos creando tres registros de personas
       Persona34 persona1=new Persona34();
       persona1.setCuenta(1);
       persona1.setNobmre("Eduardo");
       persona1.setMonto(1000);
       
       Persona34 persona2=new Persona34();
       persona2.setCuenta(1);
       persona2.setNobmre("Raquel");
       persona2.setMonto(1000);
       
       Persona34 persona3=new Persona34();
       persona3.setCuenta(1);
       persona3.setNobmre("Abraham");
       persona3.setMonto(1000);
       //************************************************************************

       System.out.println("----------------------------------");
       System.out.println("Bienvenidos al banco Alex Mex");
       System.out.println("----------------------------------");
       System.out.println("Por favor ingrese su némero de cuenta");
       int cuenta=tec.nextInt();
       
       String operacion="";
       
       switch(cuenta){
           case 1:
               System.out.println("Bienvenido: "+persona1.getNobmre());
               System.out.println("------------------------------------");
               System.out.println("Ingrese la operacion a realizar:");
               System.out.println("A.-Depositar.");
               System.out.println("B.-Retirar.");
               operacion=tec.next();
               switch(operacion){
                   case "A":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a realizar:");
                       double montoDeposito=tec.nextDouble();
                       //Primero obtenemos el monto anterior para generar el deposito
                       double montoAnteriorDeposito=persona1.getMonto();
                       
                       //Se añade el depositoAnterior con el montoDeposito
                       persona1.setMonto(montoAnteriorDeposito + montoDeposito);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona1.getMonto());
                       break;
                       
                   case "B":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a retirar:");
                       double montoRetiro=tec.nextDouble();
                       
                       double montoAnteriorRetiro=persona1.getMonto();
                       
                       persona1.setMonto(montoAnteriorRetiro - montoRetiro);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona1.getMonto());
                       break;
               }
               break;
               
           case 2:
               System.out.println("Bienvenido: "+persona2.getNobmre());
                System.out.println("------------------------------------");
               System.out.println("Ingrese la operacion a realizar:");
               System.out.println("A.-Depositar.");
               System.out.println("B.-Retirar.");
               operacion=tec.next();
               switch(operacion){
                   case "A":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a realizar:");
                       double montoDeposito=tec.nextDouble();
                       
                       double montoAnteriorDeposito=persona2.getMonto();
                       
                       persona2.setMonto(montoAnteriorDeposito + montoDeposito);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona2.getMonto());
                       break;
                       
                    case "B":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a retirar:");
                       double montoRetiro=tec.nextDouble();
                       
                       double montoAnteriorRetiro=persona2.getMonto();
                       
                       persona2.setMonto(montoAnteriorRetiro - montoRetiro);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona2.getMonto());
                       break;
               }
               break;
               
           case 3:
               System.out.println("Bienvenido: "+persona3.getNobmre());
               System.out.println("------------------------------------");
               System.out.println("Ingrese la operacion a realizar:");
               System.out.println("A.-Depositar.");
               System.out.println("B.-Retirar.");
               operacion=tec.next();
               switch(operacion){
                   case "A":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a realizar:");
                       double montoDeposito=tec.nextDouble();
                      
                       double montoAnteriorDeposito=persona3.getMonto();
                      
                       persona3.setMonto(montoAnteriorDeposito + montoDeposito);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona3.getMonto());
                       break;
                       
                    case "B":
                       System.out.println("------------------------------");
                       System.out.println("Ingrese el monto a retirar:");
                       double montoRetiro=tec.nextDouble();
                       
                       double montoAnteriorRetiro=persona3.getMonto();
                       
                       persona3.setMonto(montoAnteriorRetiro - montoRetiro);
                       System.out.println("----------------------------");
                       System.out.println("El monto final es de: "+persona3.getMonto());
                       break;
               }
               break;
           
           default:
               System.out.println("Cuenta no registrada");
               System.exit(0);
       }
   }
}