#include <stdio.h>
int main() {
	int r, c, n, temp = 1;
    scanf("%d", &n); 
    for (r = 1;r <= n; r++) {
      if (temp == 1) {
          for ( c = 1; c <= n - 1; c++) {
            printf("%d", r);
          }
        printf("%d", r + 1); 
        temp = 0;
      }
      else {
        printf("%d", r + 1);
        for (c = 1; c <= n - 1; c++) {
          printf("%d", r); 
        }
        temp = 1;
      }
      printf("\n");
    }
        // Type your code here
	return 0;
}