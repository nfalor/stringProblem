/*author: nfalor
Testing the multiple scenarios with TestNG framework
*/
package com.apple.StringReplace;

import org.testng.annotations.Test;

import com.apple.StringReplace.StringReplace;

import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class StringReplaceTest {
		
		// Test for character removal without api
		@Test (dataProvider = "testdata")
		public void testRemoveCharacter(String myStr, char charToRemove, String output) throws Exception{
			Assert.assertEquals(StringReplace.removeCharacter(myStr, charToRemove), output);
		}
		
		// Test for character removal with api
		@Test (dataProvider = "testdata")
		public void testRemoveCharacterUsingApi(String myStr, char charToRemove, String output) throws Exception{     
			Assert.assertEquals(StringReplace.removeCharacterUsingApi(myStr, charToRemove), output);
		}
	
		//DataProvider to store test data
		@DataProvider(name="testdata")
		public Object[][] dataProvider (){
			return new Object[][] {
					{ null, 'a', null },
					{ "", 'b', "" },
					{ "Testing String Removal", ' ', "TestingStringRemoval" },
					{ "string", 'r', "sting" },
					{ "%356$", '%', "356$" },
					{ "adam", 'a', "dm" },
					{ "1970", '9', "170" }
			};
		}
}
