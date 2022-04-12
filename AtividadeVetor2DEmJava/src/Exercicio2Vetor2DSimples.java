import javax.swing.JOptionPane;

public class Exercicio2Vetor2DSimples {
	/*
	 * Repare nos vetores abaixo: Double[] semanaUm = new Double[]{ 1000.0, 1500.0,
	 * 1250.0, 2100.0, 1350.0, 970.0, 0.0 }; Double[] semanaDois = new Double[]{
	 * 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 }; Double[] semanaTres =
	 * new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 }; Double[]
	 * semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0,
	 * 0.0 }; Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres,
	 * semanaQuatro }; Os quatro primeiros vetores est�o guardando o faturamento
	 * di�rio de cada semana e o �ltimo vetor, que � de 2 dimens�es, guarda o
	 * faturamento mensal separado por semanas. Crie um algoritmo que encontre qual
	 * a semana teve o maior faturamento. No final mostre qual foi essa semana e de
	 * quanto foi esse faturamento.
	 */

	public static void main(String[] args) {
		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		String[] mesNome = new String[] { "Semana Um", "Semana Dois", "Semana Tres", "Semana Quatro" };

		Double[] resultado = new Double[] { 0.0, 0.0, 0.0, 0.0 };

		for (int i = 0; i < mes.length; i++) {
			// System.out.println(mes.length);
			for (int j = 0; j < 7; j++) {
				// Double numeros = mes[i][j];

				resultado[i] += mes[i][j];
			}
		}

		for (int i = 0; i < resultado.length; i++) {
			Double faturamentoMaior = resultado[0];
			if (resultado[i] > faturamentoMaior) {
				faturamentoMaior = resultado[i];
				String semana = mesNome[i];
				JOptionPane.showMessageDialog(null, "O maior faturamento � " + faturamentoMaior + " \ncorresponde a  " + semana);
				break;
			}
		}

	}
	
	

}