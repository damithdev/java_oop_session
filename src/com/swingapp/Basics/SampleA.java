package com.swingapp.Basics;

public class SampleA {
    private int apple;
    public int banana;
    private static int mango;
    public static int orange;
    protected int lime;
    protected int avacado;
    public static final String sampleID = "8x2o3jxo823j";


    private void printValue(int value){
        System.out.println(value);
    }

    private int getValue(){
        apple = 10;
        return apple;
    }

    private void doIterativeTask(String type){
        switch (type){
            case "for":
                executeForLoop();
                break;
            case "while":
                executeWhileLoop();
                break;
            case "dowhile":
                executeDoWhileLoop();
                break;
            case "foreach":
                executeForeachLoop();
                break;
                default:
                System.out.println("Unknown Iterative Statement");
        }
    }

    private void executeForLoop(){

        //for loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    private void executeWhileLoop(){

        //while loop
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    private void executeDoWhileLoop(){

        //do-while loop
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }

    private void executeForeachLoop(){

        int[] marks = { 125, 132, 95, 116, 110 };
        for (int mark : marks)
        {
            if(mark > 75){
                System.out.println("Distinction");

            }else if(mark > 50){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }

    }


    private void multiDimentionalArray(){
        int[][] arr = new int[10][10];
        arr[0][0] = 1;
        arr[0][1] = 2;

        System.out.println("arr[0][0] = " + arr[0][0]);
    }

    private void StringsFunction(){
        String firstText = "The First String";
        String firstText2 = "The First String";
        String firstText3 = "the first string";
        String secondText = "The Second String";

        // ==
        if(firstText == firstText2) System.out.println("== true");

        if(firstText.equals(firstText2)) System.out.println("Equals true");
        if(firstText.equalsIgnoreCase(firstText2)) System.out.println("Equals Case In Sensitive");
    }
}
