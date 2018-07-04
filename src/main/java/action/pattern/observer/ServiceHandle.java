package action.pattern.observer;

import java.lang.reflect.Method;

public class ServiceHandle {
    private Object service;
    private Class<?> clazz;
    private Method methord;

    ServiceHandle(Object service, Class<?> clazz, Method methord) {
        this.service = service;
        this.clazz = clazz;
        this.methord = methord;
    }

    Object getService() {
        return service;
    }

    public void setService(Object service) {
        this.service = service;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    Method getMethord() {
        return methord;
    }

    public void setMethord(Method methord) {
        this.methord = methord;
    }
}
