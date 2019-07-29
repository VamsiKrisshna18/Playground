#include <stdio.h>
int main() {
	int n; 
  scanf("%d", &n) ;
  for(int I = 1; I <= n; I++) {
    printf("%d", I); 
    if(I % 3 == 0 && I!=n) {
      printf(",");
    }
  } //Type your code
	return 0;
}