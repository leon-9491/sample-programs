Task: 
Write a Java Program that scans an array from the user and find the Maximum 
and minimum Element of an Array using a For Loop 
Program: 
import java.util.Scanner; 
public class Minmax
{ 
 public static void main(String[]args) 
 { 
 Scanner sc=new Scanner(System.in); 
 int size; 
 System.out.println("Enter the size"); 
 size=sc.nextInt(); 
 int [] Arr=new int[size]; 
 for (int i=0;i<size;i++) 
 { 
 Arr[i]=sc.nextInt(); 
 } 
 int min= Arr[0]; 
 int max=Arr[0]; 
 for(int i=1;i<size;i++) 
 { 
 if (Arr[i]>max) 
 { 
 max=Arr[i]; 
 } 
 else 
 { 
 min= Arr[i]; 
 } 
 } 
 System.out.println("Maximum element:"+max); 
 System.out.println("Minimum element:"+min); 
 } 
} 