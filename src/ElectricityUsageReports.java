import java.util.Scanner;

public class ElectricityUsageReports {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int totalElectricityUsage;
        String customerName;
        String customerNumber;
        int customerElectricityUsage;
        double amountOwing;

//        GETTING INPUT
        System.out.println("Customer number:");
        customerNumber = input.nextLine();

        System.out.println("Customer name:");
        customerName = input.nextLine();

        System.out.println("Electricity usage:");
        customerElectricityUsage = input.nextInt();

//        CALCULATIONS

        if (customerElectricityUsage > 200) {
            amountOwing = (200*11) + ((customerElectricityUsage - 200)*8); //11 cents per kwH then 8 cents per kwH over 200
        } else {
            amountOwing = (customerElectricityUsage*11); //11 cents per kwH
        }

        amountOwing = (amountOwing/100); //convert cents to dollars


//        OUTPUT

        System.out.println("Customer number: " + customerNumber);
        System.out.println("Customer name: " + customerName);
        System.out.println("Electricity usage: " + customerElectricityUsage);
        System.out.println("Total amount due: $" + amountOwing);


//        System.out.println(totalElectricityUsage);










    }

}
