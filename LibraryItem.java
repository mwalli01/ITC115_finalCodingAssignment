package assignments;
import java.util.*;
public abstract class LibraryItem {
	private int itemNumber;
	private String itemTitle;
	private boolean isReserved;
	private boolean checkedIn;
	private String checkedOutBy;
	private Date dateCheckedOut;
	private double lateFee;
	private Date dueDate;
	
	public abstract void reserveTitle();
	
	public abstract void checkOut(String patronName);
	
	public abstract void checkIn();
	
	public abstract void finesAccrued(Date dateCheckedOut);
	
	public abstract String toString();
	
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public String getCheckedOutBy() {
		return checkedOutBy;
	}
	public void setCheckedOutBy(String checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}

	public Date getDateCheckedOut() {
		return dateCheckedOut;
	}

	public void setDateCheckedOut(Date dateCheckedOut) {
		this.dateCheckedOut = dateCheckedOut;
	}

	public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	
	
	
}
