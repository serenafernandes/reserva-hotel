package reserva;

public class Hotel {

	private String nome;
	private int classificacao;
	private double diaUtilRegular;
	private double diaUtilVip;
	private double fimSemanaRegular;
	private double fimSemanaVip;

	public Hotel(String nome, int classificacao, double diaUtilRegular, double diaUtilVip, double fimSemanaRegular,
			double fimSemanaVip) {
		this.nome = nome;
		this.classificacao = classificacao;
		this.diaUtilRegular = diaUtilRegular;
		this.diaUtilVip = diaUtilVip;
		this.fimSemanaRegular = fimSemanaRegular;
		this.fimSemanaVip = fimSemanaVip;
	}

	public String getNome() {
		return nome;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public double getDiaUtilRegular() {
		return diaUtilRegular;
	}

	public double getDiaUtilVip() {
		return diaUtilVip;
	}

	public double getFimSemanaRegular() {
		return fimSemanaRegular;
	}

	public double getFimSemanaVip() {
		return fimSemanaVip;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public void setDiaUtilRegular(double diaUtilRegular) {
		this.diaUtilRegular = diaUtilRegular;
	}

	public void setDiaUtilVip(double diaUtilVip) {
		this.diaUtilVip = diaUtilVip;
	}

	public void setFimSemanaRegular(double fimSemanaRegular) {
		this.fimSemanaRegular = fimSemanaRegular;
	}

	public void setFimSemanaVip(double fimSemanaVip) {
		this.fimSemanaVip = fimSemanaVip;
	}

}
