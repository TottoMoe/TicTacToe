package com.Lab3TicTacToe;
import java.util.Scanner;
public class TicTacToe {

    final int SIZE = 3;
    final char EMPTY = ' ';
    private char[][] board;
    private char player; // 'X' or 'O'
    private int playerTurn = 0;

        /*
         * Instantiate board to be a 3 by 3 char array of spaces.
         * Set player to be 'X'.
         */
    public TicTacToe() {
            /*
             * Step 1: create an empty board, with an initial value
             * of a space (' ')
             */
            board = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = EMPTY;
                }
            }
    }

        /*
         * If s represents a valid move, add the current player's symbol to the board and return true.
         * Otherwise return false.
         */
        public boolean play (String s){
            /* Step 2: Fill in here with your own
             * play logic, and replace the return with you
             * own.
             */
            char symbol = ' ';
            if (player == 'X') {
                symbol = 'X';
            } else if (player == 'O') {
                symbol = 'O';
            }
            if (s.equals("A1") && board[0][0] == EMPTY) {
                board[0][0] = symbol;
                return true;
            } else if (s.equals("A2") && board[0][1] == EMPTY) {
                board[0][1] = symbol;
                return true;
            } else if (s.equals("A3") && board[0][2] == EMPTY) {
                board[0][2] = symbol;
                return true;
            } else if (s.equals("B1") && board[1][0] == EMPTY) {
                board[1][0] = symbol;
                return true;
            } else if (s.equals("B2") && board[1][1] == EMPTY) {
                board[1][1] = symbol;
                return true;
            } else if (s.equals("B3") && board[1][2] == EMPTY) {
                board[1][2] = symbol;
                return true;
            } else if (s.equals("C1") && board[2][0] == EMPTY) {
                board[2][0] = symbol;
                return true;
            } else if (s.equals("C2") && board[2][1] == EMPTY) {
                board[2][1] = symbol;
                return true;
            } else if (s.equals("C3") && board[2][2] == EMPTY) {
                board[2][2] = symbol;
                return true;
            }
            return false;
        }

        /*
         * Switches the current player from X to O, or O to X.
         */
        public void switchTurn () {
            // Step 3: Fill in with your code to toggle between
            // 'X' and 'O'
            if (playerTurn == 0) {
                playerTurn = 1;
            } else if (playerTurn == 1) {
                playerTurn = 0;
            }
        }

        /*
         * Returns true if the current player has won the game.
         * Three in a row, column or either diagonal.
         * Otherwise, return false.
         */
        public boolean won () {
            /* Step 5: Fill in the code for the won method. This method
             * should return true if the current player has 3 in-a-row, column or diagonal. Otherwise, return false.
             */
            //Horizontal Wins
            if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                player ='X';
                return true;
            } else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                player = 'O';
                return true;
            } else if(board[1][0] == 'X'  && board[1][1] == 'X'  && board[1][2] == 'X' ) {
                player = 'X';
                return true;
            } else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                player = 'O';
                return true;
            } else if(board[2][0] == 'X'  && board[2][1] == 'X'  && board[2][2] == 'X' ) {
                player = 'X' ;
                return true;
            } else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
                player = 'O';
                return true;
            }
            //Vertical Wins
            if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
                player = 'X';
                return true;
            } else if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
                player = 'O';
                return true;
            } else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
                player = 'X';
                return true;
            } else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
                player = 'O';
                return true;
            } else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
                player = 'X';
                return true;
            } else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
                player = 'O';
                return true;
            }
            //Diagonal Wins
            if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                player = 'X';
                return true;
            } else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                player = 'O';
                return true;
            } else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                player = 'X';
                return true;
            } else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                player = 'O';
                return true;
            }
            return false;
        }

        /*
         * Returns true if there are no places left to move
         */
        public boolean stalemate() {
            /*
             * Step 4: Fill in the code for the stalemate method. It
             * should return true if there are no more places to move
             * on the board. Otherwise, return false.
             */
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[0].length; col++) {
                    if (board[row][col] == EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

    public char getPlayer () {
        if (playerTurn == 0) {
            player = 'X';
        } else if (playerTurn == 1) {
            player = 'O';
        }
        return player;
    }

    public void print () {
        System.out.println();
        System.out.println("\t  1 2 3");
        System.out.println();
        System.out.println("\tA " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("\t  -----");
        System.out.println("\tB " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("\t  " + "-----");
        System.out.println("\tC " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println();
    }

        /*
         * Step 6: Main Method for Final Step - Delete your main method
         * and uncomment this one.
         * Runs the game by getting input from the user, making the
         * appropriate moves, and prints who won or if it was a stalemate.
         */
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        System.out.println("Welcome to tic-tac-toe");
        System.out.println("Enter coordinates for your move following the X and O prompts");

        while (!game.stalemate()) {
            //Print the game
            game.print();

            //Prompt player for their move
            System.out.print(game.getPlayer() + ": ");

            //Loop while the method play does not return true when given their move.
            //Body of loop should ask for a different move
            while (!game.play(in.next())) {
                System.out.println("Illegal move. Enter your move.");
                System.out.print(game.getPlayer() + ": ");
            }
            //If the game is won, call break;
            if (game.won())
                break;

            //Switch the turn
            game.switchTurn();

        }
        game.print();
        if (game.won()) {
            System.out.println("Player " + game.getPlayer() + " Wins!!!!");
        } else {
            System.out.println("Stalemate");
        }
    }
}