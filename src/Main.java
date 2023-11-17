import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String n = scanner.nextLine();
        System.out.print("Введите ФИО: ");
        String f = scanner.nextLine();
        System.out.print("Введите оценки из аттестата: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        int count = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
            count++;
        }
        double res = (double) sum/count;
        System.out.println("Вот ваши данные: \n"+"ФИО \n - "+f+ "\nНомер телефона\n - "+n+"\nСредний балл аттестата\n - " +res);

    }
}