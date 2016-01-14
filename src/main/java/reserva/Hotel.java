package reserva;

public class Hotel {
	

    private final String nome;
    private final int classificacao;
    private final double diaUtilRegular;
    private final double diaUtilVip;
    private final double fimSemanaRegular;
    private final double fimSemanaVip;

    public Hotel(String nome, int classificacao, double diaUtilRegular, double diaUtilVip, double fimSemanaRegular, double fimSemanaVip) {
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

    

}
