package Mypackage;

public class Book extends ItemLibrary{
	
	
	 Book(){
		 bookName="not specifies";author="not spcify";
		 vaidBorw=true;vaildBuy=true;
		 bookId=0000000;noCopies=1;
		 KindOfItem="Book";
		 freePeirod="not limited or  not all to brow";;
		 bookPrice="not limited or  not all to buy";
		// tax=10;
	 }
	
		public String getBookName() {
			return bookName;
		}
		public void setBookTitle(String bookTitle) {
			this.bookName = bookTitle;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(String bookPrice) {
			this.bookPrice = bookPrice;
		}
		public String getFreePeirod() {
			return freePeirod;
		}
		public void setFreePeirod(String freePeirod) {
			this.freePeirod = freePeirod;
		}
		public boolean isVaidBorw() {
			return vaidBorw;
		}
		public void setVaidBorw(boolean vaidBorw) {
			this.vaidBorw = vaidBorw;
		}
		public boolean isVaildBuy() {
			return vaildBuy;
		}
		public void setVaildBuy(boolean vaildBuy) {
			this.vaildBuy = vaildBuy;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public int getNoCopies() {
			return noCopies;
		}
		public void setNoCopies(int noCopies) {
			this.noCopies = noCopies;
		}
		
		
	
	

	
}
