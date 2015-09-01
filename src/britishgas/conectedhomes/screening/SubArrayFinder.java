package britishgas.conectedhomes.screening;

public class SubArrayFinder {

	public static int getStartingPosition(int[] firstArray, int[] secondArray) {
		if (firstArray.length == 0 || secondArray.length == 0) {
	        return -1;
	    }
		
	    int limit = firstArray.length - secondArray.length;
	    startSearch : for (int firstArrayIndex = 0; firstArrayIndex <= limit; firstArrayIndex++) {
	        for (int secondArrayIndex = 0; secondArrayIndex < secondArray.length; secondArrayIndex++) {
	            if (secondArray[secondArrayIndex] != firstArray[firstArrayIndex + secondArrayIndex]) {
	                continue startSearch;
	            }
	        }
	        
	        return firstArrayIndex;
	    }
	    
	    return -1;
	}

}
