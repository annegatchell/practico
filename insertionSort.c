/*
Anne Gatchell
29 October 2012

Integer insertion sort implemented in C for practice

*/

#include <stdlib.h>
#include <stdio.h>

void swap(int*a, int*b){
	int tmp;
	tmp = *b;
	*b = *a;
	*a = tmp;
}

void insertionSort(int* s, int n){
	int i, j;

	for(i = 0; i < n; i++){
		j = i;
		while((j>0) && (s[j] < s[j-1])){
			printf("%d, %d\n", s[j], s[j-1]);
			swap(&s[j], &s[j-1]);
			j = j-1;
		}
	}
	return;
}

int main(int argc, char*argv[]){
	int a[] = {3,1,3,2,8,4,6,9};
	//printf("%ld\n", sizeof(a)/sizeof(int));
	insertionSort(a, sizeof(a)/sizeof(int));
	int i;
	for (i=0; i < sizeof(a)/sizeof(int); i++){
		printf("%d\n", a[i]);
	}
	return 1;
}