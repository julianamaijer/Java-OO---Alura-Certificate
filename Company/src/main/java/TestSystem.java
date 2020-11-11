public class TestSystem {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setPassword(2222);

        Officer officer = new Officer();
        officer.setPassword(2222);

        InternalSystem internalSystem = new InternalSystem();
        internalSystem.enable(manager);
        internalSystem.enable(officer);
    }
}
