
public class IRRF {

	public static void main(String[] args) {
		double salario = 3400.0;

		if (salario < 2500.0) {
			System.out.println("A sua aliquota � 15%");
			System.out.println("Voc� pode deduzir ate 3500");
		} else if (salario > 2500.0 && salario <= 3800.0) {
			System.out.println("A sua aliquota � 18%");
			System.out.println("Voc� pode deduzir ate 500");
		} else {
			System.out.println("A sua aliquota � 23%");
			System.out.println("Voc� pode deduzir ate 630");
		}
	}

}
