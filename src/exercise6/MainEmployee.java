package exercise6;

public class MainEmployee {
    public static void main(String[] args) {
        Employee doctor = new Employee(new Treat(), new Car(), new PopularScienceLiterature(), "Doctor");
        Employee postman = new Employee(new DeliverLetters(), new Bicycle(), new Gym(), "postman");
        Employee seller = new Employee("seller");

        seller.setWorkBehaviour(new WorkBehaviour() {
            @Override
            public void work() {
                System.out.println("sell items");
            }
        });

        seller.setCommuteBehaviour(new CommuteBehaviour() {
            @Override
            public void commute() {
                System.out.println("commute with bus");
            }
        });

        seller.setSpendFreeTimeBehaviour(new Gym());

        doctor.performWork();
        doctor.performCommute();
        doctor.performSpendFreeTime();

        postman.performWork();
        postman.performCommute();
        postman.performSpendFreeTime();

        seller.performWork();
        seller.performCommute();
        seller.performSpendFreeTime();
    }
}
