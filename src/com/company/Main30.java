package com.company;

import javax.management.relation.RoleUnresolved;

public class Main30 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }
}
