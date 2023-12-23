class Solution {
    public boolean isPathCrossing(String path) {
        // Set<String> visited = new HashSet<>();
        List<String> coordList = new ArrayList<String>();
	    int x = 0, y = 0;
	    // String presentCoord = x + "," + y;
	    // coordList.add(presentCoord);
        coordList.add("0,0");
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
	        String presentCoord = x + "," + y;
	        // System.out.println(presentCoord);
	        if (coordList.contains(presentCoord)) {
	            return true;
	        }
            // add to the list
	        coordList.add(presentCoord);
	    }
	    return false;
    }
}