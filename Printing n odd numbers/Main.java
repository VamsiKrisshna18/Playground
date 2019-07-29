#include <stdio.h>
int main() {
	//Type your code
  int i,n,count;
  scanf("%d",&n);
  n=n*2;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
       printf("%d\n",i);
    
  }
	return 0;
}