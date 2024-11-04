package com.lmsInterview6;

class Books {
	
	int id;
	String bookname;
	String authorname;
	
	//Constructor
	Books(int id, String bookname, String authorname){
		this.id=id;
		this.bookname=bookname;
		this.authorname=authorname;
		
	}
	public void display() {
		System.out.println("Book Id:"+id+","+"Book Name:"+bookname+","+"Author Name:"+authorname);
	}

}
public class Book {
	
	public static void main(String[] args) {
		Books[] arr;
		arr = new Books[3];
		
		//initialize;
		arr[0] = new Books(101,"Python","abc");
		arr[1] = new Books(102,"Java","pqr");
		arr[2] = new Books(102,"PHP","xyz");
		
		
		
		for (Books arr1 : arr) {
			
            arr1.display();  // Calling method to display details
            
        }
	}

}

