/*
 *
 * Classname : Java Development (K)
 *
 *  23 June 2020
 *
 * Created by Selebynka Yurii (UzhNU)
 * Copyright by Selebynka Yurii© (UzhNU)
 *
 * Multi-threading VERSION 001-24.JUNE.2020
 *
 * 1. Use the file from the previous task  - logs.txt.
 * 2. Create a class that manages logs in this file.
 * 3. Create a method that finds all the ERROR logs
 *    for a specific date and write them into a
 *    specific file (name = ERROR  + Date  + .log).
 * 4. In your main class develop a functionality
 *    to create  5 such a files for 5 different days.
 *    Launch them in consistent way (one after another).
 * 5. Repeat the above  task in parallel way. Multi-threading.
 * 6. Compare the results.
 *
 * */

package com.company;

    /*
     * @param enum Log  - class that represents a group of
     *                    needed constants.
     *
     * @return - constants ERROR, WARNING, INFO.
     */

public enum Log {
    ERROR, WARNING, INFO
}
