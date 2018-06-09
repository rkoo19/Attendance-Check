package com.company;

import java.io.*;
import java.sql.Timestamp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            FileWriter out = new FileWriter("concert_support.csv", true);
            System.out.print("Student ID: ");
            id = sc.nextLine();
            if (id.equals("quit")) {
                break;
            }
            out.write(id+", "+ts+"\n");

            out.close();
        }
    }
}