package com.pluralsight.helix.order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ReceiptWriter {
    public static void receipt(Order order){

        try {
            String newFile = generateTimestamp();

            FileWriter recWriter = new FileWriter(newFile);

            BufferedWriter bufferedWriter = new BufferedWriter(recWriter);
            bufferedWriter.write(order.getOrderSummary());
            bufferedWriter.close();

        }catch (Exception e){
            System.out.println("An error occurred");
        }

    }
    private static String generateTimestamp() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String newFile = now.format(formatter) + ".txt";

        return newFile;
    }
}
