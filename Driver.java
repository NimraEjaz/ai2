/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimra Ejaz
 */
import java.util.*;
import java.util.Queue; 
public class Driver {
    public static void main(String[] args) {
  /* int l, m, n;
   Scanner in = new Scanner(System.in);
   l=in.nextInt();
   m=in.nextInt();
   n=in.nextInt();
   String[] states=new String[l];
   System.out.println("enter states");
   for(int i=0;i<l;i++)
   {
       states[i] = in. next();
   }
   for(int i=0;i<l;i++)
   {
       System.out. println(states[i]);
   }
   System.out.println("enter actions");
   String[] actions=new String[m];
   for(int i=0;i<m;i++)
   {
       actions[i] = in. next();
   }
   for(int i=0;i<m;i++)
   {
       System.out. println(actions[i]);
   }
   System.out.println("enter results");
   int[][] results=new int[l][m];
   for(int i=0;i<l;i++)
   {
       for(int j=0;j<m;j++)
       {
           results[i][j]=in.nextInt();
       }
   }
   for(int i=0;i<l;i++)
   {
       for(int j=0;j<m;j++)
       {
           System.out. println(results[i][j]);
       }
   }
   System.out.println("enter inputs");
   String[] inputs=new String[n];
   for(int i=0;i<n;i++)
   {
       inputs[i] = in. next();
   }
   for(int i=0;i<n;i++)
   {
       System.out. println(inputs[i]);
   }
   Node n2=new Node();
   for(int i=0;i<n;i++)
   {
       String res=n2.f1(l, m, n, actions,states,inputs[i], results);
       if(res==null)
    {
        System.out.println("no path exits");
        return;
    }
    
   StringBuilder input1 = new StringBuilder(); 
        input1.append(res); 
        input1 = input1.reverse(); 
        System.out.println(input1); 
   }*/
   int l=8,m=3,n=3;     
   String[] s1={"1,d,d","1,d,c","1,c,d","1,c,c","2,d,d","2,d,c","2,c,d","2,c,c"};
   String[] s = { "c","1","2" };
    int[][] arr = {
    {2, 0, 4},
    {3, 1, 5},
    {2, 2, 6},
    {3, 3, 7},
    {5, 0, 4},
    {5, 1, 5},
    {7, 2, 6},
    {7, 3, 7} };
    String[] s2 = {"1,d,c   2,c,c"};
    Node n2=new Node();
    String res=n2.f1(l, m, n, s, s1, s2[0], arr);
    if(res==null)
    {
        System.out.println("no path exits");
        return;
    }
        System.out.println(res); 
    
    }
}
/*#include<stdio.h>
#include<conio.h>
#include<iostream>
#include<queue>
using namespace std;

int main()
{
	queue<string> q;
	for (int i = 0; i < l; i++)
	{
		int j = 0;
		
		
	}
	
	
}*/

   