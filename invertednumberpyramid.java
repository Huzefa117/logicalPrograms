class HelloWorld {
       public static void main(String[] args) {
    int row = 6, col = 10, k=5;
    int[][] arr = new int[row][col];
    for(int j=0; j<row; j++){
        int l = k;
        int space = l-5;
     for(int i = 0; i<=col; i++){
         while(space<0){
             System.out.print(" ");
             space++;
         }
         if(Math.abs(l) > k){continue;}
        System.out.print(Math.abs(l));
        l--;
     }
     System.out.println();
     k=k-1;
}
}
}




Output:
54321012345
 432101234
  3210123
   21012
    101
     0
