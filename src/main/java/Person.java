import java.util.Scanner;

public class Person {
    int valueOfPeople ;


    public void numberOfPerson() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт?");
        // количество человек

        while (true) {

            if (scanner1.hasNextInt()) {
                valueOfPeople = scanner1.nextInt();

                if (valueOfPeople == 1) {
                    System.out.println("Деление не требуется,за счёт платит " + valueOfPeople + " человек!");
                    break;

                } else if (valueOfPeople <= 0 ) {
                    System.out.println("Введены некорректные данные, попробуйте еще раз");
                    scanner1.nextLine();

                }else if (valueOfPeople > 20000 ) {
                    System.out.println("Введены некорректные данные,попробуйте еще раз");
                    scanner1.nextLine();

                }
                else {
                    System.out.println("Счёт будет поделен на " + valueOfPeople );
                    break;
                }
            }
            else {
                System.out.println("Некорректные данные, попробуйте еще раз");
                scanner1.nextLine();

            }
        }
    }
}

