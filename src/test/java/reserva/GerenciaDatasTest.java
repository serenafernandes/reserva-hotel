package reserva;

import java.util.Date;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

import reserva.GerenciaDatas;

public class GerenciaDatasTest {
	
	GerenciaDatas datas = new GerenciaDatas(); 
	
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

	
}
