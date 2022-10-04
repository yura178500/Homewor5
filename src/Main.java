public class Main {
    public static void main(String[] args) {
        //Заданя 7.1
        int clientOS = 0 || 1;
        if (clientOS = 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS = 1){
                System.out.println("Установите версию приложения для Android по ссылке");
                        }
         // задание 7.2
            int clientOS = 0 || 1;
            if (clientOS = 0)
                System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS = 1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
                int clientDeviceYear = 2015;
            if (clientDeviceYear >= 2015) {
                System.out.println("приложение будет работать корректно");
                if (clientDeviceYear < 2015 && clientOS = 0 ){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    if (clientDeviceYear < 2015 && clientOS = 1 ){
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
              //Задача 7.3
                    int year = 2021;
                       switch (year ) {
                        case 2024:
                        case 2028:
                        case 2032:
                        case 2036:
                        case 2040:
                            System.out.println(“Год является высокосным”);
                            break;
                                   }
                //Задача 7.4
                    int deliveryDistance = 95;
                      if (deliveryDistance <= 20){
                          System.out.println("Потребуется дней: + сутки на достваку");
                          if (deliveryDistance = 20 || <= 60){
                              System.out.println("Потребуется дней: + 2 суток на достваку");}
                              if (deliveryDistance = 60 || <= 100 ){
                              System.out.println("Потребуется дней: + 3 суток на достваку");
                          }
                   // Задача 7.5
                          int monthNumber = 12;

                          switch (monthNumber) {
                              case 1:
                                  System.out.println(“январь”);
                                  break;
                              case 2:
                                  System.out.println(“февраль”);
                                  break;
                              case 3:
                                  System.out.println(“март”);
                                  break;
                              case 4:
                                  System.out.println(“апрель”);
                                  break;
                              case 5:
                                  System.out.println(“март”);
                                  break;
                              case 6:
                                  System.out.println(“май”);
                                  break;
                              case 7:
                                  System.out.println(“июнь”);
                                  break;
                              case 8:
                                  System.out.println(“июль”);
                                  break;
                              case 9:
                                  System.out.println(“август”);
                                  break;
                              case 10:
                                  System.out.println(“сентябрь”);
                                  break;
                              case 11:
                                  System.out.println(“октябрь”);
                                  break;
                              case 12:
                                  System.out.println(“декабрь”);
                                  break;

                              default:
                                  System.out.println(“Такого месяца не существует”);
                          }
                      }
        }
    }
}