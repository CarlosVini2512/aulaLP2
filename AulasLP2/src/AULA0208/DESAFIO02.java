import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DESAFIO02 {


	//calcular a diferença de horas e segundos entre alguma cidade, pais, estado - ENTRE O BRASIL
	//E A EUROPA;
	
    public static void main(String args[]) {

        System.out.println("Calculando a diferenca de horas entre um pais");
    
        Calendar systemDate = Calendar.getInstance();
	    Calendar saoPauloDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
    	Calendar bruxelasDate = Calendar.getInstance(TimeZone.getTimeZone("Europe/Bruxelas"));

	    System.out.println("Sao_Paulo/GMT-3: " + DESAFIO02.getFormatarData(saoPauloDate));
    	System.out.println("Bruxelas: " + DESAFIO02.getFormatarData(bruxelasDate));
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
