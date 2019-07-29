#include <stdio.h>
int main() {
    int n, I, j, num;
  scanf("%d", &n);
  for (I = 1; I <= n; I++) {
    num = n -I +1;
    for (j = 1; j <= n -I+1; j++) {
      printf("%d", num); 
      num = num - 1;
    }
    printf("\n");
  }// Type your code here
	return 0;
}