package org.example;

public class Tester {
    public static int test() {
        int score = 6;
        score -= test01_numbers();
        score -= test02_nothing();
        score -= test03_symbols();
        score -= test04_bea();
        score -= test05_melissa();
        score -= test06_zzzzzzz();
        System.out.println("Failure rate: " + score*100/6 + "%");
        if (score == 0) System.out.println("Congratulations!"); else System.out.println("Please try again");
        return score;
    }

    private static int test01_numbers() {
        Name name01_1 = Name.makeName("1231");
        if (name01_1.getNumericValue() == -1) return 1;
        System.out.println("Test 01 failed");
        return 0;
    }

    private static int test02_nothing() {
        Name name02_1 = Name.makeName("");
        if (name02_1.getNumericValue() == -1) return 1;
        System.out.println("Test 02 failed");
        return 0;
    }

    private static int test03_symbols() {
        Name name03_1 = Name.makeName("HºLA Ñ@Mç");
        if (name03_1.getNumericValue() == -1) return 1;
        System.out.println("Test 03 failed");
        return 0;
    }

    private static int test04_bea() {
        Name name04_1 = Name.makeName("bea");
        Name name04_2 = Name.makeName("Bea");
        Name name04_3 = Name.makeName("bEA");
        if (name04_1.getNumericValue() == 8 && name04_2.getNumericValue() == 8 && name04_3.getNumericValue() == 8) return 1;
        System.out.println("Test 04 failed");
        return 0;
    }

    private static int test05_melissa() {
        Name name05_1 = Name.makeName("melissa");
        Name name05_2 = Name.makeName("melissa");
        Name name05_3 = Name.makeName("MelIsSA");
        if (name05_1.getNumericValue() == 6 && name05_2.getNumericValue() == 6 && name05_3.getNumericValue() == 6) return 1;
        System.out.println("Test 05 failed");
        return 0;
    }

    private static int test06_zzzzzzz() {
        Name name06_1 = Name.makeName("zzzzzzz");
        if (name06_1.getNumericValue() == 2) return 1;
        System.out.println("Test 06 failed");
        return 0;
    }
}
