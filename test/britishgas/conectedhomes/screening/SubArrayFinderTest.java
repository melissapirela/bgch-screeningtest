package britishgas.conectedhomes.screening;

import static org.junit.Assert.*;

import org.junit.Test;

import britishgas.conectedhomes.screening.SubArrayFinder;

public class SubArrayFinderTest {

	private static final int[] EMPTY_ARRAY = new int[]{};
	private static final int[] TESTING_ARRAY = new int[]{2, 3, 4, 5};
	private static final int NOT_VALID_ANSWER = -1;

	@Test
	public void testFirstArrayContainsSecondArrayAtTheEnd() {
		assertEquals(2, SubArrayFinder.getStartingPosition(TESTING_ARRAY, new int[]{4, 5}));
	}
	
	@Test
	public void testFirstArrayContainsSecondArrayAtTheBeginning() {
		assertEquals(0, SubArrayFinder.getStartingPosition(new int[]{4, 5, 2, 3}, new int[]{4, 5}));	
	}
	
	@Test
	public void testFirstArrayIsEqualToSecondArray() {
		assertEquals(0, SubArrayFinder.getStartingPosition(TESTING_ARRAY, TESTING_ARRAY));
	}
	
	@Test
	public void testFirstArrayDoesNotContainSecondArray() {
		assertEquals(NOT_VALID_ANSWER, SubArrayFinder.getStartingPosition(TESTING_ARRAY, new int[]{1, 2}));
	}
	
	@Test
	public void testFirstArrayIsEmpty() {
		assertEquals(NOT_VALID_ANSWER, SubArrayFinder.getStartingPosition(EMPTY_ARRAY, TESTING_ARRAY));
	}
	
	@Test
	public void testSecondArrayIsEmpty() {
		assertEquals(NOT_VALID_ANSWER, SubArrayFinder.getStartingPosition(TESTING_ARRAY, EMPTY_ARRAY));
	}

}
