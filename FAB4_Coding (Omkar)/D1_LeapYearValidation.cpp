#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        string s;
        cin>>s;

        int year = stoi(s);
        
        if(year >= 1000 && year <= 9999){
            if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)){
                cout<<"LEAP YEAR ";
            }

            else{
                cout<<"NOT LEAP YEAR ";
            }
        }

        else{
            cout<<"INVALID YEAR ";
        }
    }
}
