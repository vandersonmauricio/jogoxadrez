package xadrezevida;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;

/**
 *
 * @author Vanderalves
 */
public class Piece {
    int xp;
    int yp;
    
    int x;
    int y;
    boolean isWhite;
    LinkedList<Piece> ps;
    String name;
    public Piece(int xp, int yp, boolean isWhite,String n, LinkedList<Piece> ps) {
        this.xp = xp;
        this.yp = yp;
        x=xp*64;
        y=yp*64;
        this.isWhite = isWhite;
        this.ps=ps;
        name=n;
        ps.add(this);
    }
    
    public void move(int xp,int yp){
        if(ChessGame.getPiece(xp*64, yp*64)!=null){
            if(ChessGame.getPiece(xp*64, yp*64).isWhite!=isWhite){
        ChessGame.getPiece(xp*64, yp*64).kill();
                
            }else{
                  x=this.xp*64;
        y=this.yp*64;
            return;
        }
        }
        this.xp=xp;
        this.yp=yp;
           x=xp*64;
        y=yp*64;
    }
    public void kill(){
        ps.remove(this);
    }
}
