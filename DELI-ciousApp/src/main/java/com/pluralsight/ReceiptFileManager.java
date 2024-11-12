package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.pluralsight.Order.*;

public class ReceiptFileManager {
    //save order details in a receipts folder

    public ReceiptFileManager() throws IOException {

        try {

            // getting current date & time
            LocalDateTime now = LocalDateTime.now();

            // Formatting date and time for file name
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String formattedDate = now.format(formatter);

            String directoryPath = "receipts";

            //assign formatted date to file name
            String fileName = directoryPath + formattedDate + ".txt";

            // using a file writer to create and write to a file
            FileWriter fw = new FileWriter(fileName, true);


            fw.write("Order items:\n " + scanner);


            System.out.println("Receipt successfully saved, have a nice day!");
            fw.close(); //closing the file writer

        } catch (IOException e) {
            System.out.println("Unable to save receipt!");
        }
    }
}
