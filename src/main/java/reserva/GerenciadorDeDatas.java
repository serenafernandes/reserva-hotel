package reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class GerenciadorDeDatas {
	
	public Date toDate(String dateString) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

	public boolean isFimDeSemana(Date date) {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
	
	public List<Date> getPeriodo(Date dataInicio, Date dataFim) {
        List<Date> datas = new ArrayList<Date>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dataInicio);

        while (calendar.getTime().before(dataFim) || calendar.getTime().equals(dataFim)) {
            Date resultado = calendar.getTime();
            datas.add(resultado);
            calendar.add(Calendar.DATE, 1);
        }
        return datas;
    }
}
