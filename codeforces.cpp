/*
	Author: Chirayu Joshi
	CodeForces: chirayu-joshi
	CodeChef: cjoshi_123
	Version: 3.0
*/

#include <bits/stdc++.h>
using namespace std;

#define fastio() ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
#define INF                     INT_MAX
#define LINF                    LONG_MAX
#define ll                      long long
#define pb                      push_back
#define ppb                     pop_back
#define pf                      pop_front
#define ppf                     pop_front
#define mp                      make_pair
#define all(x)                  (x).begin(),(x).end()
#define fo(i,a,b)               for(int i=a;i<b;++i)
#define MOD                     1000000007
#define PI                      3.141592653589793238462
#define nline                   "\n"
typedef pair<int, int>          pii;
typedef pair<ll, ll>            pll;
typedef vector<int>             vi;
typedef vector<ll>              vl;
typedef vector<vector<int>>     vvi;
typedef vector<vector<long>>    vvl;

ll gcd(ll a,ll b){if(b>a){return gcd(b,a);} if(b==0){return a;} return gcd(b,a%b);}
ll lcm(ll a,ll b) {return (a/gcd(a,b))*b;}
void swap(int &x,int &y){int temp=x;x=y;y=temp;}
void precision(int pre){cout<<setprecision(pre)<<fixed;}
void scanvi(vi &arr,int size){while(size--){int temp;cin>>temp;arr.pb(temp);}}
void printvi(vi &arr){int len=arr.size();for(int i=0;i<len;++i){cout<<arr[i]<<" ";}}
void scanvl(vl &arr,int size){while(size--){ll temp;cin>>temp;arr.pb(temp);}}
void printvl(vl &arr){int len=arr.size();for(int i=0;i<len;++i){cout<<arr[i]<<" ";}}


// ----------------------------------------------------------------------------
void solve() {

	
























}
// ----------------------------------------------------------------------------

int main() {
	fastio();
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
	freopen("error.txt", "w", stderr);
#endif
	int t = 1;
	cin >> t;          // Comment this if there is only one test case
	while (t--) {
		solve();
	}

	return 0;
}
