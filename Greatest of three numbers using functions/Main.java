#include <stdio.h>
int main(){
	int a, b, c,  d, e; 
     scanf("%d%d%d", &a, &b, &c); 
    d =  great(a,b); 
     e = great(d,c);
    printf("%d", e); // Type your code here
  	return 0;
}
int great(int a, int b) {
  if (a > b ) {
    return a; 
  }
  else {
    return b; 
  }
  
  
}