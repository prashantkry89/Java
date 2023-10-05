
// 🍁 Array

import java.util.Arrays;

public class A2Array{
    public static void main(String[] args){
        int [] marks={50,40,80,4};  // declaring array directly 
        int arr[]=new int[10];  // fixing size of array & by default all 10 value 
                                // will be initialized as 0 

        //! length 
        System.out.println(marks.length);

        //! sort 
        System.out.println("Before Sorting -> "+marks[2]);
        Arrays.sort(marks);
        System.out.println("After Sorting -> "+marks[2]);

        /*
        ! 2-D array || Multi-Dimensional array
            an array inside an array
            int array[][] ={{55,45,69,20},{58,45,96,75,0}}
            int array[2][4] -> it means an outer array has 2 array's element which have 4 
                elements in it.
        */
        int [][] finalMarks={{55,45,69,20},{58,45,96,75,0}};
        System.out.println("Element in array -> "+finalMarks[0][1]);
        System.out.println("Element in nested array -> "+finalMarks[1][2]);

        // ! creating 2-D array using random no of math 
        int[][] array=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                array[i][j]=(int)(Math.random()*10);
            }
        }
        
        // printing 2-D array value using loop
        System.out.println("printing 2-D array value using loop");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // ! Jagged array -> when inner array size is not know or different in 
            // different array then individually we had to assign size to array 
        int JaggedArray[][]=new int[3][];
        JaggedArray[0]=new int[3];
        JaggedArray[1]=new int[4];
        JaggedArray[2]=new int[2];
        for(int i=0;i<JaggedArray.length;i++){
            for(int j=0;j<JaggedArray[i].length;j++){
                JaggedArray[i][j]=(int)(Math.random()*10);
            }
        }

        System.out.println("printing 2-D JaggedArray value using loop");
        for(int x[]:JaggedArray){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}



// import java.util.*;
// class Sum{
// public static void main(String args[]){
//     Scanner input=new Scanner(System.in);
//     int n=input.nextInt();
//     int [] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=input.nextInt();
//     }
//     int s=0;
//     for(int x:arr){
//         s+=x;
//     }
//     System.out.println(s);
// }
// }


// ! Array input in 1-D 2-D array 
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 	    int x=sc.nextInt();
// 	    int y=sc.nextInt();
// 	    int arr[][]=new int[x][y];
// 		for(int i=0;i<x;i++){
// 		    for(int j=0;j<y;j++){
// 		        arr[i][j]=sc.nextInt();
// 		    }
// 		}
// 		for(int[] a:arr){
//     		for(int z:a){
//     		    System.out.print(z+" ");
//     		}
//     		System.out.println();
// 		}
// 	}
// }