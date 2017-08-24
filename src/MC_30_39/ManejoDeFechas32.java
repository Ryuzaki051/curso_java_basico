package MC_30_39;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alejandro
 */
public class ManejoDeFechas32 {
    public static void main(String... fechas){
        
        Calendar calendario=new GregorianCalendar();
        int anio=calendario.get(Calendar.MONTH);
        System.out.println(anio);
        
        /*
        Prueba con el metodo Calendar
        
        Calendar calendario=Calendar.getInstance();
        int anio=calendario.get(Calendar.YEAR);
        System.out.println(anio);*/
        
//Prueba con el metodo Date
        //Date fecha=new Date();
        //fecha.getYear();
        //fecha.getDay(); Este tipo de metodos cuando esta subrayado significa absoleto
        //pero se puede seguir utilizando hasta la version 1.7 
        //System.out.print(fecha);
        
    }   
}