/**
 * 
 */
package fr.ippon.swf.jsf.moviesstore.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author marinasinama-pongolle
 *
 */
@Entity
public class Movie  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4401010555802881423L;
	
	@Id
	private int id;
	private String title;
	private String description;
	
	public Movie() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
