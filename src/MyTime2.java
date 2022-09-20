

import java.util.Scanner;

/**
 *
 */
public class MyTime2 {

//1: 320   2: 210     10-20 = -10 + 60 = 50   subtract a one!
    //2-3 = -1
    //2-3 + 24 = 23

    /**
     *
     * @return
     */
    public static String printTimeDifference() {       //doesnt return anything,
        String timestr1;
        String timestr2;
        try {
            System.out.print("Enter first time ");
            Scanner scan1 = new Scanner(System.in);   //create scannerobj pointing to keyboard
            timestr1 = scan1.nextLine();   //moved up, before second print ; stores line in string

            if(!timestr1.matches("^[0-1][0-9][0-5][0-9]$") && !timestr1.matches("^[2][0-3][0-5][0-9]$"))//get regular expression
            {
                System.out.println("Wrong input");
               return "Wrong input";
            }  //empty body
            System.out.print("Enter second time ");
            Scanner scan2 = new Scanner(System.in);
            timestr2 = scan2.nextLine();
            if(!timestr2.matches("^[0-1][0-9][0-5][0-9]$") && !timestr2.matches("^[2][0-3][0-5][0-9]$"))
            {
                return "Wrong input";
            }

            int time1 = Integer.parseInt(timestr1);           //how to I put args in here??
            int time2 = Integer.parseInt(timestr2);           //has to be different!
            int hours1 = time1 / 100;
            int hours2 = time2 / 100;  //1200
            int min1 = time1 % 100;  //40
            int min2 = time2 % 100;

            int diffhours = 0;
            int diffmin = 0;   //do I have to do this!!

            if (hours2 > hours1) {

                if (min2 >= min1) {
                    diffhours = hours2 - hours1;
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1;
                    String diffminstr = Integer.toString(diffmin);
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");


                } else {  //else if (hours2< hours1)
                    diffhours = hours2 - hours1 - 1;   //minutes makes it smaller!
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1 + 60;
                    String diffminstr = Integer.toString(diffmin);
                    //check that!
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");
                }


            } else if (hours2 == hours1) {
                if (min2 >= min1) {
                    diffhours = hours2 - hours1;
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1;
                    String diffminstr = Integer.toString(diffmin);
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");

                } else {
                    diffhours = hours2 - hours1 + 24 - 1;
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1 + 60;
                    String diffminstr = Integer.toString(diffmin);
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");
                }
            } else {


                if (min2 >= min1) {
                    diffhours = hours2 - hours1 + 24;
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1;
                    String diffminstr = Integer.toString(diffmin);
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");

                } else {
                    diffhours = 24 + hours2 - hours1 - 1;   //min makes it smaller!
                    String diffhoursstr = Integer.toString(diffhours);
                    diffmin = min2 - min1 + 60;
                    String diffminstr = Integer.toString(diffmin);
                    System.out.println(diffhoursstr + " hours " + diffminstr + " minutes");
                    return (diffhoursstr + " hours " + diffminstr + " minutes");

                }

            }


        }catch (IllegalArgumentException e){   //eine eierlegende Wollmilchsau 
            System.out.println("Invalid inupt! programm terminated!" );


        }
        return "didnt i cover all?";
    }

}



