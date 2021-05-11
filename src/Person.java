public class Person { // defines a custom type
   private String name; // this is a variable property

    public String getName(){ // this is a method function
//TODO: return the person's name
        return name;
    }

   public void setName (String name){
       // change the name property to the passed value
       this.name = name;
       System.out.println("Last name is: " + name);
   }

   public void sayHello(){
       // print a message to the console using the person's name
       System.out.println("Hello, " + name + ".");
   }

   public Person(String name){
        this.name = name;
   }
   public static void main(String[] args) {
       Person name = new Person("Karla"); //this references ln 2
       System.out.println(name.getName()); // calling ln 4 for retrieving created name on ln 25
       name.setName("Jara");
       name.sayHello();
   // 1. Understanding references: guessed the return to be two true statements
//       Person person1 = new Person("John");
//       Person person2 = new Person("John");
//       System.out.println(person1.getName().equals(person2.getName()));
//       System.out.println(person1 == person2); // this is calling the value

       // predict true
//       Person person1 = new Person("John");
//       Person person2 = person1;
//       System.out.println(person1 == person2);

       // predict John, John, Jane, John, Jane
       Person person1 = new Person("John");
       Person person2 = person1;
       System.out.println(person1.getName());
       System.out.println(person2.getName());
       person2.setName("Jane");
       System.out.println(person1.getName());
       System.out.println(person2.getName());
    }
}
