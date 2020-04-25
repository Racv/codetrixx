package com.example.codetrixx.customlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ravi Singh
 * @created 24/04/2020 - 19:07
 * @project custom-logger
 */
public class CustomLogger {

    public static Logger getPrettyLogger() {
        return LoggerFactory.getLogger("prettyLogger");
    }

    public static Logger getSimpleLogger() {
        return LoggerFactory.getLogger("simpleLogger");
    }

    public static Logger getColorLogger() {
        return LoggerFactory.getLogger("colorLogger");
    }
}
