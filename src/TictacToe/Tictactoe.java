package TictacToe;


import java.util.Scanner;

public class Tictactoe {
    Player player1,player2;
    Board board;

    public static void main(String[] args) {
        Tictactoe ttt =new Tictactoe();
ttt.startgame();

    }
    public void startgame(){
        Scanner sc=new Scanner(System.in);
        player1=playerinput(1);
        player2=playerinput(2);
        while(player1.getsymbol()==player2.getsymbol()){
            System.out.println("The symbol has be already taken !!! Please re enter the symbol");
            player2.setsymbol(sc.next().charAt(0));
        }
        board=new Board(player1.getsymbol(),player2.getsymbol());
        boolean player1turn=true;
        int status=board.incomplete;

        while(status==board.incomplete ||status==board.invalid){
            if(player1turn){
                System.out.println("player 1s "+player1.getname()+" turn");
                System.out.print("Enter the coordinates ");
                int x=sc.nextInt();
                int y=sc.nextInt();
                status=board.move(player1.getsymbol(),x,y);
                if(status ==5){
                    System.out.println("Invalid move!!");
                }
                else
                    player1turn=false;
            }
            else{
                System.out.println("player 2s "+player2.getname()+" turn");
                System.out.print("Enter the coordinates ");
                int x=sc.nextInt();
                int y=sc.nextInt();
                 status=board.move(player2.getsymbol(),x,y);
                if(status ==5){
                    System.out.println("Invalid move!!");
                }
                else
                    player1turn=true;
            }
            board.print();
        }
        if(status==board.Player1){
            System.out.println("Player1 "+player1.getname()+" wins!!!!!");
            }
        else if(status==board.player2){
            System.out.println("Player2 "+player2.getname()+" wins!!!!!");
        }

    }
    Player playerinput(int num){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter player "+num+" name ");
        String name=sc.next();
        System.out.print("Enter player "+num+" symbol ");
        char symbol=sc.next().charAt(0);
        Player p=new Player(name,symbol);
        return p;
    }
}


