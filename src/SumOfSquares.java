import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        int arraySize;
        System.out.print("Podaj wielkość tablicy: ");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();

        double[] numbers = new double[arraySize];
        for(int index = 0; index< arraySize; index++){
            System.out.printf("Podaj liczbę %dz%d: ", (index+1),arraySize);
            numbers[index] = scanner.nextInt();
        }
        scanner.close();

        Calculation calculation = new Calculation();
        System.out.println("Suma kwadratów liczb zapisanych w tablicy wynosi: " + calculation.squareSum(numbers));
    }
}
