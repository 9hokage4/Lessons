package test;

import java.util.ArrayList;

public class Main{
public static void main(String[] args) {

 ArrayList<Integer> index = new ArrayList<>();
 for (int i = 0; i <= 5; i++){
    index.add(i);
 }

 ArrayList<String> name = new ArrayList<>();
 name.add("Jonh");
 name.add("Emma");
 name.add("Lois");
 name.add("Nick");
 name.add("Martin");

 ArrayList<String> result = new ArrayList<>();

 for (int i = 0; i < name.size(); i++){
    String s = index.get(i) + " - " + name.get(i);
    result.add(s);
 }

 for (String string : result) System.out.println(string);

}

  

private static ArrayList<String> getEmployees(){
ArrayList<String> employees = new ArrayList<>();
employees.add("John");
employees.add("Olivia");
employees.add("Emma");
employees.add("Max");
employees.add("Nick");
return employees;
}

}