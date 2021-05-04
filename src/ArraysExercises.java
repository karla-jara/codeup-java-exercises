import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        String [] person = {"person1", "person2", "person3"};
            // both code top and bottom create and set array index
        String [] person =  new String[3];
        person[0] = "person1";
        person[1] = "person2";
        person[2] = "person3";

        for(String eachPeep : person){
            System.out.println("eachPeep = " + eachPeep);
        }
//        addPerson("person4")

    }

//    private static void addPerson(String person4) {
//    }

    public static void addPerson(String [] person){
        String [] newPersonList = Arrays.copyOf(person, 4);

        System.out.println(Arrays.toString(newPersonList));
//        return null;
    }

}
