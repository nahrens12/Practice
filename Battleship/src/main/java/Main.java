import java.util.Scanner;

public class Main {
    int [][] board;
    int [][] board2;
    public static void main(String[] args) {

    //Main m = new Main();

  //  m.makeBoard();



    }


    public void makeBoard() {
        System.out.println("X: Define the of the board(1-3)");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        System.out.println("Y: Define the of the board(1-3)");
        Scanner sc1 = new Scanner(System.in);
        int input2 = sc.nextInt();
         board = new int[input][input2];
         board2 = new int[input][input2];
        System.out.println("New board with 9 Spaces");
    }





}