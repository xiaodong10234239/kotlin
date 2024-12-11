#include <stdio.h>
__thread int tls_var = 0;

int main() {
    tls_var = 42;
    printf("TLS var value: %d\n", tls_var);
    return 0;
}
