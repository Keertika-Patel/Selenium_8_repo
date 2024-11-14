package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
@DataProvider
public String[][] loginData(){
	String[][] data = {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
	return data;
   }
@DataProvider
public String[][] registerData(){
	String[][] data = {
			{"virat","kohli","virat12345@gmail.com","virat1234","virat1234"},
			{"rohit","sharma","rohit1234@gmail.com","rohit1234","rohit1234"},
			{"smith","sharma","smith1234@gmail.com","smith1234","smith1234"},
			{"mahendra","dhoni","dhoni1234@gmail.com","dhoni1234","dhoni1234"},
			{"mohammad","shami","shami1234@gmail.com","shami1234","shami1234"},
};
	return data;
	}
}
