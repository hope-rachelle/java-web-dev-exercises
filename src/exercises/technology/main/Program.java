package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(2019, "Apple", false, 50);
        Computer smartphone1 = new SmartPhone(2020, "Samsung", false, 75);
        System.out.println(((SmartPhone) smartphone1).needsUpdate());
        System.out.println(mySmartPhone.needsUpdate());
        System.out.println(mySmartPhone.needsCharging(15));
        mySmartPhone.takeSelfie(15);
        System.out.println(mySmartPhone.getNumberOfSelfies());
        System.out.println(mySmartPhone.getId());
        System.out.println(smartphone1.getId());

        Laptop myLaptop = new Laptop(2018, "HP", true, 6 );
        System.out.println(myLaptop.isClunky());
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(2018, "Apple", true);
        System.out.println(myComputer.getId());
        System.out.println(myComputer.needsCharging(75));
    }
}
