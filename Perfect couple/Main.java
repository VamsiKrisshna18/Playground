#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int a[], int n, int sum)
{
  // Type your code here
  int j, K;
  for (j = 0; j < n - 1; j++) {
    for (K =  j + 1;K < n; K++) {
      if (sum == a[j] + a[K]) {
          printf("Perfect couple: %d %d", a[j], a[K]);
          exit(0);
      }
    else 
      continue; 
  }
  }
  printf("No perfect couple found!");
    
}