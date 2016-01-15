package reserva;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GerenciadorDeTarifasTest {

	GerenciadorDeTarifas gerenciadorDeTarifas;
	List<Hotel> mockHoteis;
	List<Date> mockPeriodo;

	@Before
	public void setup() throws ParseException {
		gerenciadorDeTarifas = new GerenciadorDeTarifas();
		mockHoteis = new ArrayList<Hotel>();
		mockHoteis.add(new Hotel("The Carlyle", 3, 110, 80, 90, 80));
		mockHoteis.add(new Hotel("The Plaza", 4, 160.00, 110.00, 60.00, 50.00));
		mockHoteis.add(new Hotel("Royal Hotel", 5, 220.00, 100.00, 150.00, 40.00));

		mockPeriodo = new ArrayList<Date>();
		
		mockPeriodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2016"));
		mockPeriodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2016"));
		mockPeriodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("03/01/2016"));
	}

	@Test
	public void deveRetornarUmaTarifa() {
		assertThat(gerenciadorDeTarifas.getMelhorTarifa(TipoCliente.Vip, mockPeriodo, mockHoteis), instanceOf(Tarifa.class));
	}

}
