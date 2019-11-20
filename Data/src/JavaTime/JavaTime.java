package JavaTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class JavaTime {
 
	public static void main(String[] args) {
		
//		Instant agora = Instant.now();
//		System.out.println(agora);
		
//		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
		
		LocalDate emissaoRG = LocalDate.of(2000, 1, 15);
		
//		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
//		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
//		 
//		Period periodo = Period.between(homemNoEspaco, homemNaLua);
//		 
//		System.out.printf("%s anos, %s mês e %s dias ", 
//		  periodo.getYears() , periodo.getMonths(), periodo.getDays());
//		
//		LocalTime horarioDeEntrada = LocalTime.of(9, 0);
//		System.out.println(horarioDeEntrada);
		
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
//		System.out.println(aberturaDaCopa);
		
		
		ZoneId fusoHorarioSãoPaulo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioNewYork = ZoneId.of("America/New_York");
		
//		ZonedDateTime agoraEmSãoPaulo = ZonedDateTime.now(fusoHorarioSãoPaulo);
//		System.out.println(agoraEmSãoPaulo);
		
		
		//fuso horario de voo
		LocalDateTime saidaDeSaoPauloSemFusoHorario = 
				LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario =
				LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);
		
		ZonedDateTime saidaDeSaoPauloComFusoHorario = 
				ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, fusoHorarioSãoPaulo);
				System.out.println(saidaDeSaoPauloComFusoHorario); 
				 
		ZonedDateTime chegadaEmNovaYorkComFusoHorario = 
				ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, fusoHorarioNewYork);
				System.out.println(chegadaEmNovaYorkComFusoHorario);
				   
		Duration duracaoDoVoo = 
				Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
				System.out.println(duracaoDoVoo);
				
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
				 
		LocalDateTime fimDoHorarioDeVerao2013SemFusoHorario = 
				LocalDateTime.of(2014, Month.FEBRUARY, 15, 23, 00);
				 
		ZonedDateTime fimDoHorarioVerao2013ComFusoHorario = 
				fimDoHorarioDeVerao2013SemFusoHorario.atZone(fusoHorarioDeSaoPaulo);
				System.out.println(fimDoHorarioVerao2013ComFusoHorario); 
				 
		ZonedDateTime maisUmaHora = 
				fimDoHorarioVerao2013ComFusoHorario.plusHours(1);
				System.out.println(maisUmaHora); 
				
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
				YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
				
//		LocalDateTime agora2 = LocalDateTime.now();
//		DateTimeFormatter formatador = DateTimeFormatter
//				.ofLocalizedDateTime(FormatStyle.SHORT)
//				.withLocale(new Locale("pt", "br"));
//				agora2.format(formatador);
		
		LocalDate hoje = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
				
		System.out.println(amanha);
		
//		MonthDay natal2 = MonthDay.of(Month.DECEMBER, 25);
//		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
//		long diasAteONatal = LocalDate.now()
//		    .until(natalDesseAno, ChronoUnit.DAYS);
//		
//		LocalDate hoje3 = LocalDate.now();
//		LocalDate amanha3 = hoje.plusDays(1);
//		boolean mesmoObjeto = hoje == amanha;
//		
//		Calendar calendario =  
//			      new Calendar.Builder()  
//			        .setDate(2014, Calendar.APRIL, 8)  
//			        .setTimeOfDay(10, 2, 57)  
//			        .setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"))  
//			        .setLocale(new Locale("pt", "br"))
//			        .build(); 	
				
	}
	
}
