//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
		vector<string> AllPossibleStrings(string s){
		    // Code here
		    int lengthOfString = s.length();
		    vector<string> subsequenceList;
		    for(int i=0; i<(1<<lengthOfString); i++) {
		        string subsequence = "";
		        for(int j=0; j<lengthOfString; j++) {
    		        if((i & (1<<j)) != 0) {
    		            subsequence += s[j];
    		        }
		        }
		        if(subsequence.length() != 0) {
		            subsequenceList.push_back(subsequence);
		        }
		    }
		    sort(subsequenceList.begin(), subsequenceList.end());
		    return subsequenceList;
		}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string s;
		cin >> s;
		Solution ob;
		vector<string> res = ob.AllPossibleStrings(s);
		for(auto i : res)
			cout << i <<" ";
		cout << "\n";

	}
	return 0;
}
// } Driver Code Ends