#include <stdio.h>
int main() {
	int num, count, I = 0,temp;
    scanf("%d", &num);
  temp = num; 
    while(num > 0){
      count = count + 1;
      num = num / 10;
    }
      if( count == 5) {
        while(I <3)
        {
           temp = temp / 10;
          I = I + 1;
        }
        temp = temp % 10;
        printf("%d", temp) ;
      }
  else
  {
    temp = temp % 10;
    printf("%d", temp);
  }
    //Type your code
	return 0;
}