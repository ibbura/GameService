package fsb.gs.model;

import java.util.Calendar;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Game {
 
	@Id
	@Column(nullable = false)
	private String name;
	@Column(name = "creationDate")
	private Calendar creationDate;
	@Column(name = "isActive")
	private boolean isActive;

	public Game(String name, Calendar creationDate, boolean isActive) {
		super();
		this.name = name;
		this.creationDate = creationDate;
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}
