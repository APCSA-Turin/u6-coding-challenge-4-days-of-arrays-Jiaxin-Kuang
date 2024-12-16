
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){
        String[][] niceOrNaughty = new String[2][names.length];
        int nice = 0, naughty = 0;
        for(int i = 0; i < names.length; i ++){
            if(Math.random() < 0.5){
                niceOrNaughty[0][nice] = names[i];
                nice ++;
            }
            else{
                niceOrNaughty[1][naughty] = names[i];
                naughty ++;
            }
        }   
        return niceOrNaughty;
    }

    public static void main(String[] args) {

    }
}