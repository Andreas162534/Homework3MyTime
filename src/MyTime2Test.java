package edu.sjsu.assignment2;  //why is this always red??
import java.util.Scanner;
import org.junit.Test;


import java.util.Scanner;

import static edu.sjsu.assignment2.MyTime2.printTimeDifference;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


class MyTime2Test {
    @Test
    public void regexTimes() {
        //MaxHeap heap = new MaxHeap(10);
        //heap.insert(new Student("Susan", 3.5, 60));

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter year(yyyy):");
        int year = sc.nextInt();
        assertTrue("Leap Year", leapYear.isLeapYear(year));
        sc.close();

        Scanner sc = new Scanner(System.in);   //create scannerobj pointing to keyboard
        System.out.print("Enter first time");
        timestr1 = scan1.nextLine(); */
        ;  //put diffhourstr rein
        String actual = printTimeDifference();
        String expected = "8 hours 20 minutes";
        assertEquals(expected, actual);  //what is delta tho
    }
}