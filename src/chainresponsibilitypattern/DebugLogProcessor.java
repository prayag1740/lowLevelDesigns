package chainresponsibilitypattern;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int level, String msg) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + msg);
        }
        else {
            super.log(level, msg);
        }
    }
}
