package com.company;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static FileHandler fileTextHandler;
    private static SimpleFormatter fileFormatter;

    void SetupLogger() throws IOException {
        /*Logger logger = Logger.getLogger(""); //get the logger
        Handler[] handlers = logger.getHandlers(); //get the log handlers
        if (handlers[0] instanceof ConsoleHandler) //check if the log handler is console handler
        {
            logger.removeHandler(handlers[0]); //remove the console handler
        }

        fileTextHandler = new FileHandler("log");
        fileFormatter = new SimpleFormatter();
        fileTextHandler.setFormatter(fileFormatter);
        LOGGER.addHandler(fileTextHandler);*/
    }
}
