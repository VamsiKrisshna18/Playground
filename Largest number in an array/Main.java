#include<stdio.h>
int main()
{
   int a[20],I, n, large; 
  scanf("%d", &n); 
  for (I = 0;I < n;I++) {
    scanf("%d", &a[I]);
  }//fill the code
  for (I = 0;I < n; I++) {
    if (a[I] >a[I+1]) {
      large = a[I];
      a[I] = a[I+1];
      a[I+1] = large;
    }
  }
  printf("%d", large); 
  return 0;
}