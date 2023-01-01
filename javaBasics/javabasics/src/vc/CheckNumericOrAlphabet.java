package vc;

public class CheckNumericOrAlphabet {
    public static void main(String[] args) {
        // Check whether the given string contains only numeric
        System.out.println("123".matches("[0-9]+"));
        System.out.println("456".chars().allMatch(Character::isDigit));
        // Check whether the given string contains only alphabet
        System.out.println("abc".matches("[a-zA-Z]+"));
        System.out.println("DEF".chars().allMatch(Character::isAlphabetic));
    }
}
