import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] persons =  new Person[3];
        persons[0] = new Person("person1");
        persons[1] = new Person("person2");
        persons[2] = new Person("person3");

        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getName());
        }
        Person larry = new Person("Larry");
        addPerson(persons, larry);

        for(int i = 0; i < addPerson(persons, larry).length; i++){
            System.out.println(addPerson(persons, larry)[i].getName());
        }
    }
                            //array Arrays.copyOf(array, length)
    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPersons = Arrays.copyOf(people, people.length+1);
        newPersons[newPersons.length-1] = person;
        return newPersons;
    }
}
