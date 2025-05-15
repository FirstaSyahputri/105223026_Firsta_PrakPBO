public abstract class Animal {
    protected HealthRecord healthRecord;

    public Animal(String recordDate) {
        this.healthRecord = new HealthRecord(recordDate);
    }

    public abstract void makeSound();

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }
}
