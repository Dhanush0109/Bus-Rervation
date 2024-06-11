package BusResv;

import java.io.*;
import java.util.*;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));

        Scanner sc = new Scanner(System.in);
        int userOpt = 1;
        for(Bus b:buses){
            b.displayBusInfo();
        }
        while(userOpt == 1){
            System.out.println("Enter 1 to book and 2 to Exit");
            userOpt = sc.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your book has been confirmed");
                }else{
                    System.out.println("Sorry . Buses are full try another bus or date");
                }
            }
        }
    }
}
