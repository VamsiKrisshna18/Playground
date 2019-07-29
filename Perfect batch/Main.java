/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int a[20], n, I,sum1 = 0, sum2 = 0; 
   scanf("%d", &n); 
  for (I = 0;I < n; I++) {
    scanf("%d", &a[I]);
  }
  //Type your code here
  for (I = 0;I < 3;I++) {
    sum1 =sum1 + a[I];
  }
  for (I = 3;I < n; I++) {
    sum2 = sum2 + a[I];
  }
  if (sum1 == sum2) 
    printf("Perfect Batch"); 
  else
    printf("Not a Perfect Batch");
  return 0;
}