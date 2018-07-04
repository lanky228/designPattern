package action.pattern.visitor;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

class Visitor {
    private Map<String, ServiceHandle> map = new HashMap<>();

    void doSomething(String url, Object... args) throws InvocationTargetException, IllegalAccessException {
        ServiceHandle serviceHandle = map.get(url);
        if (serviceHandle == null) {
            return;
        }
        serviceHandle.getMethord().invoke(serviceHandle.getService(), args);
    }

    void registe(String url, ServiceHandle serviceHandle){
        this.map.put(url, serviceHandle);
    }
}
