package com.greatlearning.stack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SupportStackFloor {
    public int find_max_index(LinkedList<Integer> ll, int max) {
        return ll.indexOf(max);
    }

    public int find_max(LinkedList<Integer> ll) {
        int max = 0;
        for(int x:ll)
            if (max < x) max = x;
        return max;
    }

    public int printDays(int max_index, int days) {
        while(days <= max_index) {
            System.out.println(" \nDay: " + (days + 1));
            ++days;
        }

        return days;
    }

    public void llpoll(LinkedList<Integer> ll, int max_index) {
        ArrayList<Integer> array = new ArrayList();

        int a;
        for(a = 0; a <= max_index; ++a) {
            array.add(ll.poll());
        }

        while(!array.isEmpty()) {
            a = (Integer) Collections.max(array);
            System.out.print(a + " ");
            array.remove(array.indexOf(a));
        }

    }

    public void printFloorJob(LinkedList<Integer> ll, int max) {
        int days =0;
        int max_index;
        LinkedList<Integer> copyll = new LinkedList<>();
        copyll.addAll(ll);
        while(!ll.isEmpty()){
            max_index = find_max_index(ll,max);
            days = printDays(copyll.indexOf(max),days);
            llpoll(ll,max_index);
            max=find_max(ll);

        }

    }
}
