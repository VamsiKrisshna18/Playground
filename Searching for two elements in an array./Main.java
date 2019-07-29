#include<stdio.h>
int main()
{
  int a[20], n, I, s1, s2, count1, count2; 
  scanf("%d", &n);
  for (I = 0;I <n; I++){
    scanf("%d", &a[I]);
  }
  scanf("%d", &s1); 
  scanf("%d", &s2);
  for (I = 0;I < n; I++){
    if (a[I] == s1)  {
      count1 = I; 
    }
    else if(a[I] == s2) {
      count2 = I; 
    }
  }
  printf("%d\n", count1); 
  if(count2 < 2000) {
    printf ("%d\n", count2);
  }
   else
     printf("-1");//Type your code here
  return 0;
}