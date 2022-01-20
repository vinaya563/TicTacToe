package TictacToe;

public class Board {
    int boardsize=3;
    char board[][]=new char[boardsize][boardsize];
    char Empty=' ';
    char p1s,p2s;
    int c=0;
    static final int Player1=1;
    static final int player2 =2;
    static final int draw=3;
    static final int incomplete=4;
    static final int invalid=5;
    Board(char p1s, char p2s){
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                board[i][j]=Empty;

            }
            this.p1s=p1s;
            this.p2s=p2s;
        }
    }
    int move(char symbol,int x,int y){
        if(x<0||x>boardsize||y<0||y>boardsize||board[x][y]!=Empty){
return invalid;
        }
        board[x][y]=symbol;
        c++;
        if(board[x][0]==board[x][1]&&board[x][0]==board[x][2])
            return symbol==p1s ?Player1 :player2;
        if(board[0][y]==board[1][y]&&board[0][y]==board[2][y])
            return symbol==p1s?Player1:player2;
        if(board[0][0]==board[1][1]&&board[0][0]==board[2][2])
            return symbol==p1s?Player1:player2;
        if(c==boardsize*boardsize)
            return draw;
        return incomplete;
    }
    void print(){
        System.out.println("-----------------");
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                System.out.print("|"+board[i][j] +"|");
            }
            System.out.println();
        }
    }
}
