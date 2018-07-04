package struct.pattern.template;

class TemplateTarget extends Template {
    @Override
    void doSomething1() {
        super.doSomething1();
        System.out.println("doSomething1");
    }

    @Override
    void doSomething2() {
        super.doSomething2();
        System.out.println("doSomething2");
    }
}
