import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String zipCode;
    private String disease;

    public Person(String name, int age, String zipCode, String disease) {
        this.name = name;
        this.age = age;
        this.zipCode = zipCode;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getDisease() {
        return disease;
    }

    public void setAgeGroup(String ageGroup) {
        System.out.println("Generalizing Age: " + this.age + " -> " + ageGroup);
        this.age = Integer.parseInt(ageGroup.split("-")[0]);
    }

    public void setZipCode(String generalizedZipCode) {
        System.out.println("Generalizing Zip Code: " + this.zipCode + " -> " + generalizedZipCode);
        this.zipCode = generalizedZipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zipCode='" + zipCode + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }
}

public class DatasetGeneralization {
    public static void main(String[] args) {
        
        List<Person> dataset = new ArrayList<>();
        dataset.add(new Person("PriyaDharshini", 28, "12345", "Flu"));
        dataset.add(new Person("Monika", 35, "12346", "Cold"));
        dataset.add(new Person("Aruna", 42, "12347", "Diabetes"));
        dataset.add(new Person("Sylvia", 55, "12348", "Hypertension"));
        dataset.add(new Person("Priyanka",33,"12349","BloodPressure"));
        dataset.add(new Person("Megalya",26,"12350","ViralInfection"));
       
        System.out.println("Original Dataset:");
        for (Person person : dataset) {
            System.out.println(person);
        }

       
        generalizeAge(dataset);

       
        generalizeZipCode(dataset);

       
        System.out.println("\nGeneralized Dataset:");
        for (Person person : dataset) {
            System.out.println(person);
        }
    }

   
    public static void generalizeAge(List<Person> dataset) {
        for (Person person : dataset) {
            int age = person.getAge();
            if (age >= 20 && age < 30) {
                person.setAgeGroup("20-30");
            } else if (age >= 30 && age < 40) {
                person.setAgeGroup("30-40");
            } else if (age >= 40 && age < 50) {
                person.setAgeGroup("40-50");
            } else if (age >= 50 && age < 60) {
                person.setAgeGroup("50-60");
            }
        }
    }

   
    public static void generalizeZipCode(List<Person> dataset) {
        for (Person person : dataset) {
            String zipCode = person.getZipCode();
            String generalizedZipCode = zipCode.substring(0, 3) + "**";
            person.setZipCode(generalizedZipCode);
        }
    }
}
