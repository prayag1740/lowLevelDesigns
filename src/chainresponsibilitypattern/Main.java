package chainresponsibilitypattern;

public class Main {

    public static void main(String[] args) {

        LogProcessor logger = new InfoLogProcessor( new DebugLogProcessor( new ErrorLogProcessor(null)));

        logger.log(LogProcessor.DEBUG, "This is a debug msg") ;
        logger.log(LogProcessor.ERROR, "This is a error msg") ;
        logger.log(LogProcessor.INFO, "This is an info msg");

    }
}
