package com.company;

import java.io.*;
import java.util.*;


class Matrix1
{
    private int[][] A=new int[10][10];
    private int r;
    private int c;


    public Matrix1()
    {


    }

    public Matrix1(int r,int c)
    {
        this();
        this.r=r;
        this.c=c;
    }
    public void setElement(int ro,int co,int val)
    {

        if(ro<=this.r&&co<this.c&&val>0)
        {
            this.A[ro][co]=val;
        }
        else
        {
            this.A[ro][co]=0;
        }
    }
    public void show()
    {int i,j;
        for(i=0;i<this.r;i++)
        {System.out.print("\n");
            for(j=0;j<this.c;j++)
            {
                System.out.print(this.A[i][j]+"  ");
            }
        }
    }
    public void matrixtranspose()
    {
        int i,j;
        int[][] B=new int[10][10];

        for(i=0;i<this.r;i++)
        {for(j=0;j<this.c;j++)
        {
            B[i][j]=A[j][i];
        }
        }
        System.out.print("\nTransposed Matrix is");
        for(i=0;i<this.r;i++)
        {System.out.print("\n");
            for(j=0;j<this.c;j++)
            {
                System.out.print(B[i][j]+"  ");
            }
        }

    }


    public static void main(String args[])
    {

        Scanner S=new Scanner(System.in);
        System.out.println("Enter row limit column limit,ro,co and val");
        int r=S.nextInt();
        int c=S.nextInt();
        int ro=S.nextInt();
        int co=S.nextInt();
        int val=S.nextInt();
        Matrix1 M=new Matrix1(r,c);
        M.setElement(ro,co,val);
        M.show();
        M.matrixtranspose();

    }



}







