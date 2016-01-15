package reserva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import reserva.Hotel;

public class Main {

	public static void main(String[] args) {
		String inputTipoCliente = entrada("Em qual perfil de cliente você se encaixa? (Regular/Vip)");
		String inputDataInicio = entrada("Quando você iniciará a estadia? (DD/MM/YYYY)");
		String inputDataFim = entrada("Até quando pretende ficar? (DD/MM/YYYY)");
		
		TipoCliente tipoCliente = TipoCliente.valueOf(inputTipoCliente);
				
		GerenciadorDeDatas gerenciaDatas = new GerenciadorDeDatas();
		Date dataInicio = gerenciaDatas.toDate(inputDataInicio);
		Date dataFim = gerenciaDatas.toDate(inputDataFim);
		List<Date> periodo = gerenciaDatas.getPeriodo(dataInicio, dataFim);

		ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
		hoteis.add(new Hotel("The Carlyle", 3, 110.00, 80.00, 90.00, 80.00));
		hoteis.add(new Hotel("The Plaza", 4, 160.00, 110.00, 60.00, 50.00));
		hoteis.add(new Hotel("Royal Hotel", 5, 220.00, 100.00, 150.00, 40.00));

		GerenciadorDeTarifas gerenciaTarifas = new GerenciadorDeTarifas();
		Tarifa melhorTarifa = gerenciaTarifas.getMelhorTarifa(tipoCliente, periodo, hoteis);
		System.out.println("O hotel mais barato para este período é " + melhorTarifa.getHotel());
		System.out.println("O preço fica em " + melhorTarifa.getPreco());
	}
	
	private static String entrada(String info) {
		System.out.print(info + " ");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
