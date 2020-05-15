#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int c=1;
  int s[n];
  
  for(int i=0;i<n;i++)
  {
    cin>>s[i];
  }
  
  cout<<1<<endl;
  for(int i=0;i<n-1;i++)
  {
    if(s[i]>s[i+1])
      cout<<1<<endl;
    else{
     cout<<2*c<<endl;
      c++;
    }
  }
}