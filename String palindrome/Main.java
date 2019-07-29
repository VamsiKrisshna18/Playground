#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str1[20], str2[30];
  int n,j, I = 0;
  scanf("%s", str1); 
  n = strlen(str1);
  for (j = n - 1;j >=0;j--) {
    str2[I]  = str1[j];
    I = I + 1;
  }
  for (j = 0;j < n; j++) {
    if(str1[j]!= str2[j]) {
      printf("%s is not a palindrome ", str1);
      exit(0);
    }
    else {
      continue; 
    }
  }
  printf("%s is a palindrome ", str1);
  
  return 0;
}