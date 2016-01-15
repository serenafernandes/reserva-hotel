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

	@Override
	public String toString() {
		return this.getNome();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classificacao;
		long temp;
		temp = Double.doubleToLongBits(diaUtilRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(diaUtilVip);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fimSemanaRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fimSemanaVip);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (classificacao != other.classificacao)
			return false;
		if (Double.doubleToLongBits(diaUtilRegular) != Double.doubleToLongBits(other.diaUtilRegular))
			return false;
		if (Double.doubleToLongBits(diaUtilVip) != Double.doubleToLongBits(other.diaUtilVip))
			return false;
		if (Double.doubleToLongBits(fimSemanaRegular) != Double.doubleToLongBits(other.fimSemanaRegular))
			return false;
		if (Double.doubleToLongBits(fimSemanaVip) != Double.doubleToLongBits(other.fimSemanaVip))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
