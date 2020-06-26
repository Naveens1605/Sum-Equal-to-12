package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        List<Coordinate> res = new ArrayList<>();
        System.out.println("Enter the Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int p = 0;
        int j = 0;
        int k = n - 1;
        while(j < k) {
            int start = a[j];
            int last = a[k];
            if (start + last == 12) {
                res.add(new Coordinate(start,last));
            }
            if (start + last > 12) {
                k--;
            } else {
                j++;
            }
        }
            System.out.println(res);
    }
}
