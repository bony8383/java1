package variable.muslim;

public class Variables {
    public static void main (String [] args) {
        String name = "Muslim Said";
        int age = 28;
        double height = 1.70;
        float weight = 65.5f;
        double salary = 1500.50;
        boolean isMarried = true;
        boolean isTeacher = true;
        boolean isStudent = false;
        long population = 1000000L;
        // population of a city he lives in
        short year =  1997;
        byte level = 1;
        char gender = 'M';

        //Non-primitive types
        String company = ("Elmus");
        int[] numbers = {1, 2, 3,};
        String[] branches = {"IT group.kg", "Edume.kg", "Marketing.kg", };




        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Salary:" + salary);
        System.out.println("Married:" + isMarried);
        System.out.println("Teacher:" + isTeacher);
        System.out.println("Student:" + isStudent);
        System.out.println("Population:" + population);
        System.out.println("Year:" + year);
        System.out.println("Level" + level);
        System.out.println("Gender:" + gender);

        System.out.println(" --- Non-primitive types ---");
        System.out.println("Company:" + company);
        System.out.println("Numbers:");
        for ( int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        System.out.println("Branches:");
        for (String branch : branches) {
            System.out.println(branch + " ");
        }
        System.out.println();


    }

}
