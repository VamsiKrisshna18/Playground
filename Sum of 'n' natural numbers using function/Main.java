#include<stdio.h>
int main() {
   int n,  S; 
    scanf("%d", &n);
     // Type your code here
    S = sum(n);
    printf("%d", S); 
  	return 0;
}
int sum(int m) {
  int sum = 0, I;
  for (I = 1;I <= m; I ++) {
    sum = sum + I; 
  }
  return sum; 
}