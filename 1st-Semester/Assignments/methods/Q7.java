public class Q7{
    public static void main(String args[]){
        String str = "gift university";

        System.out.println(str.length());   // return length of string
        System.out.println(str.equals(""));  // return boolean value true if both strings are equals otherwise false
        System.out.println(str.compareTo("gift university, gujranwala")); // The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
        System.out.println(str.toLowerCase());  // return lowercase string
        System.out.println(str.toUpperCase());  // return uppercase string
        System.out.println(str.startsWith(" gift")); // checks whether the string starts with specified character
        System.out.println("test".isEmpty());  // return boolean value true if string is empty otherwise false
        System.out.println(str.charAt(0)); // return character at given index
        System.out.println(Math.cbrt(27)); // return cube root of number
        System.out.println(Math.abs(-34));  // return positive number
    }
}