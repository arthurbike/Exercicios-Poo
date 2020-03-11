package exercicio_oficina;

public class ArthurOficina {
	private String nome;
	private ArthurCarro[] carros;
	private ArthurMoto[] motos;
	private ArthurContato contatoOficina;

	public ArthurOficina(String nome, ArthurCarro[] carros, ArthurMoto[] motos, ArthurContato contatoOficina) {
		super();
		this.nome = nome;
		this.carros = carros;
		this.motos = motos;
		this.contatoOficina = contatoOficina;
	}

	public ArthurOficina() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArthurCarro[] getCarros() {
		return carros;
	}

	public void setCarros(ArthurCarro[] carros) {
		this.carros = carros;
	}

	public ArthurMoto[] getMotos() {
		return motos;
	}

	public void setMotos(ArthurMoto[] motos) {
		this.motos = motos;
	}

	public ArthurContato getContatoOficina() {
		return contatoOficina;
	}

	public void setContatoOficina(ArthurContato contatoOficina) {
		this.contatoOficina = contatoOficina;
	}

	// Métodos

	/* INFORMAR O VALOR TOTAL DOS VEÍCULOS NA OFICINA; */
	public double informarValorTotal() {
		double acumulador1 = 0;
		double acumulador2 = 0;
		double auxiliar = 0;
		for (int i = 0; i < this.getCarros().length; i++) {
			acumulador1 += this.getCarros()[i].getValor();
		}
		for (int j = 0; j < this.getMotos().length; j++) {
			acumulador2 += this.getMotos()[j].getValor();
		}
		auxiliar = acumulador1 + acumulador2;

		return auxiliar;
	}

	// IDENTIFICAR A MOTO MAIS BARATA NA OFICINA;
	public void motoMaisBarata() {
		ArthurMoto maisBarata = new ArthurMoto();
		maisBarata = this.getMotos()[0];
		for (int i = 0; i < this.getMotos().length; i++) {
			this.getMotos()[i].getValor();
			if (maisBarata.getValor() > this.getMotos()[i].getValor()) {
				maisBarata = this.getMotos()[i];
			}
		}
		System.out.println("a moto mais barata da oficina é: \n" + maisBarata);
	}

	/*
	 * DADO O PROPRIETÁRIO DE UM VEÍCULO, IDENTIFICAR O VEÍCULO. NESTE CASO SEMPRE
	 * SERÁ INFORMADO O NOME DO PROPRIETÁRIO DO VEÍCULO COMO PARÂMETRO;
	 */

	public void identificarVeiculo(String nome) {
		for (int i = 0; i < this.getCarros().length; i++) {
			if (this.getCarros()[i].getDono().getNome().equalsIgnoreCase(nome)) {
				System.out.println("Veículo: \n" + this.getCarros()[i]);
			}
		}
		for (int j = 0; j < this.getMotos().length; j++) {
			if (this.getMotos()[j].getDono().getNome().equalsIgnoreCase(nome)) {
				System.out.println("Veículo: \n" + this.getMotos()[j]);
			}

		}

	}

}
