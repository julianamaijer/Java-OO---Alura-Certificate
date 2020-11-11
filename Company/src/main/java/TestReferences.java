public class TestReferences {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Marcos");
        manager.setSalary(5000.0);

        VideoMaker videoMaker = new VideoMaker();
        videoMaker.setSalary(2500.0);

        Designer designer = new Designer();
        designer.setSalary(2000.0);

        ControlBonus controlBonus = new ControlBonus();
        controlBonus.register(manager);
        controlBonus.register(videoMaker);
        controlBonus.register(designer);

        System.out.println(controlBonus.getTotal());
    }
}
