public class OneOfEach {
    public static void main(String[] args) {
        boolean boy = false;
        boolean girl = false;
        int num = 0;

        while (!(boy && girl)) {
            double baby = Math.random();

            if (baby > 0.5) {
                boy = true;
                System.out.print("b ");
            } else {
                girl = true;
                System.out.print("g ");
            }

            num++;
        }

        System.out.println("You made it... and you now have " + num + " children.");
    }
}
