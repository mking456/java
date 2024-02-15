import java.io.FileReader;

public class OPPS {
  public static void main(String[] args) {
    // Pen p1 = new Pen();
    // p1.setColor("yellow");
    // System.out.println(p1.getColor());
    // p1.setTip(5);
    // System.out.println(p1.getTip());
    // p1.setColor("yellow");
    // System.out.println(p1.getColor());
    // Fish shark = new Fish();
    // shark.eats();
    // dog dobby = new dog();
    // dobby.color = "black";
    // dobby.legs = 4;
    // System.out.println(dobby);
    // System.out.println("color:" + dobby.color + " " + "legs:" + dobby.legs);
    // dobby.eats();

    // bird parrot = new bird();
    // System.out.println("parrot");
    // parrot.fly();
    // parrot.color = "green";
    // System.out.println(parrot.color);
    // parrot.breathe();
    // parrot.eats();
    // parrot.type = "love";
    // System.out.println(parrot.type);

    // human mayur = new human();
    // mayur.heights = 5;
    // System.out.println(mayur.heights);
    // cat deny = new cat();
    // deny.voice();

    // calculator calc = new calculator();
    // System.out.println(calc.sum(2, 7));
    // System.out.println(calc.sum((float) 5.0, (float) 7.1));
    // System.out.println(calc.sum(2, 4, 7));

    deer d1 = new deer();
    d1.eats();
  }
}

// function overding
class Animal {
  void eats() {
    System.out.println("eats anything");
  }
}

class deer extends Animal {
  void eats() {
    System.out.println("eats grass");
  }
}

// function overloading
class calculator {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}

// base class
// class Animal {
// String color;

// void eats() {
// System.err.println("eats");
// }

// void breathe() {
// System.out.println("breathe");
// }
// }
// class Animal {
// String color;

// void eats() {
// System.err.println("eats");
// }

// void breathe() {
// System.out.println("breathe");
// }
// }

// class fish extends Animal {
// String type;

// void swims() {
// System.out.println("swims");
// }
// }

// class bird extends Animal {
// String type;

// void fly() {
// System.out.println("flying");
// }
// }

// class mammal extends Animal {
// void walk() {
// System.out.println("walks");
// }
// }

// class dog extends mammal {
// int legs;
// }

// class cat extends mammal {

// void voice() {
// System.out.println("maaaaaauuuuuuuuu");
// }
// }

// class human extends mammal {
// int heights;
// }
// // // derived class
// // class mammal extends Animal {
// // int legs;
// // }
// // //derived class multi level inheritance
// // class dog extends mammal {
// // String breeds;
// // }
// // class Fish extends Animal {
// // int fins;

// // void swims() {
// // System.out.println("number of swims");
// //

// class Pen {
// // attributes
// private String color;
// private int tip;

// String getColor() {
// return this.color;
// }

// int getTip() {
// return this.tip;
// }

// // function
// void setColor(String newColor) {
// color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// }