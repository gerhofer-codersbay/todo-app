package com.codersbay.gerhofer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ToDo> myTodos = new ArrayList<>();
        ToDo dailyTodo = new ToDo("Good morning yoga");
        myTodos.add(dailyTodo);

        for (int i = 0; i < 3; i++) {
            System.out.println("Do you want to add a todo(1) or mark one as done(2)?");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            // clear buffer from nextInt
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("What needs to be done?");
                String description = scanner.nextLine();
                ToDo newTodo = new ToDo(description);
                myTodos.add(newTodo);
            } else if (choice == 2) {
                System.out.println(myTodos);
                System.out.println("Which todo is done? (start with 0)");
                int doneIndex = scanner.nextInt();
                scanner.nextLine();
                ToDo toDoThatIsDone = myTodos.get(doneIndex);
                toDoThatIsDone.markAsDone();
            }

        }
        System.out.println("");
    }

}
