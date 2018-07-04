package action.pattern.observer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

class ObserverTarget {
    private Map<String, ServiceHandle> map = new HashMap<>();
    void doSomgthing() throws InvocationTargetException, IllegalAccessException {
        ServiceHandle serviceHandle = map.get("doSomething");
        if(serviceHandle == null){
            return;
        }
        serviceHandle.getMethord().invoke(serviceHandle.getService());
    }

    void registe(String url, ServiceHandle serviceHandle){
        map.put(url, serviceHandle);
    }
}
