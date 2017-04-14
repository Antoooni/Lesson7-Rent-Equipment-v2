package by.htp.Lesson7.equipment.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class RentStationServiceFileImpl implements RentStationServiceFile {
	private static final String FILESEARCHITEM = "C:/Users/ayumazec/workspace_IT_Academy/Lesson7EquipmentUsingFile/src/by/htp/Lesson7/equipment/service/SearchItem.txt";
	private static final String FILEMANAGER =    "C:/Users/ayumazec/workspace_IT_Academy/Lesson7EquipmentUsingFile/src/by/htp/Lesson7/equipment/service/Manager.csv";
	private static final String FILECLIENTS =    "C:/Users/ayumazec/workspace_IT_Academy/Lesson7EquipmentUsingFile/src/by/htp/Lesson7/equipment/service/Clients.csv";
	private String ontputString;
	
	public RentStationServiceFileImpl() {
		super();
	}

	@Override
	public String getFoundBrand() {
		try (BufferedReader br = new BufferedReader(new FileReader(FILESEARCHITEM))) {

			String brandName;

			while ((brandName = br.readLine()) != null) {
				ontputString = brandName;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ontputString;
	}

	@Override
	public String getManagerName() {
		String[] s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILEMANAGER))) {

			String manager;

			while ((manager = br.readLine()) != null) {
				ontputString = manager;
				 s =ontputString.split(";");
				 for(int i =0; i<s.length;i++){ 
					 if(i%2==0){				//четный- name manager
						 ontputString= s[i];
					 }
				 }
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ontputString;
	}

	@Override
	public String getClientName() {
		String[] s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILECLIENTS))) {

			String client;

			while ((client = br.readLine()) != null) {
				ontputString = client;
				 s =ontputString.split(";");
				 for(int i =0; i<s.length;i++){ 
					 if(i%2==0){				//четный- name client
						 ontputString= s[i];
					 }
				 }
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ontputString;
	
	}

	@Override
	public int getManagerId() {
		int id=0;
		String[] s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILEMANAGER))) {

			String manager;

			while ((manager = br.readLine()) != null) {
				ontputString = manager;
				 s =ontputString.split(";");
				 for(int i =0; i<s.length;i++){ 
					 if(i%2!=0){				//Нечетный- manager id
						 ontputString= s[i];
					 }
				 }
				id = Integer.parseInt(ontputString);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public int getClientId() {
		int id=0;
		String[] s=null;
		try (BufferedReader br = new BufferedReader(new FileReader(FILECLIENTS))) {

			String client;

			while ((client = br.readLine()) != null) {
				ontputString = client;
				 s =ontputString.split(";");
				 for(int i =0; i<s.length;i++){ 
					 if(i%2!=0){				//Нечетный- client id
						 ontputString= s[i];
					 }
				 }
				id = Integer.parseInt(ontputString);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return id;
	}
}
