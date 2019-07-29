#include<stdio.h>
int main()
{
  //Type your code here
  int I, j, K, n, a[20];
  scanf("%d", &n);
  for (I = 0;I < n; I++) {
    scanf("%d", &a[I]);
  }
  for (I = 0;I <= n - 2;I++) {
    for (j = I + 1;j <=  n - 1;j++) {
      for (K = j + 1; K <= n - 1; K ++) {
        printf("(%d, %d, %d) ",a[I],a[j],a[K]);
      }
    }
    printf("\n");
  }
  return 0;
}