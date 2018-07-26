/*package com.nisum.datadriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class InputData {

	@DataProvider(name = "inputCsvData")
	public static Object[][] getCsvData() throws IOException {
		CSVReader csvReader = new CSVReader(new FileReader(InputData.class.getResource("/inputData.csv").getPath()));
	
		return null;
		
		List<String[]>dataList=csvReader.readAll();
		
		Object[][] data =new Object[dataList.size()][1];
	
		List<InputData> inputList= new ArrayList<InputData>();
		
		for(String[] strArray:dataList) {
			
			InputData inputData = new InputData();
			inputData.setUserName(strArray[0].trim());
			inputData.setPassword(strArray[1].trim());
			
		}
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				
			}
		}
		
		csvReader.close();
		
		return data;
		
		@DataProvider(name="loginData")
		public static Object[][] getLoginData(){
			
		}
		
	
		
		
	}

	private void setPassword(String trim) {
		// TODO Auto-generated method stub
		
	}

	private void setUserName(String trim) {
		// TODO Auto-generated method stub
		
	}
}
*/