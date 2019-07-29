#include<stdio.h>
int main()
{
   int a[20],I, n, temp[20], j = 0,zeros = 0;
   scanf("%d", &n); 
   for (I = 0;I < n; I++) {
     scanf("%d", &a[I]);
   }
  //Type your code here
  for (I = 0;I < n; I++) {
    if(a[I] == 0) {
      zeros = zeros + 1;
    }
    else {
      temp[j]= a[I];
      j = j + 1;
    }
  }
  for (I = 0;I < j; I++) {
    printf("%d ", temp[I]);
  }
  for (I = 1;I <= zeros; I++) {
    printf("0 ");
  }
  return 0;
}