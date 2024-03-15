package exercise6;

public class Employee {
    WorkBehaviour workBehaviour;
    CommuteBehaviour commuteBehaviour;
    SpendFreeTimeBehaviour spendFreeTimeBehaviour;
    String profession;

    public Employee(String profession) {
        this.profession = profession;
    }

    public Employee(WorkBehaviour workBehaviour, CommuteBehaviour commuteBehaviour, SpendFreeTimeBehaviour spendFreeTimeBehaviour, String profession) {
        this.workBehaviour = workBehaviour;
        this.commuteBehaviour = commuteBehaviour;
        this.spendFreeTimeBehaviour = spendFreeTimeBehaviour;
        this.profession = profession;
    }

    public void setWorkBehaviour(WorkBehaviour workBehaviour) {
        this.workBehaviour = workBehaviour;
    }

    public void setCommuteBehaviour(CommuteBehaviour commuteBehaviour) {
        this.commuteBehaviour = commuteBehaviour;
    }

    public void setSpendFreeTimeBehaviour(SpendFreeTimeBehaviour spendFreeTimeBehaviour) {
        this.spendFreeTimeBehaviour = spendFreeTimeBehaviour;
    }

    public void performWork() {
        workBehaviour.work();
    }

    public void performCommute() {
        commuteBehaviour.commute();
    }

    public void performSpendFreeTime() {
        spendFreeTimeBehaviour.spendFreeTime();
    }
}
