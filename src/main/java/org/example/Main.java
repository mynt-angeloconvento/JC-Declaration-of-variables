package org.example;

class Helper {
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    void printLocalVariables() {
        int localDecimal = 100;
        System.out.println("\t localDecimal = " + localDecimal);
        int localHex = 0xFF;
        System.out.println("\t localHex = " + localHex);
        int localBinary = 0b1101;
        System.out.println("\t localBinary = " + localBinary);
        int localOctal = 014;
        System.out.println("\t localOctal = " + localOctal);
        long localLong = 10000000L;
        System.out.println("\t localLong = " + localLong);
        String localString = "Every step I take gets me closer to my goal.";
        System.out.println("\t localString = " + localString);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Local Variables:");
        Helper helper = new Helper();
        helper.printLocalVariables();
        System.out.println();

        System.out.println("Instance Variables:");
        System.out.println("\t instanceBinary = " + helper.instanceBinary);
        System.out.println("\t instanceOctal = " + helper.instanceOctal);
        System.out.println("\t instanceDouble = " + helper.instanceDouble);
        System.out.println();

        System.out.println("Static Variables:");
        System.out.println("\t staticHex = " + staticHex);
        System.out.println("\t staticByte = " + staticByte);
        System.out.println("\t staticString = " + staticString);
    }

    static int staticHex = 0x1A2B;
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

}