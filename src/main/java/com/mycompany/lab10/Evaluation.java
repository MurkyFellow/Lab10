package com.mycompany.lab10;

/**
 *
 * @author 000728303
 */
public class Evaluation {

    private String [] equation;
    private int[] numbers;
    private String[] signs;

    public Evaluation(String input) {
        equation = input.split(" ");
        int position=0,Npostion=0,Sposition=0;
        numbers = new int[equation.length/2 + 1];
        signs = new String[equation.length/2];
        for (String equation1 : equation) {
            if (position <= equation.length / 2) {
                numbers[Npostion] = Integer.parseInt(equation1);
                Npostion++;
            } else {
                signs[Sposition] = equation1;
                Sposition++;
            }
            position++;
        }
    }
    
    public double Solve(){
        int position = 1;
        double total = numbers[0];
        for (String sign : signs){
            switch(sign){
                case "+":
                    total = total + numbers[position];
                    break;
                case "-":
                    total = total - numbers[position];
                    break;
                case "*":
                    total = total * numbers[position];
                    break;
                case "/":
                    total = total / numbers[position];
                    break;
                default:
                    throw new StackException("This is not a valid input!");
            }
            position++;
        }
        return total;
    }
}
