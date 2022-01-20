package TictacToe;

public class Player {
    String name;
    char symbol;


    public  Player(String name,char symbol){
        setname(name);
        setsymbol(symbol);
    }
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
    void setsymbol(char symbol){
        if(symbol!='\0')
            this.symbol=symbol;
    }
    char getsymbol(){
        return symbol;
    }
}

