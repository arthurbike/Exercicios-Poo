package exercicio_oficina;

import java.text.DecimalFormat;

public class ArthurExecutavel {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");

		// Contato para pessoas
		ArthurContato c1 = new ArthurContato("1111-1111", "CARLOS@GMAIL.COM");
		ArthurContato c2 = new ArthurContato("2222-2222", "ZECA@GMAIL.COM");
		ArthurContato c3 = new ArthurContato("3333-3333", "VERA@GMAIL.COM");
		ArthurContato c4 = new ArthurContato("4444-4444", "BIA@GMAIL.COM");
		ArthurContato c5 = new ArthurContato("5555-5555", "CINTIA@GMAIL.COM");
		ArthurContato c6 = new ArthurContato("6666-6666", "CINTIA@GMAIL.COM");

		// Contato para Oficina
		ArthurContato c7 = new ArthurContato("9999-9999", "OFICINA@GMAIL.COM");

		// Pessoas
		ArthurPessoa p1 = new ArthurPessoa("CARLOS", 30, "02069194938", c1);
		ArthurPessoa p2 = new ArthurPessoa("ZECA", 35, "03160104038", c2);
		ArthurPessoa p3 = new ArthurPessoa("VERA", 42, "16538705614", c3);
		ArthurPessoa p4 = new ArthurPessoa("BIA", 27, "27905679831", c4);
		ArthurPessoa p5 = new ArthurPessoa("CINTIA", 22, "58134890518,", c5);
		ArthurPessoa p6 = new ArthurPessoa("MIGUEL", 42, "MIGUEL,", c6);

		// Motos para array de motos (Oficina)
		ArthurMoto m1 = new ArthurMoto("CBR-65", "HONDA", 2016, 30000, "MKZ-1315", p1);
		ArthurMoto m2 = new ArthurMoto("CG-160", "HONDA", 2017, 11500, "MJJ-2512", p2);

		// Carros para array de carro (Oficina)
		ArthurCarro carro1 = new ArthurCarro("HRV", "HONDA", 2018, 90000, "MLG-2210", p3);
		ArthurCarro carro2 = new ArthurCarro("FIT", "HONDA", 2015, 50000, "MMN-5629", p4);
		ArthurCarro carro3 = new ArthurCarro("CIVIC", "HONDA", 2017, 98500, "MGT-5533", p5);
		ArthurCarro carro4 = new ArthurCarro("HRV", "HONDA", 2017, 80000, "MHP-2578", p6);

		// Array de carros
		ArthurCarro[] carros = { carro1, carro2, carro3, carro4 };

		// Array de motos
		ArthurMoto[] motos = { m1, m2 };

		// Criando Oficina
		ArthurOficina oficina = new ArthurOficina("Senac Oficina Mecânica", carros, motos, c7);

		// Executável

		
		
		System.out.print("Valor total dos veículos: ");
		System.out.println(oficina.informarValorTotal());
		System.out.println("----------------------------------------");
		oficina.motoMaisBarata();
		System.out.println("----------------------------------------");
		oficina.identificarVeiculo("miguel");

	}

}
