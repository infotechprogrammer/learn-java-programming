package com._02_control_statements;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Breaking at 4 but loop is till 10");
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\nContinuing at 4 but loop is till 10");
        for (int j = 0; j < 10; j++) {
            if (j== 4) {
                continue;
            }
            System.out.println(j);
        }
    }
}
