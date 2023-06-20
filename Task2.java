import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List list = new ArrayList<>();
int sum = 0;

System.out.println("Введите числа (0 для завершения ввода):");
while (true) {
int number = scanner.nextInt();
if (number == 0) {
break;
}
list.add(number);
}

for (int i = 0; i < list.size() - 1; i++) {
if (list.get(i) > 0 && list.get(i + 1) < 0) {
sum += list.get(i);
}
}

System.out.println("Сумма положительных чисел, после которых следует отрицательное число, равна: " + sum);
}
}
