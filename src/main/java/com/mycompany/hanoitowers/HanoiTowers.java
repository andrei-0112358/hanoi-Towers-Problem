/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hanoitowers;

import java.util.Scanner;

public class HanoiTowers {

    // Counter for number of moves
    private static int moveCount = 0;

    // Recursive function to solve Hanoi Towers
    // n: number of disks
    // from: source rod
    // to: target rod
    // aux: auxiliary rod
    public static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            // Base case: only one disk, just move it
            System.out.println("Move disk 1 from " + from + " to " + to);
            moveCount++; // increment move counter
            return;
        }

        // Step 1: move n-1 disks from source to auxiliary rod
        solveHanoi(n - 1, from, aux, to);

        // Step 2: move the largest disk to target rod
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moveCount++; // increment move counter

        // Step 3: move n-1 disks from auxiliary rod to target rod
        solveHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Enter the number of disks (1-20 recommended): ");
            n = scanner.nextInt();
            if (n > 0) break;
            System.out.println("Please enter a positive number of disks.");
        }

        System.out.println("\nSteps to solve Hanoi Towers with " + n + " disks:");
        solveHanoi(n, 'A', 'C', 'B');

        System.out.println("\nTotal number of moves: " + moveCount);

        scanner.close();
    }
}