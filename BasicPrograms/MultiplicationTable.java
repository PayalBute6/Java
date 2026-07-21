/* Program to Display Multiplication Table */

import java.io.*;
import java.lang.*;

class MultiplicationTable
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number: ");
        int num=Integer.parseInt(br.readLine());

        System.out.println("*****MULTIPLICATION TABLE*****");


            for(int j=1; j<=10; j++)
            {
                System.out.println(num+ "*" +j+ "="  +num*j );
            }
    }
}

/*
Output:
Enter Number:
6
*****MULTIPLICATION TABLE*****
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
6*10=60
*/