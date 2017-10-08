#include <algorithm>
#include <bitset>
#include <cassert>
#include <cfloat>
#include <climits>
#include <cmath>
#include <complex>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <fstream>
#include <functional>
#include <iomanip>
#include <iostream>
#include <list>
#include <map>
#include <memory>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <string>
#include <utility>
#include <vector>

// c++11
#include <array>
#include <tuple>
#include <unordered_map>
#include <unordered_set>

#define mp make_pair
#define mt make_tuple
#define rep(i, n) for (int i = 0; i < (n); i++)

using namespace std;

using ll = long long;
using ull = unsigned long long;
using pii = pair<int, int>;

const int INF = 1 << 29;
const double EPS = 1e-9;
const ll MOD = 1000000007;

const int dx[] = {1, 0, -1, 0}, dy[] = {0, -1, 0, 1};
int N,M;
map<int, int> D;
int main() {
    cin >> N;
    for (int i = 0; i < N; i++){
        int x;
        cin >> x;
        D[x]++;
    }
    cin >> M;
    for (int i = 0; i < M; i++){
        int x;
        cin >> x;
        D[x]--;
    }
    for (const auto &val : D){
        if (val.second < 0){
            cout << "NO" << endl;
            return 0;
        }
    }
    cout << "YES" << endl;
   return 0;


 }
