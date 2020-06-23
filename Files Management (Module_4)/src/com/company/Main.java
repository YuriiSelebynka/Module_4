/*
*
* Classname : Java Development (K)
*
*  23 June 2020
*
* Created by Selebynka Yurii (UzhNU)
* Copyright by Selebynka Yurii© (UzhNU)
*
* FilesManagement VERSION 001-24.JUNE.2020
*
* 1. Parse the file logs.txt (see the attachment).
*    Extract to a separate file all the logs.
* 2. Calculate the total number of logs (lines).
* 3. Calculate the total  number of  ERROR logs.
*    Use previous skills - String.split.
* 4. Calculate the total number of ERROR logs. Use Files.lines.
* 5. Compare two results.
*
*/

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        //------------ 1. Parse the file logs.txt ---------------------------\\

        /*
         * @param LocalDateTime start - an immutable date-time object.
         *
         * @return - indicates the starting time of operation.
         */

        LocalDateTime start = LocalDateTime.now();

        /*
         * @param text - parse a txt-format file from computer.
         *
         * @return - usable text for program.
         */

        String myString = new String(Files.readAllBytes(Paths
                .get("C:/Users/Home/Desktop/logs.txt")));

        //------------ 2. Calculate the total number of logs (lines). -------\\

        /*
         * @param String[] lines - splits text into needed draft.
         *
         * @return - length of lines.
         */

        String[] lines = myString.split("\\n");

        System.out.println(lines.length);

         //----------- 3. Calculate the total  number of  ERROR logs. ------\\
        //------------ Use previous skills - String.split. ------------------\\

        /*
         * @param errorLinesCount - counting of lines, included word "ERROR".
         *
         * @return - number of lines with word "ERROR".
         */

        int errorLinesCount = 0;

        for (int i = 0; i < lines.length ; i++) {

            if (lines[i].contains("ERROR")){
                errorLinesCount++;
            }
        }
        System.out.println(errorLinesCount);

        /*
         * @param LocalDateTime finish - an immutable date-time object.
         *
         * @return - indicates the finishing time of operation.
         */

        LocalDateTime finish = LocalDateTime.now();

        /*
         * @param time1 - used to calculate time, spent for this operation.
         *
         * @return - indicates the finishing time of operation.
         */

        int time1 = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " ms");

         //----------- 4. Calculate the total number of ERROR logs. --------\\
        //------------ Use Files.lines. -------------------------------------\\

        /*
         * @param start - an immutable date-time object.
         *
         * @return - indicates the starting time of operation.
         */

        start = LocalDateTime.now();

        /*
         * @param error - counting of lines, what include word "ERROR".
         *
         * @return - number of lines with word "ERROR".
         */

        final long errors = Files.lines(Paths
                .get("C:/Users/Home/Desktop/logs.txt"))
                .filter(line -> line.contains("ERROR"))
                .count();

        System.out.println(errors);

        /*
         * @param finish - an immutable date-time object.
         *
         * @return - indicates the finishing time of operation.
         */

        finish = LocalDateTime.now();

        /*
         * @param time2 - used to calculate time, spent for this operation.
         *
         * @return - indicates the finishing time of operation.
         */

        int time2 = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println(ChronoUnit.MILLIS.between(start, finish) + " ms");

        //------------ 5. Compare two results. ------------------------------\\

        /*
         * @param if - used to compare times, spent for methods String.split
         *             and Files.lines.
         *
         * @return - what method is faster.
         */

        if (time1 > time2) {
            System.out.println("Method Files.lines is quicker!");
        } else {
            System.out.println("Method Files.lines is slower!");
        }
    }
}