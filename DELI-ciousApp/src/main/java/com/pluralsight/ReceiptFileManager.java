package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.SimpleFormatter;

public class ReceiptFileManager {
    //save order details in a receipts folder

    public ReceiptFileManager() throws IOException {

        try {
            // getting current date & time
            LocalDateTime now = LocalDateTime.now();

            // Formatting date and time for file name
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String formattedDate = now.format(formatter);

            //assign formatted date to file name
            String fileName = formattedDate + ".txt";

            // using a file writer to create and write to a file
            FileWriter fw = new FileWriter(fileName, true);


            fw.write(Order.orderScreen());

            System.out.println("Receipt successfully saved, have a nice day!");
            fw.close(); //closing the file writer

        } catch (IOException e) {
            System.out.println("Unable to save receipt!");
        }
    }
}
