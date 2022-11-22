package im.wangbo.java.issues.micronaut;

import io.micronaut.context.ApplicationContext;

/**
 * TODO add description here.
 *
 * @author Elvis Wang
 * @since 1.0.0
 */
public class MainApp {
    public static void main(String[] args) {
        try (final ApplicationContext context = ApplicationContext.run("test")) {
            System.out.println(context.getProperty("gateway.transport-manager.pools.default.thread-count", Integer.class));
        }
    }
}
