
public class Book {
	int id;
	int book_id;
	String name;
	String author_name;
	int price;
	
	public Book() {
		book_id= 2345432;
		name= "Two States";
		author_name= "Aman Mathur";
		price= 550;
	}
	
	public Book(int book_id, String name, String author_name, int price ) {
		this.book_id= book_id;
		this.name= name;
		this.author_name= author_name;
		this.price= price;
	}
	
	public void setbook_id(int book_id){
		this.book_id= book_id;
	}
	public void setname(String name){
		this.name= name;
	}
	
	public void setauthor_name(String author_name){
		this.author_name= author_name;
	}
	public void setprice(int price){
		this.price= price;
	}
	public int getbook_id() {
		return book_id;		
	}
	public String getname() {
		return name;		
	}
	public String getauthor_name() {
		return author_name;		
	}
	public int getprice() {
		return price;		
	}

	public void print() {
		System.out.println(book_id+ "   " +name+ "   " +author_name+ "   " +price );
		System.out.println(" ");
		System.out.println(" ");
	}
	public String toString() {
		String str= "Book_id : " + this.book_id + "Name : " + this.name + "Author_Name : " + this.author_name + "Price : " + this.price ;
	return str;
	}
	
	
}
