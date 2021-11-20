package Singelton;


public class AppConfig {
	private AppConfig() {
	
	}
	public static AppConfig obj=new AppConfig();
	public static AppConfig getInstance() {
		return obj;
	}

}
