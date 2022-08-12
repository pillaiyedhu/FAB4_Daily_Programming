https://leetcode.com/problems/roman-to-integer/

#include<bits/stdc++.h>
using namespace std;

void roman2num(string s){
    unordered_map<char, int> symbol = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};

    int n = s.length();
    
    int res = 0 ;

    for(int i = n - 1; i >= 0; i--){
        if(symbol[s[i]] < symbol[s[i+1]]){
            res = res - symbol[s[i]];
        }

        else{
            res = res + symbol[s[i]];
        }
    }

    cout<<res<<endl;
}

int main(){
    string s;
    cin>>s;

    roman2num(s);

}
