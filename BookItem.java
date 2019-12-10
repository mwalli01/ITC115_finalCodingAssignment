package assignments;

import java.sql.Date;
import java.time.LocalDate;

public class BookItem extends LibraryItem{
	
	private int checkOutLength = 14;
	private double bookLateFee = 0.10;
	private String authorName;
	
	@Override
	public void finesAccrued(java.util.Date dateCheckedOut) {
		
		
	}
	
	@Override
	public void checkOut(String patronName) {
		if(super.isCheckedIn() &&!(super.isReserved())) {
			super.setCheckedIn(false);
			super.setReserved(false);
			super.setCheckedOutBy(patronName);
			super.setDateCheckedOut(Date.valueOf(LocalDate.now()));
			super.setDueDate(Date.valueOf(LocalDate.now().plusDays(checkOutLength)));
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void checkIn() {
		if(!(super.isCheckedIn())&&(super.isReserved())) {
			super.setCheckedIn(true);
			super.setReserved(false);
			super.setCheckedOutBy("");
			if(super.getDueDate().after(Date.valueOf(LocalDate.now()))) {
				int a = super.getDueDate().getDate() - LocalDate.now().getDayOfMonth();
				super.setLateFee(a * bookLateFee);
				System.out.println("You're overdue! You owe: " + super.getLateFee());
			}
		}
		
	}
	
	@Override
	public void reserveTitle() {
		
		if(super.isReserved() == false) {
		super.setReserved(true);
		}
		else {
			System.out.println("This item has already been reserved");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getItemTitle() +"\n" + authorName +"\n" + super.getItemNumber() + "\n" + super.getCheckedOutBy() +
		"\n" + "Is item reserved: " + super.isReserved() + "\n" + "Checked out on: " + super.getDateCheckedOut() + "\n" +
		"Checked out by: " + super.getCheckedOutBy() + "\n" + "Due back by: " + super.getDueDate();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	



}
