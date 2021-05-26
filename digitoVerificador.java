import java.util.Arrays;
import java.util.Scanner;

class digitoVerificador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Ler os m�todos de entrada;
		int menu;
		int CPF = 0;
		String charCPF;
		for (int i = 0; i < 1000; i++) {
			System.out.println(
					"Ol�! Seja bem-vindo, escolha o que voc� deseja fazer: \n(1) Verificar o d�gito verificador do CPF \n (2) Informa��es do Desenvolvedor \n (3) Sair do algoritmo");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Por favor, insira os 9 primeiros digitos do seu CPF: ");
				charCPF = scan.next();
				if (charCPF.length() != 9 || charCPF.matches("[A-Z][a-z]*")) {
					System.out.println("CPF Inv�lido, insira novamente! ");
					break;
				}
				validaCPF(charCPF);
				break;
			case 2:
				System.out.println(
						"\n Essa aplica��o foi desenvolvida por: \n MOIS�S BARBOSA DOS SANTOS (1-2021119639) com o objetivo de concluir a APS pelo Centro Universit�rio UNIFAMETRO \n");
				break;
			case 3:
				i += 1000;
				break;
			default:
			}
		}
	}

	public static void validaCPF(String charCPF) {
		// VALIDA��O DOS DADOS INSERIDOS:

		int dv1 = 0;
		int soma1 = 0;
		int peso1 = 2;
		int num1 = 0;

		for (int i = charCPF.length() - 1; i >= 0; i--) {
			// Por algum motivo os valores dessa express�o vem no formato da tabela ASCII e
			// por conta disso realizei a convers�o dos valores para inteiros sem precisar
			// alterar o tipo de dados e conseguir usar o .length;
			num1 = (int) (charCPF.charAt(i) - 48);
			soma1 += (num1 * peso1);
			peso1++;
		}
		soma1 *= 10;
		soma1 = soma1 % 11;
		if (soma1 == 10) {
			dv1 = 0;
		} else {
			dv1 = soma1;
		}

		int dv2 = 0;
		int soma2 = 0;
		int peso2 = 3;
		int num2 = 0;

		for (int i = charCPF.length() - 1; i >= 0; i--) {
			num2 = (int) (charCPF.charAt(i) - 48);
			soma2 += (num2 * peso2);
			peso2++;
		}

		soma2 += (dv1 * 2);
		soma2 *= 10;
		soma2 = soma2 % 11;
		dv2 = soma2;

		int dv3 = 0;
		dv3 = (dv1 * 10) + dv2;

		System.out.println("O seu CPF �: " + charCPF + dv3);
	}
}