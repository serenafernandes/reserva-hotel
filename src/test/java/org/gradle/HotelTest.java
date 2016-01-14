package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.gradle.Hotel;


public class HotelTest {
	Hotel carlyle;
	Hotel thePlaza;
	Hotel royal;
	
	@Before
	public void setup(){
		carlyle = new Hotel("Carlyle", 3, 110.00, 80.00, 90.00, 80.00);
        thePlaza = new Hotel("The Plaza", 4, 160.00, 110.00, 60.00, 50.00);
        royal = new Hotel("Royal Hotel", 5, 220.00, 100.00, 150.00, 40.00);
	}
	
	@Test
    public void deveRetornarClassificacaoDoHotel() throws Exception {
        assertThat(carlyle.getClassificacao(), is(3));
        assertThat(thePlaza.getClassificacao(), is(4));
        assertThat(royal.getClassificacao(), is(5));
    }
	
	@Test
	public void deveRetornarPrecoDiaUtilClienteRegular() throws Exception {
		assertThat(carlyle.getDiaUtilRegular(), is(110.00));
		assertThat(thePlaza.getDiaUtilRegular(), is(160.00));
		assertThat(royal.getDiaUtilRegular(), is(220.00));
	}
	
	@Test
	public void deveRetornarPrecoDiaUtilClienteVip() throws Exception {
		assertThat(carlyle.getDiaUtilVip(), is(80.00));
		assertThat(thePlaza.getDiaUtilVip(), is(110.00));
		assertThat(royal.getDiaUtilVip(), is(100.00));
	}
	
	@Test
	public void deveRetornarPrecoFimSemanaClienteRegular() throws Exception {
		assertThat(carlyle.getFimSemanaRegular(), is(90.00));
		assertThat(thePlaza.getFimSemanaRegular(), is(60.00));
		assertThat(royal.getFimSemanaRegular(), is(150.00));
	}
	
	@Test
	public void deveRetornarPrecoFimSemanaClienteVip() throws Exception {
		assertThat(carlyle.getFimSemanaVip(), is(80.00));
		assertThat(thePlaza.getFimSemanaVip(), is(50.00));
		assertThat(royal.getFimSemanaVip(), is(40.00));
	}
	
}
