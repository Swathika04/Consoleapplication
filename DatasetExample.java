import java.util.ArrayList;
import java.util.List;

public class DatasetExample {
    
    public static class Record {
        private String name;
        private int age;
        private String zipCode;
        private String disease;

 
        public Record(String name, int age, String zipCode, String disease) {
            this.name = name;
            this.age = age;
            this.zipCode = zipCode;
            this.disease = disease;
        }

 
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        public String getZipCode() { return zipCode; }
        public void setZipCode(String zipCode) { this.zipCode = zipCode; }
        public String getDisease() { return disease; }
        public void setDisease(String disease) { this.disease = disease; }

        @Override
        public String toString() {
            return "Record{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", zipCode='" + zipCode + '\'' +
                   ", disease='" + disease + '\'' +
                   '}';
        }
    }

    public static void main(String[] args) {
 
        List<Record> records = new ArrayList<>();

        
        records.add(new Record("Janani", 28, "12345", "Flu"));
        records.add(new Record("Madhuligha", 35, "12346", "Cold"));
        records.add(new Record("Aishu", 42, "12347", "Diabetes"));
        records.add(new Record("Lidiya", 55, "12348", "Hypertension"));
        records.add(new Record("Vashni",22,"12349","Bloodpressure"));

        
        System.out.println("Original Records:");
        for (Record record : records) {
            System.out.println(record);
        }

        
        applySuppression(records);

   
        System.out.println("\nSuppressed Records:");
        for (Record record : records) {
            System.out.println(record);
        }
    }

    public static void applySuppression(List<Record> records) {
        for (Record record : records) {
            record.setName("NULL");
            record.setDisease("DISEASE");
        }
    }
}
