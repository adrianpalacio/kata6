package org.example;

public class Name {
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String name;
    private int numericValue;

    public String getName() {
        return name;
    }
    public int getNumericValue() {
        return numericValue;
    }
    private Name(String input) {
        this.name = input;
        this.numericValue = calculateNumericValue(input);
    }
    public static Name makeName(String input) {
        if (isValidName(input)) return new Name(input); else return new Name("");
    }
    public static boolean isValidName(String input) {
        return input.matches("[a-zA-Z]+");
    }

    private int calculateNumericValue(String iname) {
        if (iname.isEmpty()) return -1; else {
            int returner = 0;
            String buffer = iname.toLowerCase();
            for(char i : buffer.toCharArray()) {
                returner += alphabet.indexOf(i) + 1;
            }
            int buffer2;
            while ((buffer2 = returner) > 9) {
                returner = 0;
                for (char i : String.valueOf(buffer2).toCharArray()) {
                    returner += Integer.parseInt(String.valueOf(i));
                }
            }
            return returner;

        }
    }

}
