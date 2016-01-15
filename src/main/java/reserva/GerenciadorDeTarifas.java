package reserva;

import static reserva.TipoCliente.Regular;
import static reserva.TipoCliente.Vip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciadorDeTarifas {

	public Tarifa getMelhorTarifa(TipoCliente tipoCliente, List<Date> periodo, List<Hotel> hoteis) {

		List<Tarifa> listaDeTarifas = new ArrayList<Tarifa>();

		for (Hotel hotel : hoteis) {
			Tarifa tarifa = calculaTarifaDoHotel(tipoCliente, periodo, hotel);
			listaDeTarifas.add(tarifa);
		}

		Tarifa menorTarifa = calculaMenorTarifa(listaDeTarifas);

		return menorTarifa;
	}

	private Tarifa calculaMenorTarifa(List<Tarifa> listaDeTarifas) {

		Tarifa menorTarifa = null;

		for (Tarifa tarifa : listaDeTarifas) {
			if (menorTarifa == null || tarifa.getPreco() < menorTarifa.getPreco()) {
				menorTarifa = tarifa;
			} else if (tarifa.getPreco() == menorTarifa.getPreco()
					&& tarifa.getHotel().getClassificacao() > menorTarifa.getHotel().getClassificacao()) {
				menorTarifa = tarifa;
			}
		}

		return menorTarifa;
	}

	private Tarifa calculaTarifaDoHotel(TipoCliente tipoCliente, List<Date> periodo, Hotel hotel) {

		GerenciadorDeDatas gerenciadorDeDatas = new GerenciadorDeDatas();

		Double preco = 0d;
		for (Date data : periodo) {
			if (tipoCliente == Regular) {
				if (gerenciadorDeDatas.isFimDeSemana(data)) {
					preco += hotel.getFimSemanaRegular();
				} else {
					preco += hotel.getDiaUtilRegular();
				}
			} else if (tipoCliente == Vip) {
				if (gerenciadorDeDatas.isFimDeSemana(data)) {
					preco += hotel.getFimSemanaVip();
				} else {
					preco += hotel.getDiaUtilVip();
				}
			}
		}

		Tarifa tarifa = new Tarifa(hotel, preco);

		return tarifa;
	}

}
