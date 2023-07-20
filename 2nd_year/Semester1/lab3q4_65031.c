#include <stdio.h>
int main(void) {

        int a;
        int b = 0, c = 1;
        printf("enter a number : ");
        scanf("%d", &a);
        b = a;
        while(a>0){
                printf("enter a number : ");
                scanf("%d", &a);
                if(a>0){
                        b = b + a;
                        c++;
                }
        }

        printf("summation = %d\n", b);
        printf("avg = %d\n", b/c);

        return 0;
}