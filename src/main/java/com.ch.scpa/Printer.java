package com.ch.scpa;

import com.ch.scpa.utils.DrawAlphabets;

import java.util.Scanner;

public class Printer {
    public void printer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input");
        String input = sc.nextLine();
        validateInput(sc,input);
    }

    private void validateInput(Scanner sc,String input){
        String[] inputs=input.split("\\s+");
        if(inputs.length!=2){
            input = sc.nextLine();
            System.out.println("User Input is incorrect.Please enter again");
            validateInput(sc,input);
        }
        if(!validateAlphabet(inputs[0])){
            input = sc.nextLine();
            System.out.println("User Input is incorrect.Please enter again");
            validateInput(sc,input);
        }
        int size=Integer.parseInt(inputs[1]);
        if(size<3 || size>21||size % 2 == 0){
            input = sc.nextLine();
            System.out.println("User Input is incorrect.Please enter again");
            validateInput(sc,input);
        }
        drawAlphabet(inputs[0],size);
    }

    private boolean validateAlphabet(String alphabet){
        return alphabet.equalsIgnoreCase("A")||
                alphabet.equalsIgnoreCase("U")||
                alphabet.equalsIgnoreCase("X")||
                alphabet.equalsIgnoreCase("Y")||
                alphabet.equalsIgnoreCase("Z");
    }

    private void drawAlphabet(String alphabet,int height){
        switch (alphabet){
            case "A":
                DrawAlphabets.drawA(height);
                break;
            case "U":
                DrawAlphabets.drawU(height);
                break;
            case "X":
                DrawAlphabets.drawX(height);
                break;
            case "Y":
                DrawAlphabets.drawY(height);
                break;
            case "Z":
                DrawAlphabets.drawZ(height);
                break;
        }
    }
}
