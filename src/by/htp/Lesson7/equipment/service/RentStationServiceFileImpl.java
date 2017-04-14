package by.htp.Lesson7.equipment.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RentStationServiceFileImpl implements RentStationServiceFile {
	private static final String FILENAME = "C:/Users/ayumazec/workspace_IT_Academy/Lesson7EqupmentUsingFile/src/by/htp/Lesson7/equipment/service/SearchItem.txt";
	private String ontputString;
	
	public RentStationServiceFileImpl() {
		super();
	}

	@Override
	public String getFoundBrand() {
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String brandName;

			while ((brandName = br.readLine()) != null) {
				ontputString = brandName;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ontputString;
	}
}
