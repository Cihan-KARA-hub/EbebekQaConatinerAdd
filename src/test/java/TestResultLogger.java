import org.example.Log.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {
   Logger logger = new Logger();
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {



    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        String log =context.getDisplayName();
        logger.info(log+" passed");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        String log =context.getDisplayName();
        String erorInfo=cause.getMessage();
        logger.info(log+" failed  ,info: "+erorInfo);
    }
}
