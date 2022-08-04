public class MatrixTranspose1 {
 public static void main(String args[]){  

int original[][]={{1,2,3,4,5},{5,6,7,8,9},{0,2,4,6,8}};    
    
int transpose[][]=new int[5][5];  
    
for(int i=0;i<5;i++){    
for(int j=0;j<5;j++){    
transpose[i][j]=original[j][i];  
}    
}    
  
System.out.println(" Matrix without transpose:");  
for(int i=0;i<5;i++){    
for(int j=0;j<5;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();    
}    
System.out.println(" Matrix After Transpose:");  
for(int i=0;i<5;i++){    
for(int j=0;j<5;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();  
}    
}}  
