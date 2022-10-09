public class Main {
    public static void main(String[] args) {
        //Заданя 7.1
        int clientOS1 = 0;
        System.out.println(clientOS1);
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientOS2 = 1;
            System.out.println(clientOS2);
        if (clientOS2 == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
                        }
         // задание 7.2
            int clientOS1 = 0;
            System.out.println(clientOS1);
            if (clientOS1 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            int clientOS2 = 1;
                System.out.println(clientOS2);
            if (clientOS2 == 1){
                    System.out.println("Установите версию приложения для Android по ссылке");
            }
            int clientDeviceYear = 2015;
            if (clientDeviceYear >= 2015) {
                System.out.println("приложение будет работать корректно");}
            if (clientDeviceYear < 2015 && clientOS1 = 0 ){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            if (clientDeviceYear < 2015 && clientOS2 = 1 ){
                     System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
              //Задача 7.3
            int year = 2021;
                System.out.println(year);
            for (int i = 2021; i < 4000; i++) {
            if (i % 4 != 0) {
                      System.out.println("Год весокосный" = i);}
                                   }
             //Задача 7.4
             int deliveryDistance = 95;
            System.out.println(deliveryDistance);
            if (deliveryDistance <= 20){
                          System.out.println("Потребуется дней: + сутки на достваку");}
             if (deliveryDistance <= 60){
                    System.out.println("Потребуется дней: + 2 суток на достваку");}
             if (deliveryDistance <= 100 ){
                    System.out.println("Потребуется дней: + 3 суток на достваку");
                          }
             // Задача 7.5
        int dayOfWeekNumber = 12;

        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
