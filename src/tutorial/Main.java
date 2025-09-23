package tutorial;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // primitive datatype : not changable
//        int val= 5;
//        double num2=5.3;
//        System.out.println(val);
//        System.out.println(num2);
//        boolean b=true;
//        char c='5';
//        System.out.println(c);
//        System.out.println(b);
////        System.out.println(c==val);
//
//        // Non primitivable : changable
//        String str="324324fds";
//        int x=4;
//        int y=3;
//        int z=12;
//
//        double d=Math.pow(x,y)+z;
//        System.out.println(d);
//        System.out.println(str);


        // take input from user
//        Scanner sc=new Scanner(System.in); // scanned by scanner obj
//        String scanned=sc.next();
//
//        System.out.println(scanned);

        // to take a number input as int
//        Scanner sc2=new Scanner(System.in);
//        boolean scanned2=sc2.nextBoolean();
//
//        System.out.println(scanned2);
//
//        Scanner sc3=new Scanner(System.in);
//        double scanned3=sc3.nextDouble();
//
//        System.out.println(scanned3);
//

//        Scanner sc4=new Scanner(System.in);
//        String scanned4=sc4.next();
//
//        int x=Integer.parseInt(scanned4);
//        System.out.println(x);


        // comparision operators:

//        int x=6;
//        int y=7;
//        int z=10;
//
//        boolean compare=x!=y && x<y;
//        System.out.println(compare);


//        String x="hello";
//        String y="hellO";
//        boolean compare1 = x==y;
//        System.out.println(compare1);
//
//
//        System.out.println("what you want to type: ");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//
//        if(s.equals("tim")){
//            System.out.println("You typed tim");
//        }
//        else if(s.equals("hello")){
//            System.out.println("Hello!");
//        }
//        else{
//            System.out.println(s);
//        }
        main5(args);
    }
    public static  void main1(String[] args){
        System.out.println("Input your age: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int age=Integer.parseInt(s);

        if(age>=18) {
            System.out.println("What is your fav food");
            String food=sc.nextLine();

            if(food.equals("pizza")){
                System.out.println("You typed Pizza");
            }
            System.out.println("Yes, you are older than 18 and fav food is :" +food);
        }
        else if(age>=13){
            System.out.println("Yes, you are older than 13.");

        }else{
            System.out.println("No");
        }
    }

    public static void main3(String[] args) {
//        int[] newArr=new int[5]; // declaring an array

        System.out.println("Starting main3");
        String[] newArr2= new String[5];
        newArr2[0]="hello";
        newArr2[1]="world";
        newArr2[2]="pizza";
        newArr2[3]="haha";

        String x=newArr2[4];
        System.out.println(x);

        // Another way to store the values
        int[] nums={2,3,54,6,6};

        double[] nums2={2.0,3.0};

//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }

//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }


        int[] arr={1,5,6,3,2,6,8};
        String[] names=new String[5];

        int count=0;
        for(int element:arr){
            System.out.println(element+" "+count);
            count++; // count keeping track of indexes.
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<names.length;i++){
            System.out.print("Input : ");
           String input=sc.nextLine();
           names[i]=input;


        }

        for(String n:names){
            System.out.println(n);
            if(n.equals("tim")){
                break;
            }
        }
    }

    public  static void main4(String[] args){
        // while loop ; when we don't know how many times we are gonna loop through

        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number: ");
        int x=sc.nextInt();


        while(x!=10){
            System.out.println("Type 10 : ");
            System.out.println("Type a number :");
            x=sc.nextInt();

        }
    }

    public static void main5(String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("Type a number: ");
            x=sc.nextInt();
        } while(x!=10);
        System.out.println("You have type correctly");
    }

    public static void main6(String[] args){
        // Using Set and list;

        Set<Integer>t=new HashSet<Integer>();
        System.out.println();
    }

}
