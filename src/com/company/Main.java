package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


    boolean divided = true;
    int cap = 20, current = cap;

    while (divided) {
        for(int i = cap; i > 1; i--){
            if(current % i != 0){
                current = current + cap;
                divided = true;
                break;
            } else {
                divided = false;
            }
        }


    }

        System.out.println(current);





    }
}
