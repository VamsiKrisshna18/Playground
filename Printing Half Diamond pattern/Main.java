#include <stdio.h>
int main() {
	int n, I, j, c;  
  scanf("%d", &n); 
  for (I = 1; I <= n; I++) {
    for (c = 1 ; c<= n-I; c++)  {
      printf(" ");
    }
     for (j = 1; j <= 2*I-1; j++) {
       printf("*");
     }
      printf("\n");
    }
  // Type your code here
	return 0;
}