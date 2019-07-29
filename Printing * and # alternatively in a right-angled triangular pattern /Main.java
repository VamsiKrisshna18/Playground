#include <stdio.h>
int main(){
	int n, r, c, turn =0;
    scanf("%d", &n);
    for (r= 1;r<=n; r++) {
      for(c=1;c<=r; c++) {
        if(turn == 0) {
          printf("*");
         turn = 1;
        }
        
        
          else {
            printf("#");
           turn = 0;
          }
      }
      printf("\n");
    }// Type your code here
  	return 0;
}