package game;

import java.util.*;

public class Player {
    private String name;
    private String symbol;

    public Player() {
        this.setName();
        this.setSymbol();
    }

    public String getName() {
        return this.name;
    }

    private void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name:");
        String name = sc.next();
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Please enter your Name: ");
        }
    }

    public String getSymbol() {
        return this.symbol;
    }

    private void setSymbol() {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.name + "'s Symbol");
        String symbol = sc.next();
        if (!symbol.isEmpty()) {
            this.symbol = symbol;
        } else {
            System.out.println("please enter your Symbol");
            setSymbol();
        }
    }
}
