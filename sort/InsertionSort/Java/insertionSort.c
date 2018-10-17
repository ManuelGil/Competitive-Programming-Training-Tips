#include<stdio.h>

void insertionSort(int arr[],int length){

	for (int i = 0; i < length; i++) {

            int key = arr[i];

            int j = i;

            while (j > 0 && arr[j - 1] > key) {

                arr[j] = arr[j - 1];

                j = j - 1;

                arr[j] = key;

            }

        }

}

void main(){
	int array[]={34,121,54,76,78,37,10};
	int length = (int)( sizeof(array) / sizeof(array[0]) );
	insertionSort(array ,length );
	int i=0;
	for(i=0;i<length;i++)
		printf("%d  ",array[i]);
	
	
}