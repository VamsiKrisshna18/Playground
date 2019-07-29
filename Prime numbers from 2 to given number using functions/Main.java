#include<stdio.h>
int main(){
    int n,  I, count =0; 
    scanf("%d", &n); 
    for (I = 2; I <= n; I++) {
       count = prim(I);// Type your code here
      if (count ==2) {
        printf("%d", I); 
        
        printf("\n");
      }
       else {
         continue; 
       }
    }
    return 0;
}
int prim(int n) {
   int  j = 1, count = 0;
    while(j <= n) {
      if (n % j == 0) {
        count = count + 1;
      }
      j = j + 1;
    }
      return count; 
}