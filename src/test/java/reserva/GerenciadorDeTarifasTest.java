package reserva;

import static org.hamcrest.core.Is.is;
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

	@Before
	public void setUpBeforeClass() throws Exception {
		mockHoteis = new ArrayList<Hotel>();
		mockHoteis.add(new Hotel("The Carlyle", 3, 110, 80, 90, 80));
		mockHoteis.add(new Hotel("The Plaza", 4, 160.00, 110.00, 60.00, 50.00));
		mockHoteis.add(new Hotel("Royal Hotel", 5, 220.00, 100.00, 150.00, 40.00));
	}

	@Before
	public void setup() {
		gerenciadorDeTarifas = new GerenciadorDeTarifas();
	}

	@Test
	public void deveRetornarUmaTarifa() throws ParseException {

		List<Date> periodo = new ArrayList<Date>();
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("16/03/2015"));

		assertThat(gerenciadorDeTarifas.getMelhorTarifa(TipoCliente.Vip, periodo, mockHoteis),
				instanceOf(Tarifa.class));
	}

	@Test
	public void deveRetornarCarlyleA330Reais() throws ParseException {

		List<Date> periodo = new ArrayList<Date>();
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("16/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("17/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("18/03/2015"));

		Tarifa tarifaEsperada = new Tarifa(mockHoteis.get(0), 330d);

		assertThat(gerenciadorDeTarifas.getMelhorTarifa(TipoCliente.Regular, periodo, mockHoteis), is(tarifaEsperada));
	}

	@Test
	public void deveRetornarThePlazaA280Reais() throws ParseException {

		List<Date> periodo = new ArrayList<Date>();
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("20/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("21/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("22/03/2015"));

		Tarifa tarifaEsperada = new Tarifa(mockHoteis.get(1), 280d);

		assertThat(gerenciadorDeTarifas.getMelhorTarifa(TipoCliente.Regular, periodo, mockHoteis), is(tarifaEsperada));
	}

	@Test
	public void deveRetornarRoyalHotelA240Reais() throws ParseException {

		List<Date> periodo = new ArrayList<Date>();
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("26/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("27/03/2015"));
		periodo.add(new SimpleDateFormat("dd/MM/yyyy").parse("28/03/2015"));

		Tarifa tarifaEsperada = new Tarifa(mockHoteis.get(2), 240d);

		assertThat(gerenciadorDeTarifas.getMelhorTarifa(TipoCliente.Regular, periodo, mockHoteis), is(tarifaEsperada));
	}

}
