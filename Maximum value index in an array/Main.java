// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a[20], max, n, I,index; 
  scanf("%d", &n); 
  for (I = 0;I < n; I++) {
    scanf("%d", &a[I]);
  }// Type your code here 
  max = a[0];
  for (I = 0;I < n; I++) {
    if (max < a[I]) {
      index = I;
    }
  }
  printf("%d", index); 
  
   return 0;
}