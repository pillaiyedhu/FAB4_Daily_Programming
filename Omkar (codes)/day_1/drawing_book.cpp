#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, p;
    cin>>n>>p;

    if(p > n/2){
        cout<<n/2 - p/2;
    }

    else{
        cout<<p/2;
    }
}
