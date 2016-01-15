package reserva;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTest {

	@Test
	public void deveImprimirONomeDoHotel() {
		String nome = "The Carlyle";
		Hotel hotel = new Hotel(nome, 3, 110, 80, 90, 80);
		
		assertThat(hotel.toString(), is(nome));
	}

}
