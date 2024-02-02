public class OneOfEach {
    public static void main(String[] args) {
       boolean s = true;
       int n = 0;
       double t = 0;



            while (s == true) {
             t =  Math.random();
                if (t>0.5){
                    s = true;
                    System.out.println("b ");
                    n++;
                
                }
                if (t<=0.5){
                    s = false;
                    System.out.println("g ");
                    n++;
                }
                t =  Math.random();
            }
                while (s == false) {

                    System.out.println("g ");
                    n++;
                    if (t>0.5){
                        s = true;
                        System.out.println("b ");
                        n++;
                       break;
                }
                break;
            }


/*if (s == true) {
    System.out.println("b ");
    n++;
else {
    System.out.println("b ");
    n++;
}
}*/
System.out.println("You made it... and you now have " + n + " cildren.");

    
}
}