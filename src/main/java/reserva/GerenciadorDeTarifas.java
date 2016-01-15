package reserva;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciadorDeTarifas {

	public Tarifa getMelhorTarifa(TipoCliente tipoCliente, List<Date> periodo, List<Hotel> hoteis) {
		// TODO Auto-generated method stub
		return new Tarifa();
	}

	private String getHotelBaratoNome(String tipoCliente, Date initialDate, Date finalDate,
			ArrayList<Hotel> hoteis) {

		GerenciadorDeDatas gerenciadorDeDatas = new GerenciadorDeDatas();
		
		
		ArrayList<Date> datas = (ArrayList<Date>) gerenciadorDeDatas.getPeriodo(initialDate, finalDate);
		ArrayList<Integer> precos = new ArrayList<Integer>();
		int menorPreco = 99999;
		String hotelBarato = "";

		for (Hotel hotel : hoteis) {
			int sum = 0;
			for (Date date : datas) {
				if (tipoCliente.equals("regular")) {
					if (gerenciadorDeDatas.isFimDeSemana(date)) {
						sum += hotel.getFimSemanaRegular();
					} else {
						sum += hotel.getDiaUtilRegular();
					}
				} else if (tipoCliente.equals("rewards")) {
					if (gerenciadorDeDatas.isFimDeSemana(date)) {
						sum += hotel.getFimSemanaVip();
					} else {
						sum += hotel.getDiaUtilVip();
					}
				}
			}
			if (sum < menorPreco) {
				menorPreco = sum;
				hotelBarato = hotel.getNome();
			} else if (sum == menorPreco) {
				if (hotel.getClassificacao() > getHotelByName(hotelBarato, hoteis).getClassificacao()) {
					hotelBarato = hotel.getNome();
				}
			}
		}
		return hotelBarato;
	}

	private Hotel getHotelByName(String name, ArrayList<Hotel> hoteis) {
		for (Hotel hotel : hoteis) {
			if (hotel.getNome().equals(name)) {
				return hotel;
			}
		}
		return null;
	}

	
}
