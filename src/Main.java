import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //non primitive data types aka reference types
        //reference types always start with capital letter!
        String name = new String("testString");
        System.out.println(name.toUpperCase());

        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth());

        //difference between reference and simple types
        int a = 10;
        int b = a; //independent memory allocated variable copy of a
        a = 100;
        System.out.println("a " + a + " - b " + b);

        Person alex = new Person("Alex");
        Person twin = alex; //memory reference to object alex

        System.out.println("original alex name = " + alex.name);
        alex.name = "Alexander";
        System.out.println("twin name after name change = " + twin.name);
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

    }
}