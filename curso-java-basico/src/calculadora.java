import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		boolean chave = true;
		while (chave) {
			double a, b;
			int menu; 
			System.out.println("Digite o primeiro valor: ");
			Scanner coleta = new Scanner(System.in);
			a = coleta.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			Scanner coleta1 = new Scanner(System.in);			
			b = coleta1.nextDouble();
			
			System.out.println("Escolha a operação: ");
			System.out.println("(1) Soma");
			System.out.println("(2) Subtração");
			System.out.println("(3) Multiplicação");
			System.out.println("(4) Divisão");
			System.out.println("(5) Resto");
			System.out.println("(6) Radiação");
			System.out.println("(7) Potencia");
			System.out.println("(8) Sair");
			
			coleta1 = new Scanner(System.in);
			menu = coleta1.nextInt();		
			
			switch (menu) {
			case 1:
				soma(a,b);
				break;
			case 2:
				subtracao(a,b);
				break;
			case 3:
				multiplicar(a,b);
				break;
			case 4:
				divisao(a,b);
				break;
			case 5: 
				resto(a, b);
				break;
			case 6: 
				radiacao(a, b);
				break;
			case 7:
				potencia(a, b);
				break;
			default:
				chave = false;
				break;
			}
		}
	}
				
	public static double soma(double a, double b) {
		double c = a + b;
		System.out.println(" " + c);
		return c;
	}

	public static double subtracao(double a, double b) {
		double c = a - b;
		System.out.println(" " + c);
		return c;
	}

	public static double multiplicar(double a, double b) {
		double c = a - b;
		System.out.println(" " + c);
		return c;
	}

	public static double divisao(double a, double b) {
		double c = a - b;
		System.out.println(" " + c);
		return c;
	}
	
	public static double resto(double a, double b) {
		double c = a % 2;
		System.out.println(" "+ c);
		return c;
	}
	
	public static double potencia(double a, double b) {
		double c =  (double)Math.pow(a, b);
		System.out.println(" " + c);
		return c;
	}
	
	public static double radiacao(double a, double b) {
		double c = (double)Math.pow(a, 1.0 / b);
		System.out.println(" " + c);
		return c;
	}
}
