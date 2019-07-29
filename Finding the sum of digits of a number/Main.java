#include <stdio.h>
int main() {
	long int num, r, sum = 0;
   scanf("%d", &num); 
  while(num > 0)
    {
      r = num % 10;
      sum = sum + r; 
      num = num / 10;
  }
    printf("%d", sum);
  //Type your code
	return 0;
}