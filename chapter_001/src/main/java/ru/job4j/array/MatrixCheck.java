package ru.job4j.array;

/**
 * Класс проверяет выигрышная ли ситуация в игре Сокобан.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class MatrixCheck {
    /**
     * Метод проверяет полученный массив символов на соответствие выигрышной комбинации.
     * @param board массив комбинации.
     * @return комбинация выигрышная или нет.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                char xWin = 'X';
                if (sign == xWin && row == 0) {
                    int indexWin = 1;
                    for ( ; board[row + 1][cell] == xWin; row++) {
                        indexWin++;
                        if (indexWin == board.length) {
                            result = true;
                            break;
                        }
                    }
                } else if (sign == xWin && cell == 0) {
                    int indexWin = 1;
                    for ( ; board[row][cell + 1] == xWin; cell++) {
                        indexWin++;
                        if (indexWin == board.length) {
                            result = true;
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}