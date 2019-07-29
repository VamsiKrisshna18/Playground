#include <stdio.h>
int main() {
	int a, b, c,d, e;  
    scanf("%d%d%d", &a, &b, &c); 
     //Type your code here
    d = gcd(a, b); 
    e = gcd(c, d);
    printf("%d", e); 
	return 0;
}
int gcd (int a, int b) {
  int min; 
  if (a> b) 
    min = a; 
  else
    min = b; 
  while(min >= 1)  {
    if (a%min == 0 && b%min == 0) 
      return min; 
     else {
       min = min - 1;
     }
  }
}