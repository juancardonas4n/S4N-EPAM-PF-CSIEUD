#include <stdio.h>
#include <stdlib.h>

int getNxtValue();

int
main(int argc, char *argv[]) {

  printf("Number: %d\n", getNxtValue());
  printf("Number: %d\n", getNxtValue());
  printf("Number: %d\n", getNxtValue());

  return EXIT_SUCCESS;
}

int
getNxtValue() {
  static int value = 0;

  return value++;
}
