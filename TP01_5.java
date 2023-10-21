
public class TP01_5 {
    public static void main(String[] args){
        // A. Write a program using a String function to print/check the length of a text “I Love My Hometown”:
        String text = "I Love my Home country";
        int lengthText = text.length();
        System.out.println("***Answer A: ");
        System.out.println("The length is: " + lengthText);

        //B. Write a program using a String function to cut the word “my little country” from a text of “I love my little country”:
        String cutText = text.substring(7, 22);
        System.out.println("***Answer B: ");
        System.out.println("Cut Text: "+cutText);

        //C. Write a program using a String function to find the index position of vowels in a text of “Hi Students!”:
        String textNumberC ="Hi Students";
        System.out.println("***Answer C: ");
        String vowel = "aeiouAEIOU";
        System.out.println(textNumberC);
        for(int i = 0; i<textNumberC.length(); i++){
            char ch = textNumberC.charAt(i);
            if(vowel.indexOf(ch) != -1){
                System.out.println("\"" + ch + "\" is at index: " + i);
            }
        }

        //D. Write a program using a String function check if two texts are equal
        String text1 = "Hi Students!";
        String text2 = "Students";
        String text3 = "Hi Students!";
        boolean isEqual1and2 = text1.equals(text2);
        boolean isEqual1and3 = text1.equals(text3);
        System.out.println("***Answer D: ");
        System.out.println("Text1 is equal to Text2: " + isEqual1and2);
        System.out.println("Text1 is equal to Text3: " + isEqual1and3);
        
        //E. Write a program using a String function check if a text contains in another text
        String text4 = "Hi Students!";
        String text5 = "Students";
        String text6 = "Hello";

        boolean containsText2 = text4.contains(text5);
        boolean containsText3 = text4.contains(text6);
        System.out.println("***Answer E: ");
        System.out.println("Text4 contains Text5: " + containsText2);
        System.out.println("Text4 contains Text6: " + containsText3);
    }
}
