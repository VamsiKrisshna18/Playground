#include <stdio.h>
int main() {
	int r, c, n; 
  scanf("%d", &n); 
  for (r = 1; r <= n; r++) {
    for (c = 1;c <= n; c++){
      if (r == 1||c == 1|| r == n ||c == n) {
        printf("*");
      }
        else {
          printf(" ");
        }
    }
    printf ("\n");
  }
        // Type your code here
	return 0;
}