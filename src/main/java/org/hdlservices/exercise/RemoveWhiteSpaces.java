package org.hdlservices.exercise;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to be cleaned from white spaces...!");
        String inputString = sc.nextLine();
        System.out.println("Input String : " + inputString);

        // Remove spaces Built-in method
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String Without Spaces Built-in: " + stringWithoutSpaces);

        // Remove spaces custom
        char[] charArray = inputString.toCharArray();
        StringBuffer stringBufferWithoutSpaces = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringBufferWithoutSpaces.append(charArray[i]);
            }
        }
        System.out.println("Input String Without Spaces custom: "+stringBufferWithoutSpaces.toString());

        sc.close();
    }
}
