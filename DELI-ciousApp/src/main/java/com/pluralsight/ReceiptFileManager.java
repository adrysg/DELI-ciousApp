package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ReceiptFileManager {
    //save order details in a receipts folder

    public ReceiptFileManager(Order order) throws IOException {

        try {

            // getting current date & time
            LocalDateTime now = LocalDateTime.now();

            // Formatting date and time for file name
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String formattedDate = now.format(formatter);

            //assign formatted date to file name
            String fileName = "receipts/" + formattedDate + ".txt";

            File receiptsDirectory = new File("receipts");
            if (!receiptsDirectory.exists()) {
                if (receiptsDirectory.mkdir()) {
                    System.out.println("Receipts directory created.");
                } else {
                    System.out.println("Failed to create receipts directory.");
                    return;
                }
            }


            // using a file writer to create and write order details to a file
            FileWriter fw = new FileWriter(fileName, false);
            fw.write(order.toString());

            // printing confirmation
            System.out.println("Receipt successfully saved, have a nice day!");
            fw.close(); //closing the file writer

        } catch (IOException e) {
            System.out.println("Unable to save receipt!");
        }
    }
}
