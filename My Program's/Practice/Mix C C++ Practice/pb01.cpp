#include <iostream>
using namespace std;
int main() {
    int t1=0, t2=1, summa=0;
    while((t1=(t2+=t1)-t1)<1000000)
        if (t1/2.0==t1/2)
            summa+=t1;
    std::cout<<summa;
    return 0;
    }
