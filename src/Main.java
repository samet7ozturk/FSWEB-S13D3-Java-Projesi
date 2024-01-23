public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Alice", "Smith", 17);
        Person person3 = new Person("Male", "123 Main St", true);

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + ", Age: " + person2.getAge());
        System.out.println("Person 3: Gender: " + person3.getGender() + ", Address: " + person3.getAddress() + ", Is Working: " + person3.isWorking());

        System.out.println("Is Person 1 a teen? " + person1.isTeen());
        System.out.println("Is Person 2 a teen? " + person2.isTeen());


        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}