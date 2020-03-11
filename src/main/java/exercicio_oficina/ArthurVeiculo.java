package exercicio_oficina;

import java.text.DecimalFormat;

public class ArthurVeiculo {
	private String modelo;
	private String fabricante;
	private int ano;
	private double valor;
	private String placa;
	private ArthurPessoa dono;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public ArthurVeiculo(String modelo, String fabricante, int ano, double valor, String placa, ArthurPessoa dono) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.valor = valor;
		this.placa = placa;
		this.dono = dono;
	}

	public ArthurVeiculo() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ArthurPessoa getDono() {
		return dono;
	}

	public void setDono(ArthurPessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return " modelo: " + modelo + "\n fabricante: " + fabricante + "\n ano: " + ano + "\n valor: " + df.format(valor)
				+ "\n placa: " + placa + "\n-----------------------------\n" + " dono: " + dono;
	}

}
