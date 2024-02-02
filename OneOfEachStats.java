import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java OneOfEachStats <number_of_families>");
            return;
        }

        int familyNumber = Integer.parseInt(args[0]);
        Random generator = new Random(); // Use default seed for randomness

        int num2children = 0;
        int num3children = 0;
        int num4children = 0;
        int totalChildren = 0;

        for (int i = 0; i < familyNumber; i++) {
            int count = simulateOneFamily(generator);

            totalChildren += count;

            if (count == 2) {
                num2children++;
            } else if (count == 3) {
                num3children++;
            } else {
                num4children++;
            }
        }

        double average = (double) totalChildren / familyNumber;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + num2children);
        System.out.println("Number of families with 3 children: " + num3children);
        System.out.println("Number of families with 4 or more children: " + num4children);

        int mostCommon = findMostCommonChildren(num2children, num3children, num4children);
        if (mostCommon == 4) {
            System.out.println("The most common number of children is 4 or more.");
        } else {
            System.out.println("The most common number of children is " + mostCommon + ".");
        }
    }

    private static int simulateOneFamily(Random generator) {
        boolean boy = false;
        boolean girl = false;
        int count = 0;

        while (!(boy && girl)) {
            double rnd = generator.nextDouble();
            if (rnd < 0.5) {
                boy = true;
            } else {
                girl = true;
            }
            count++;
        }

        return count;
    }

    private static int findMostCommonChildren(int num2children, int num3children, int num4children) {
        if (num2children >= num3children && num2children >= num4children) {
            return 2;
        } else if (num3children >= num2children && num3children >= num4children) {
            return 3;
        } else {
            return 4;
        }
    }
}
