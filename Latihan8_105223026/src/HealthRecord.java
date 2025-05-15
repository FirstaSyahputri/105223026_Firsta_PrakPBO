public class HealthRecord {
    private String recordDate;

    public HealthRecord(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void printRecord() {
        System.out.println("Tanggal Rekam Medis: " + recordDate);
    }
}
