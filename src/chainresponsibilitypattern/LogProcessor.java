package chainresponsibilitypattern;

public abstract class LogProcessor {

    public static int INFO = 1 ;
    public static int DEBUG = 2;
    public static int ERROR = 3 ;

    LogProcessor nextLogProcessor ;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor ;
    }

    public void log(int level, String msg) {
        if (this.nextLogProcessor != null) {
            nextLogProcessor.log(level, msg) ;
        }
    }
}
