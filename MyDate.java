public class MyDate implements Comparable<MyDate> {
	private int Day;
	private int Month;
	private int year;

	public MyDate() {
	}
	public MyDate(int day, int month, int year) {
		Day = day;
		Month = month;
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate)
		{
			MyDate temp=(MyDate)obj;
			if(this.Day==temp.Day && this.Month==temp.Month && this.year==temp.year)
				return true;
			else 
				return false;
		}
		else	
			return false;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		String s=this.Day+"/"+this.Month+"/"+this.year;
		return s;
	}
	@Override
	public int compareTo(MyDate o) {
		if(this.year>o.year)
			return 1;
		if(this.year<o.year)
			return -1;
		else
		{
			if(this.Month>o.Month)
				return 1;
			if(this.Month<o.Month)
				return -1;
			else
			{
				if(this.Day>o.Day)
					return 1;
				if(this.Day<o.Day)
					return -1;
				else
					return 0;
			}
		}
	}


}
