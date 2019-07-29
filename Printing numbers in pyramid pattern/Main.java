#include <stdio.h>
int main() {
	int I, j, num = 1,c,n; 
    scanf("%d", &n); 
    for (I = 1;I <= n; I++ ) {
      for (c = 1;c<= n - I; c++) {
        printf(" ");
      }
      for (j = 1; j <= I; j++) {
        printf("%d ", num); 
        num = num + 1;
      }
      printf("\n");
    }// Type your code here
	return 0;
}