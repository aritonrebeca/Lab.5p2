public class AnimalExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);
        Cat myCat = new Cat("Whiskers", true, 2);

        System.out.println("Dog: " + myDog.getName() + ", Breed: " + myDog.getBreed() + ", Age: " + myDog.getAge());
        myDog.makeSound();

        System.out.println("Cat: " + myCat.getName() + ", Indoor: " + myCat.isIndoor() + ", Age: " + myCat.getAge());
        myCat.makeSound();
    }
}
