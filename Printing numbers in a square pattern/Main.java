#include <stdio.h>
int main(){
	int n, r, c; 
      scanf("%d", &n);
      for (r = 1;r<=n; r++) {
        for(c =1; c <=n; c++) {
          printf("%d",r); 
        }
        printf("\n");
      }
// Type your code here
  	return 0;
}