import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {

		int i = 0;
		while (i == 0){
			try {

				Scanner leia = new Scanner(System.in);
				Numero n = new Numero();
				//int n1;
				//int n2;
				double resultado;

				System.out.println("Informe o primeiro n�mero: ");
				n.n1 = leia.nextInt();

				System.out.println("Informe o segundo n�mero: ");
				n.n2 = leia.nextInt();
				
				n.validaNumeros();

				resultado = n.dividir();

				System.out.println("O resultado da divis�o dos n�meros �: "+ resultado);
				i = 1;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
