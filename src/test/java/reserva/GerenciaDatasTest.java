package reserva;

import java.util.Date;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

import reserva.GerenciadorDeDatas;

public class GerenciaDatasTest {
	
	GerenciadorDeDatas datas = new GerenciadorDeDatas(); 
	
	@Test
	public void deveRetornarFimDeSemana() throws Exception {
		Date data = new Date(2016, 0, 16);
		assertThat(datas.isFimDeSemana(data), is(true));
	}
	
	@Test
	public void deveRetornarDiaUtil() throws Exception {
		Date data = new Date(2016, 0, 13);
		assertThat(datas.isFimDeSemana(data), is(false));
	}
	
	@Test
	public void deveRetornarPeriodoDeDatas(){
		Date dataInicio = new Date(2016, 0, 15);
		Date dataFim = new Date(2016, 0, 18);
		List<Date> result = datas.getPeriodo(dataInicio, dataFim);
		assertThat(datas.getPeriodo(dataInicio, dataFim), is(result));
	}

	
}
