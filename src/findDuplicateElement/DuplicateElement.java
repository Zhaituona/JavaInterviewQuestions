package findDuplicateElement;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

        String name[]= {"java", "Selenium", "hello", "java", "Selenium"};
        // 1. use inner loop, use for loop
        for(int i= 0;i< name.length;i++ ){
            for(int j =i+1; j< name.length; j++){
                if(name[i].equals(name[j])){
                    System.out.println("The duplicate element is :" + name[i]);
                }
            }
        }
        System.out.println("***********************");
        // 2. use HashMap, HashMap only take the unique value
        Set<String>  store = new HashSet<String>();
        for(String names : name){
            if(store.add(names)== false){
                System.out.println("The duplicate element is : " + names);
            }
        }

    }
}
