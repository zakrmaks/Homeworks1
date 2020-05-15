package Calculator;


public class Main {

	public static void main(String[] args) {

	//	Tusk1();
		Tusk2();

		}

	private static void Tusk2() {
		int width  = 15;
		int height = 10;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (y == 0 || y == height - 1  ) {
					System.out.print('*');
				} else {
					if  (x == 0 || x == width - 1 ) {
						System.out.print('*');
					} else  {
						System.out.print(' ');
					}
				}


				}
			System.out.print("\n\r");
			}

		}


	private static void Tusk1() {
		Calculate calculate = new Calculate();
		System.out.println("Ваше первое число:" + calculate.getFirstNumber());
		System.out.println("Ваше второе число:" + calculate.getSecondNumber());
		System.out.printf("Сумма ваших чисел равна:%.2f%n", calculate.getAddition());
		System.out.printf(" Разница ваших чисел равна:%.2f%n", calculate.getSubtraction());
		System.out.printf("Частное ваших чисел равно:%.2f%n", calculate.getDivide());
		System.out.printf("Произведение ваших чисел равно:%.2f%n", calculate.getMultipl());
	}
}






