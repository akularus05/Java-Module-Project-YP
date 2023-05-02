import java.util.Scanner;

public class Calculator {
    double totalPrice=0;
    String totalProduct = "" ;

    public void priceEntry() {
        System.out.println("Введите стоимость товара в формате \"xx,xx\" цифрами");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextDouble()) {
                double inputPrice = scanner.nextDouble();
                if (inputPrice<=0){
                    System.out.println("вы ввели некорректные данные");
                    scanner.nextLine();

                } else{
                    System.out.println("Стоимость- "+ inputPrice);
                    totalPrice = totalPrice + inputPrice;
                    break;
                }
            } else {
                System.out.println("Похоже вы ввели буквы или \".\",введите стоимость товара в формате \"xx,xx\" цифрами ");
                scanner.nextLine();
            }
        }
    }
    public void productEntry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String nameOfProduct  = scanner.nextLine();

        while (true){
            if(nameOfProduct.equalsIgnoreCase("завершить")){
                System.out.println("операция завершена");
                break;
            }
            else if(nameOfProduct.isEmpty()) {
                System.out.println("вы ввели некоректные данные, попробуйте еще раз");
                nameOfProduct = scanner.nextLine();
            }
            else {
                System.out.println("вы выбрали "+ nameOfProduct);
                totalProduct = totalProduct +"\n"+ nameOfProduct;
                priceEntry();
                System.out.println("Хотите добавить что-то еще? Если нет, введите \"завершить\" ?");
                nameOfProduct = scanner.nextLine();
            }
        }
    }

}
