public class OneOfEachStats1 {
    public static void main(String[] args) {
       
        int num2children = 0;
        int num3children = 0;
        int num4children = 0;
		int num = 0;
        int familyNumber = Integer.parseInt(args[0]);

        for (int i = 0; i < familyNumber; i++) {
            boolean boy = false;
            boolean girl = false;
            

            while (!(boy && girl)) {
                double baby = Math.random();

                if (baby > 0.5) {
                    boy = true;
                } else {
                    girl = true;
                }

                num++;
            }

            if (num == 2) {
                num2children++;
            } else if (num == 3) {
                num3children++;
            } else if (num >= 4) {
                num4children++;
            }

        }

        double avg = (double) (num) / familyNumber;
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + num2children);
        System.out.println("Number of families with 3 children: " + num3children);
        System.out.println("Number of families with 4 or more children: " + num4children);

        int common = 0;
        if (num2children >= num3children && num2children >= num4children) {
            common = 2;
        } else if (num3children >= num2children && num3children >= num4children) {
            common = 3;
        } else {
            common = 4;
        }

        if (common == 4) {
            System.out.println("The most common number of children is 4 or more.");
        } else {
            System.out.println("The most common number of children is " + common + ".");
        }
    }
}
