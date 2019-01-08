#include <stdio.h>
#include <stdlib.h>

int* getMatchedIndex(char arrayLetter[], char plainTextExample[],int sizeArrayLetter, int sizePlainTextExample);
int* vigenereCipherEncryptIndex(int key[], int arrayMatchAtIndex[], int sizeKey, int sizeArrayLetter, int sizePlainTextExample);
char* convertToNewEncryptedArray(char arrayLetter[], int encryptArray[], int sizeArrayLetter, int sizePlainTextExample);

int main(void) {

	char arrayLetter[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
			               'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			               's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	int key[] = { 21, 4, 2, 19, 14, 17};

	char plainTextExample[] = { 'h', 'e', 'r', 'e',
			                    'i', 's',
								'h', 'o', 'w',
								'i', 't',
								'w', 'o', 'r', 'k', 's'};

	int sizeArrayLetter = sizeof(arrayLetter)/sizeof(arrayLetter[0]);
	int sizePlainTextExample = sizeof(plainTextExample)/sizeof(plainTextExample[0]);
	int sizeKey = sizeof(key)/sizeof(key[0]);

	int *arrayMatchAtIndex;
	int *encryptArray;
	char *cipherArray;

	arrayMatchAtIndex = getMatchedIndex(arrayLetter, plainTextExample, sizeArrayLetter, sizePlainTextExample);
	encryptArray = vigenereCipherEncryptIndex(key, arrayMatchAtIndex, sizeKey, sizeArrayLetter, sizePlainTextExample);

	char arrayLetter2[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
				               'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				               's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	cipherArray = convertToNewEncryptedArray(arrayLetter2, encryptArray, sizeArrayLetter, sizePlainTextExample);

	//	countNumberOfIndexMatches(arrayLetter, plainTextExample, sizeArrayLetter, sizePlainTextExample);

//	for(int i=0; i < sizePlainTextExample; i++)
//	{
////		printf("%c%s", cipherArray[i], " ");
//		printf("%c", cipherArray[i]);
//
//	}
//
	for (char i=0; i<sizeArrayLetter; i++) {
	    putchar(arrayLetter[i]);
	}
	putchar('\n');

//
//	for(char i=0; i < sizeArrayLetter; i++)
//	{
//		//printf("%s%i%s", "Indexes of Encryption: ", encryptArray[i], " \n");
//		printf("%c", arrayLetter[i]);
//	}


	free(arrayMatchAtIndex);
	free(encryptArray);
	free(cipherArray);

	return EXIT_SUCCESS;
}

//compare arrays and count matches of arrays
void countNumberOfIndexMatches(char arrayLetter[], char plainTextExample[],int sizeArrayLetter, int sizePlainTextExample)
{
	int countMatches = 0;

	//loop arrayLetter
	for(int i=0; i < sizeArrayLetter; i++)
	{
		//loop plainTextExample
		for(int j=0; j < sizePlainTextExample; j++)
		{
			//compare -> match then count
			if(arrayLetter[i] == plainTextExample[j])
			{
				countMatches++;
			}
		}

	}

	printf("%i", countMatches);
}

//compare arrays and store index into array
int *getMatchedIndex(char arrayLetter[], char plainTextExample[],int sizeArrayLetter, int sizePlainTextExample)
{

	int* arrayMatchAtIndex = malloc(sizePlainTextExample* sizeof(int));

	//loop plainTextExample
	for(int i=0; i < sizePlainTextExample ; i++)
	{
		//loop arrayLetter
		for(int j=0; j < sizeArrayLetter ; j++)
		{
			//compare -> match then store arrayLetter index into arrayMatchAtIndex
			if(plainTextExample[i] == arrayLetter[j])
			{
				arrayMatchAtIndex[i] = j;
			}
		}

	}

	return arrayMatchAtIndex;
}

//encrypt array by adding 'key' indexes into array
int* vigenereCipherEncryptIndex(int key[], int arrayMatchAtIndex[], int sizeKey, int sizeArrayLetter, int sizePlainTextExample)
{
	//make new array
	int* encryptArray = malloc(sizePlainTextExample* sizeof(int));

	int j=0;

	//encrypt element -> (add elements of arrayIndexes and key) mod 26
	for(int i=0; i < sizePlainTextExample; i++)
	{

		if(i >= sizeKey)
		{
			j = (i % sizeKey);
			key[i] = key[j];
			printf("%d%s",i, " ");
		}

		encryptArray[i] = (arrayMatchAtIndex[i]+key[i]) % 26;
	//	printf("%s%d%s%d%s", "Match Element: ", arrayMatchAtIndex[i], " key ", key[i], " ");
	//	printf("%s%d%s", "encryptElement: ", encryptArray[i], " \n");
	}



	//convert index to letter

	return encryptArray;
}

//convert encrypt array index to its elements
char* convertToNewEncryptedArray(char arrayLetter[], int encryptArray[], int sizeArrayLetter, int sizePlainTextExample)
{
	char* cipherArray = malloc(sizePlainTextExample* sizeof(int));

	//encrypted index - > convert elements to new index
	for(int i=0; i < sizePlainTextExample ; i++)
	{

		for(int j=0; j< sizeArrayLetter; j++)
		{

			//find index->match then put Encrypted index into letter element
			if(encryptArray[i] == j)
			{
				cipherArray[i] = arrayLetter[j];
			}

		}
	}

	return cipherArray;
}
