package com.collections;

import java.util.*;

class SortByRoll implements Comparator<UserSorting>{

    @Override
    public int compare(UserSorting o1, UserSorting o2) {
        return o1.rollNo-o2.rollNo;
    }
}

public class UserSorting{

    int rollNo;
    String name;
    String address;

    public UserSorting(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollNo+" "+this.name+" "+this.address;
    }

    public static void main(String[] args) {
        List<UserSorting> arrayList = new ArrayList<>();
        arrayList.add(new UserSorting(1, "Prachi", "Gopal Nagar"));
        arrayList.add(new UserSorting(5, "Parag", "Gopal Nagar"));
        arrayList.add(new UserSorting(3, "Priyanka", "Gopal Nagar"));
        arrayList.add(new UserSorting(2, "Manisha", "Gopal Nagar"));

        for(UserSorting obj: arrayList)
            System.out.println(obj);

        Collections.sort(arrayList, new SortByRoll());

        for (Iterator<UserSorting> it = arrayList.iterator(); it.hasNext(); ) {
            UserSorting obj = it.next();
            System.out.println(obj);
        }
    }
}
