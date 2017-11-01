package lambda;

public class Car {
    static public void main(String str[]) {
        System.out.println(" <--- Lamda Expression : single parameter  --->" );
        

        Car tayota = new Car();

        System.out.println("Add 4 STANDARD Wheels");
        tayota.addWheel( no -> System.out.println("---> Added " + no + " STANDARD Wheels. "), 4);
        
        System.out.println("Add 4 SPECIAL Wheels");
        Wheel specialWheel = number -> System.out.println("---> Added " + number + " SPECIAL Wheels");
        tayota.addWheel(specialWheel, 4);
        
    }

   public void addWheel(Wheel wheel, int noOfWheels) {
       wheel.addWheels(noOfWheels);
   }
}