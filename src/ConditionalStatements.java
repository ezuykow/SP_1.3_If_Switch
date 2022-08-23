public class ConditionalStatements {
    public static void main(String[] args) {

        System.out.println("\nTask 1:");
        task1();

        System.out.println("\nTask 2:");
        task2();

        System.out.println("\nTask 3:");
        task3();

        System.out.println("\nTask 4:");
        task4();

        System.out.println("\nTask 5:");
        task5();

        System.out.println("\nTask 6:");
        task6();

        System.out.println("\nTask 7:");
        task7();
    }

    private static void task1() {
        int clientOS = (int) (Math.random() + 0.5);

        if (clientOS == 0) {
            System.out.println("Install the iOS version of the app from the link");
        } else {
            System.out.println("Install the Android version of the app from the link");
        }
    }

    private static void task2() {
        int clientOS = (int) (Math.random() + 0.5);
        int clientDeviceYear = (int) (2010 + Math.random()*13);

        StringBuilder result = new StringBuilder("Install the ");

        if (clientDeviceYear < 2015) {
            result.append("lite version of ");
        }

        if (clientOS == 0) {
            result.append("iOS app from the link");
        } else {
            result.append("Android app from the link");
        }

        System.out.println(result);
    }

    private static void task3() {
        int year = (int) (1900 + Math.random()*123);

        //im want to use meth Year.isLeap(year), but...

        if ((year%400 == 0) || (year%4 == 0) && (year%100 != 0)) {
            System.out.println(year + " - is leap year");
        } else {
            System.out.println(year + " - is not leap year");
        }
    }

    @SuppressWarnings("ConstantConditions")
    private static void task4() {
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Delivery will take days: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Delivery will take days: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Delivery will take days: 3");
        }
    }

    private static void task5() {
        int monthNumber = (int) (Math.random()*14); //14 for wrong case

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " is a winter month");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " is a spring month");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " is a summer month");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " is a autumn month");
                break;
            default:
                System.out.println("Invalid month number...");
        }
    }

    @SuppressWarnings("ConstantConditions")
    private static void task6() {
        int age = 19;
        int salary = 58_000;

        int limit = age < 23 ? 2*salary : 3*salary;

        if (salary >= 80_000) {
            limit *= 1.5;
        } else if (salary >= 50_000) {
            limit *= 1.2;
        }

        System.out.println("We are ready ro issue you a credit card with a limit " +
                limit + " rubles");
    }

    @SuppressWarnings("ConstantConditions")
    private static void task7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        double rate = 0.1;

        if (age < 23) {
            rate += 0.01;
        } else if (age < 30) {
            rate += 0.005;
        }

        if (salary > 80_000) {
            rate -= 0.007;
        }

        double creditSum = wantedSum * (rate + 1);
        double payment = creditSum/12.0;
        double maxPayment = salary/2.0;

        if (payment < maxPayment) {
            System.out.println("Maximal payment with salary " + salary + " rubles is " + maxPayment + " rubles. " +
                    "Loan payment is " + payment + " rubles. Approved.");
        } else {
            System.out.println("Maximal payment with salary " + salary + " rubles is " + maxPayment + " rubles. " +
                    "Loan payment is " + payment + " rubles. Denied.");
        }
    }
}