public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int[] inputArray1 = {15500, 25800, 10900, 45400, 30600};
        float[] outputArray1 = new float[4];

        int sum = 0;
        for (int payment : inputArray1) {
            sum = sum + payment;
        }

        int max = inputArray1[0];
        for (int payment : inputArray1) {
            if (payment > max) {
                max = payment;
            }
        }

        int min = inputArray1[0];
        for (int payment : inputArray1) {
            if (payment < min) {
                min = payment;
            }
        }

        float sumForAverage = 0.0f;
        for (int payment : inputArray1) {
            sumForAverage = sumForAverage + payment;
        }
        float average = sumForAverage / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.print("inputArray1:  ");
        for (int payment : inputArray1) {
            System.out.print(payment + " ");
        }
        System.out.println();

        System.out.print("outputArray1: ");
        for (float value : outputArray1) {
            System.out.print(value + " ");
        }
        System.out.println();


        System.out.println("Задача № 2");

        int[] inputArray2 = {15500, 25800, 10900, 45400, 30600};
        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;
        for (int payment : inputArray2) {
            outputArray2[index] = payment * 0.13f;
            index = index + 1;
        }

        System.out.print("inputArray2:  ");
        for (int payment : inputArray2) {
            System.out.print(payment + " ");
        }
        System.out.println();

        System.out.print("outputArray2: ");
        for (float tax : outputArray2) {
            System.out.print(tax + " ");
        }
        System.out.println();


        System.out.println("Задача № 3");

        int[] inputArray3 = {3599, 7599, 5000, 12999, 4899};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int empIndex = 0;
        for (int bonus : inputArray3) {
            outputArray3[empIndex] = bonus > 5000;
            empIndex = empIndex + 1;
        }

        System.out.print("inputArray3:  ");
        for (int bonus : inputArray3) {
            System.out.print(bonus + " ");
        }
        System.out.println();

        System.out.print("outputArray3: ");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
        System.out.println();


        System.out.println("Задача № 4");

        int[] inputArray4 = {15500, -25800, 10900, 45400, 30600};
        boolean[] outputArray4 = new boolean[1];

        boolean noOverdraft = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                noOverdraft = false;
                break;
            }
        }

        outputArray4[0] = noOverdraft;

        System.out.print("inputArray4:  ");
        for (int balance : inputArray4) {
            System.out.print(balance + " ");
        }
        System.out.println();

        System.out.print("outputArray4: ");
        for (boolean result : outputArray4) {
            System.out.print(result + " ");
        }
        System.out.println();

        System.out.println("Задача № 5");

        int[] inputArray5 = {159999, -23456, 0, 316789, 75789};
        int[] outputArray5 = new int[1];

        int profitableMonths = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths = profitableMonths + 1;
            }
        }

        outputArray5[0] = profitableMonths;

        System.out.print("inputArray5:  ");
        for (int profit : inputArray5) {
            System.out.print(profit + " ");
        }
        System.out.println();

        System.out.print("outputArray5: ");
        for (int count : outputArray5) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
