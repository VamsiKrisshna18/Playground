#include<stdio.h>
#include<math.h>
int main(){
    int  base, expintent; 
    scanf("%d%d", &base, &expintent);
    power(base, expintent);// Type your code here
  	return 0;
}
void power(int a, int b) {
  int c; 
  c = pow(a,b);
  printf("%d", c);
}