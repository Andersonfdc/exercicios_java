package parteF;

public class Date {
	private int day;
	private int month;
	private int year;
	
	//Construtor
	public Date(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	
	//Getters e Setters
    public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
