class Solution {
    public boolean isPathCrossing(String path) {
        List<String> coordList = new ArrayList<String>();
	    int x = 0, y = 0;
	    String presentCoord = x + "," + y;
	    coordList.add(presentCoord);
	    // System.out.println(presentCoord);
	    for(int i=0; i<path.length(); i++) {
	        if (path.charAt(i) == 'N') {
	            y += 1;
	        } else if (path.charAt(i) == 'E') {
	            x += 1;
	        } else if (path.charAt(i) == 'W') {
	            x -= 1;
	        } else if (path.charAt(i) == 'S') {
	            y -= 1;
	        }
	        presentCoord = x + "," + y;
	        // System.out.println(presentCoord);
	        if (coordList.contains(presentCoord)) {
	            return true;
	        } else {
	           // add to the list
	           coordList.add(presentCoord);
	        }
	    }
	    return false;
    }
}