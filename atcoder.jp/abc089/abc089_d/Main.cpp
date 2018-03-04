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
const ll LL_INF = 1LL << 60;
const double EPS = 1e-9;
const ll MOD = 1000000007;

const int dx[] = {1, 0, -1, 0}, dy[] = {0, -1, 0, 1};
int H, W, D, Q;
const int MAX_HW = 301;
pii indices[MAX_HW * MAX_HW];
bool visited[MAX_HW * MAX_HW];
ll sum[MAX_HW * MAX_HW];
void dfs(int pos, ll cost)
{
    if (visited[pos])
    {
        return;
    }
    sum[pos] = cost;
    visited[pos] = true;
    pii p = indices[pos];
    int dst = pos + D;
    if (dst < H * W)
    {
        pii q = indices[dst];
        int tmp = abs(p.first - q.first) + abs(p.second - q.second);
        dfs(dst, cost + tmp);
    }
}
int main()
{
    cin >> H >> W >> D;
    for (int i = 0; i < H; i++)
    {
        for (int j = 0; j < W; j++)
        {
            int a;
            cin >> a;
            a--;
            indices[a] = mp(i, j);
        }
    }
    for (int i = 0; i < H * W; i++)
    {
        if (!visited[i])
        {
            dfs(i, 0);
        }
    }

    cin >> Q;
    for (int i = 0; i < Q; i++)
    {
        int l, r;
        cin >> l >> r;
        l--, r--;
        if (l == r)
        {
            cout << 0 << endl;
            continue;
        }
        ll res = sum[r] - sum[l];
        cout << res << endl;
    }
    return 0;
}
