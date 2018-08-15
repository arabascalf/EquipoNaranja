#include<iostream>
using namespace std;

string may(string word){
    for(int i = 0; i < word.length(); i++){
        if(word[i] >= 'a' && word[i] <= 'z')word[i]-=32;
    }
    return word;
}
string min(string word){
    for(int i = 0; i < word.length(); i++){
        if(word[i] >= 'A' && word[i] <= 'Z')word[i]+=32;
    }
    return word;
}
int main(){

    string word;
    int u = 0,l = 0;
    cin >> word;
    for(int i = 0; i < word.length(); i++){
        if(word[i] >= 'a' && word[i] <= 'z')l++;
        if(word[i] >= 'A' && word[i] <= 'Z')u++;
    }
    if(l < u)cout << may(word) << endl;
    else cout << min(word) << endl;
    return 0;
}

