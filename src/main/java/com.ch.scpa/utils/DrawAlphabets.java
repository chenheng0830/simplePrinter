package com.ch.scpa.utils;

import static com.ch.scpa.utils.Constants.STAR;

public class DrawAlphabets {
    private DrawAlphabets() {
    }

    private static int calculateWidth(int height) {
        return (2 * height) - 1;
    }

    public static void drawA(int height) {
        int width = calculateWidth(height);
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == n || j == (width - n)
                        || (i == height / 2 && j > n
                        && j < (width - n)))
                    System.out.printf(STAR);
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }

    public static void drawU(int height) {
        int i, j;
        for (i = 0; i < height; i++) {
            if (i != 0 && i != height - 1)
                System.out.printf(STAR);
            else
                System.out.printf(" ");
            for (j = 0; j < height; j++) {
                if (((i == height - 1)
                        && j >= 0
                        && j < height - 1))
                    System.out.printf(STAR);
                else if (j == height - 1 && i != 0
                        && i != height - 1)
                    System.out.printf(STAR);
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    public static void drawX(int height) {
        int i, j, counter = 0;
        for (i = 0; i <= height; i++)
        {
            for (j = 0; j <= height; j++)
            {
                if (j == counter
                        || j == height - counter)
                    System.out.printf(STAR);
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
    }

    public static void drawY(int height) {
        int i, j, counter = 0;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j <= height; j++)
            {
                if (j == counter
                        || j == height - counter
                        && i <= height / 2)
                    System.out.printf(STAR);
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            if (i < height / 2)
                counter++;
        }
    }

    public static void drawZ(int height) {
        int i, j, counter = height - 1;
        for (i = 0; i < height; i++)
        {
            for (j = 0; j < height; j++)
            {
                if (i == 0 || i == height - 1
                        || j == counter)
                    System.out.printf(STAR);
                else
                    System.out.printf(" ");
            }
            counter--;
            System.out.printf("\n");
        }
    }
}
