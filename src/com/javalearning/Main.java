package com.javalearning;

import java.util.*;
import java.io.*;

class Optable
{
    String name;
    String cls;
    int opcode;

    Optable(String n,String c,int o)
    {
        this.name = n;
        this.cls = c;
        this.opcode = o;
    }
}

class Register
{
    String regName;
    int number;
    Register(String rn, int n)
    {
        this.regName = rn;
        this.number = n;
    }
}
class Symbol
{
    String name;
    int addr;
    int len;
    Symbol(String n,int a,int l)
    {
        this.name = n;
        this.addr = a;
        this.len = l;
    }
}
class ConditionOperator
{
    String name;
    int no;
    ConditionOperator(String n, int num)
    {
        this.name = n;
        this.no = num;
    }
}

public class Main
{
    public static void main(String[] args) throws IOException
    {

        ArrayList<Optable> optab = new ArrayList<Optable>(25);	//List for the Mnemonic and the Opcode
        optab.add(new Optable("STOP","IS",0));
        optab.add(new Optable("ADD","IS",1));
        optab.add(new Optable("SUB","IS",2));
        optab.add(new Optable("MULT","IS",3));
        optab.add(new Optable("MOVER","IS",4));
        optab.add(new Optable("MOVEM","IS",5));
        optab.add(new Optable("COMP","IS",6));
        optab.add(new Optable("BC","IS",7));
        optab.add(new Optable("DIV","IS",8));
        optab.add(new Optable("READ","IS",9));
        optab.add(new Optable("PRINT","IS",10));
        optab.add(new Optable("DC","DL",1));
        optab.add(new Optable("DS","DL",2));
        optab.add(new Optable("START","AD",1));
        optab.add(new Optable("END","AD",2));
        optab.add(new Optable("ORIGIN","AD",3));
        optab.add(new Optable("EQU","AD",4));
        optab.add(new Optable("LTORG","AD",5));

        ArrayList<Register> reg = new ArrayList<Register>(5);	//List for the registers
        reg.add(new Register("AREG",1));
        reg.add(new Register("BREG",2));
        reg.add(new Register("CREG",3));
        reg.add(new Register("DREG",4));

        ArrayList<ConditionOperator> conditionTable = new ArrayList<ConditionOperator>(10);	//List for the Conditional Operators
        conditionTable.add(new ConditionOperator("LT",1));
        conditionTable.add(new ConditionOperator("LE",2));
        conditionTable.add(new ConditionOperator("EQ",3));
        conditionTable.add(new ConditionOperator("GT",4));
        conditionTable.add(new ConditionOperator("GE",5));
        conditionTable.add(new ConditionOperator("ANY",6));

        ArrayList<Symbol> symTab = new ArrayList<Symbol>(30);

        String line;

        try {
            FileReader fr = new FileReader("assembly.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("pass1_op.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
