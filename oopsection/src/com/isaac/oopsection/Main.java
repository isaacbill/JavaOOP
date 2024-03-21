package com.isaac.oopsection;

public class Main {
    public static void main(String[] args) {
   // Phone iPhone= new Phone("iphone 11",8 ,6,4);
   // System.out.println(iPhone.getName());

   // iPhone.playMusic("Dancing in the moonlight");
   // iPhone.playMusic("arms around you");

   // Phone huawei= new Phone("huawei",6);
     //   System.out.println(huawei.getMemoryRam());
     //   Bird phoenix = new Bird("Bill","orange",2,true,2);
     //   System.out.println(phoenix.getName());

     //  phoenix.eat("ugali");
      //  phoenix.fly();

       // Dog tobby = new Dog("jlingz","Blue",4,false);
      //  System.out.println(tobby.getColor());

      //  tobby.eat("meat");

    Car mercedes = new Car("Mercedes AMG",4,"Black",new Engine("Renault",800));
            Engine engine = mercedes.getEngine();

        System.out.println(mercedes.getName());
        System.out.println("Engine Model "+ mercedes.getEngine().getModel());
    }
}
