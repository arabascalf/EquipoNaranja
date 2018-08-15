#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a,b,i,j,cnt;
    cin>>a>>b;
    cnt=0;
    for(i=1;; i++)
    {
            a=a*3;
            b=b*2;
            cnt++;

        if(a>b)
        {
            break;
        }
    }
    cout<<cnt<<endl;
    return 0;
}