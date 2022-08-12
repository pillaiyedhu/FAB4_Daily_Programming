// https://leetcode.com/problems/valid-parentheses/description/

#include<bits/stdc++.h>
using namespace std;

void bal_para(string s){
    unordered_map <char, int> sign = {{'[', -1},{'(', -2},{'{', -3},{']', 1},{')', 2},{'}', 3}};

    stack <char> st;

    for(char par: s){
        if(sign[par] < 0){
            st.push(par);
        }

        else{
            if(st.empty()){
                cout<<"false"<<endl;
            }
            
            char top = st.top();
            st.pop();

            if(sign[top] + sign[par] != 0){
                cout<<"false"<<endl;
            }

        }
    }

    if(st.empty()){
        cout<<"true"<<endl;
    }
    else{
        cout<<"false"<<endl;
    }
    
}

int main(){
    string s;
    cin>>s;

    bal_para(s);
}
