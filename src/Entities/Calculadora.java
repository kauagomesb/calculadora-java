package Entities;

public class Calculadora {
    Operacao op = new Operacao();

    public double somar(double primNum, double segNum){
        return primNum + segNum;
    }

    public double subtrair(double primNum, double segNum){
        return primNum - segNum;
    }

    public double mult(double primNum, double segNum){
        return primNum * segNum;
    }

    public double div(double primNum, double segNum){
        return primNum / segNum;
    }

}

