package AULA0208;

import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DESAFIO02 {
	//calcular a diferença de horas e segundos entre alguma cidade, pais, estado - ENTRE O BRASIL
	//E A EUROPA;
	
    public static void main(String args[]) {

        System.out.println("Calculando a diferenca de horas entre um pais");
    
        Calendar systemDate = Calendar.getInstance();
	    Calendar saoPauloDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
    	Calendar brazilWestDate = Calendar.getInstance(TimeZone.getTimeZone("Brazil/West"));

	    System.out.println("America/Sao_Paulo: " + Desafio2.getFormatarData(saoPauloDate));
    	System.out.println("Brazil/GMT-4: " + Desafio2.getFormatarData(brazilWestDate));
    }

    private static String getFormatarData(Calendar date) {
	    StringBuffer formatarData = new StringBuffer();
	    formatarData.append(date.get(Calendar.HOUR_OF_DAY)).append(":");
	    formatarData.append(date.get(Calendar.MINUTE));
	    return formatarData.toString();
    }
       
       
	/*	TimeZone tz = TimeZone.getTimeZone("America/Sao_Paulo");
		TimeZone.setDefault(tz);
		Calendar ca = GregorianCalendar.getInstance(tz);
	
		System.out.println (ca.getTime());
	*/	
	
	
	
}
