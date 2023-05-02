
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Calculator calculator  = new Calculator();
        person.numberOfPerson();
        calculator.productEntry();
        System.out.println(String.format( "Добавленные товары: %s \nОбщая стоимость- %.2f",calculator.totalProduct,calculator.totalPrice));// System.out.println("Добавленные товары: "+ calculator.totalProduct + "\n Общая стоимость -  "+ calculator.totalPrice);

        double checkForEveryOne = calculator.totalPrice / person.valueOfPeople;
        int sumCheck = (int) Math.floor(checkForEveryOne);
        String rubles = "";
        switch (sumCheck % 10){
            case 0:
                rubles = "рублей";
                break;
            case 1:
                rubles = "рубль";
                break;

            case 2:
                rubles = "рубля";
                break;
            case 3:
                rubles = "рубля";
                break;
            case 4:
                rubles = "рубля";
                break;
            case 5:
                rubles = "рублей";
                break;
            case 6:
                rubles = "рублей";
                break;
            case 7:
                rubles = "рублей";
                break;
            case 8:
                rubles = "рублей";
                break;
            case 9:
                rubles = "рублей";
                break;
        }
        switch (sumCheck % 100){
            case 11:
                rubles ="рублей";
            case 12:
                rubles ="рублей";
            case 13:
                rubles ="рублей";
            case 14:
                rubles ="рублей";
        }

        System.out.println("Каждый платит - " + String.format("%.2f %s",checkForEveryOne, rubles));


    }
}