public class Demo {
    public static void main (String args[]){

        /* Relational Operators 
            int a =5;
            int b =6;
            boolean result = a==b;
            System.out.println(result); */

        /*Logical Operator
            int x=7;
            int y=5;
            int a=5;
            int b=9;
            //boolean result = x>y && a>b;
            //boolean result = x>y || a>b;
            //boolean result = a>b; // a>b = false 
            System.out.println(!result);  */

        /*if else in Java 
            int x=5;
            int y=7;

            if(x>y){
                System.out.println(x);
                System.out.println("Thank you!");
            }
            else
            System.out.println(y);*/


        /*if else if in Java 
                int x=5;
                int y=17;
                int z=9;

                if(x>y && x>z)
                    System.out.println(x);
                else if(y>z)
                    System.out.println(y);
                else
                    System.out.println(z); */

        /* Ternary Operator 
            int n=4;
            int result =0;

                    //if(n%2==0)
                    //    System.out.println(10);
                    //else
                    //System.out.println(20);

            result= n%2==0 ? 10 : 20;
            System.out.println(result);  */
            
        /*Switch case in Java 
        int n=5;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the valid number");
                break;
        }  */ 

        /* new switch case with -> symbol without break statement 
            String day ="Monday";
            switch (day){
                case "Saturday", "Sunday" -> System.out.println("6 am");
                case "Monday" -> System.out.println("8 am");
                default -> System.out.println("7am"); 
            }  */

        /*While Loop 
            int i=1;
            while(i<=4)
            {
                System.out.println("Hi " + i);
                i++;

                int j=1;
                while(j<=3)
                {
                    System.out.println("Hello " + j );
                    j++;
                }
            }

            System.out.println("Bye "+i);
         */

        /* Do while loop in java 
            int i=5;

            do{
                System.out.println("Hi "+ i);
                i++;
            }while(i<=4);
        */

        /* For Loop in java

            for (int i=1; i<=4; i++)
            {
                System.out.println("Hi" + i);
            }
        */

        /* Nested For Loop 

            for (int i=1; i<=5; i++)
            {
                System.out.println("Day" + i);

                for(int j=1; j<=9; j++)
                {
                    System.out.println("    " + (j+8) + " - " + (j+9));
                }
            }
        */

        
    }

}
