Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Sanjatha1999 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


yashaswinisarabu
/
yashaswinisarabuweek6
1
0
0
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
yashaswinisarabuweek6/week6.1
@yashaswinisarabu
yashaswinisarabu Create week6.1
Latest commit 0fc4512 on 8 Mar
 History
 1 contributor
79 lines (65 sloc)  1.98 KB
  
package collections;

import java.util.Arrays;
import java.util.ArrayList;

public class CustomArrayLists {

     Object[] myStore;
     int actSize = 0;
     
    public CustomArrayLists(){
        myStore = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
     
    public static void main(String a[]){
        CustomArrayLists mal = new CustomArrayLists();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        mal.add(new Integer(78));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}

 

© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
