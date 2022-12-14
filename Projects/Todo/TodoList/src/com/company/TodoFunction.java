package com.company;

import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> todoList = new ArrayList<String>();

    //Add a list item
    public void addItem(String item) {
        todoList.add(item);
    }

    //remove list item

    public void removeItem(int index) {
        String myItem = todoList.get(index);
        todoList.remove(index);

    }

    //Print the Entire List
    public void printTodoList() {
        System.out.println("Todo List Consistes of: " + todoList.size() + "items");
        for (int i =0 ; i<= todoList.size(); i++) {
            System.out.println("Item at Position" + (i + 1) + todoList.get(i));
        }
    }

    // update the List
    public  void updateTodo (int index, String list) {
        todoList.set(index,list);
        System.out.println("Updation completed at position" + index + 1);
    }

    //Search Feature for user
    public String findItem ( String searchItem) {
        int index =todoList.indexOf(searchItem);
        if (index == -1) {
            return  null;
        }else  {
            return todoList.get(index);
        }
    }

}
