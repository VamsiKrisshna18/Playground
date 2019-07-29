#include<stdio.h>
int main() {
   int n, sq ;
   scanf("%d", &n);// Type your code here
   sq= square(n);
  printf("%d", sq); 
   return 0;
}
int square(int m){
  int a; 
  a = m * m;
  return a; 
}