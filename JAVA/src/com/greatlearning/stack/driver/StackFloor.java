package com.greatlearning.stack.driver;

import com.greatlearning.stack.service.SupportStackFloor;

import java.util.LinkedList;
import java.util.Scanner;

public class StackFloor {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        Scanner data = new Scanner(System.in);
        SupportStackFloor object = new SupportStackFloor();
        System.out.println("\"enter the total no of floors in the building\"");
        int numberOfFloors = data.nextInt();
        int max = 0;

        for(int i = 0; i < numberOfFloors; ++i) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            int floorSize = data.nextInt();
            if (floorSize > 0 && !ll.contains(floorSize)) {
                ll.add(floorSize);
            } else {
                System.out.println("Please feed proper value and do not repeat");
                --i;
            }

            if (floorSize > max) {
                max = floorSize;
            }
        }

        object.printFloorJob(ll, max);
    }
}

