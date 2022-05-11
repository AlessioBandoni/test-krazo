package it.test.eventlog;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("")
public class EventLog extends Application {

    @Override
    public Map<String, Object> getProperties() {
        final Map<String, Object> props = new HashMap<>();

        props.put("org.eclipse.krazo.defaultViewFileExtension", "jsp");
        props.put("org.eclipse.krazo.redirectScopeCookies", true);

        return props;
    }

}