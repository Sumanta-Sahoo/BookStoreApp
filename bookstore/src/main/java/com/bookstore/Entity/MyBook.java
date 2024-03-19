package com.bookstore.Entity;

import java.io.Serializable;



import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DynamicUpdate()
@Getter
@Setter
@NoArgsConstructor
public class MyBook implements Serializable {
	
	public MyBook(Integer myBookId, String myBookName, String myBookAuthor, String myBookGenre, String myBookPrice) {
		super();
		this.myBookId = myBookId;
		this.myBookName = myBookName;
		this.myBookAuthor = myBookAuthor;
		this.myBookGenre = myBookGenre;
		this.myBookPrice = myBookPrice;
	}

	private static final long serialVersionUID = 1L;

	@Id
	private Integer myBookId;
	private String myBookName;
	private String myBookAuthor;
	private String myBookGenre;
	private String myBookPrice;

	@Override
	public String toString() {
		return "MyBook [myBookId=" + myBookId + ", myBookName=" + myBookName + ", myBookAuthor=" + myBookAuthor
				+ ", myBookGenre=" + myBookGenre + ", myBookPrice=" + myBookPrice + "]";
	}


}
