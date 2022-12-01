package myapp;

public class Todo {
    
    public static void main(String[] args) {

        // Create an array of 3 string elements
        String[] tasks = new String[3];

        tasks[0] = "runnning";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        /*System.out.println(tasks);
        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        System.out.println(tasks.length);*/

        // Use a while loop to print all the elements in an array
        Integer index = 0;
        while (index < tasks.length) {
            System.out.printf("%d: %s\n", index, tasks[index]);
        }
    }
}