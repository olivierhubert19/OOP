package model;

import java.sql.Date;

public class Borrowing {
    private int bookId;
    private int borrowerId;
    private Date borrowDate;
    private Date returnDate;
    private int quantityBorrow;

    public Borrowing(int bookId, int borrowerId, Date borrowDate, Date returnDate) {
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Borrowing(int bookId, int borrowerId, int quantityBorrow, Date borrowDate, Date returnDate) {
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.quantityBorrow = quantityBorrow;
    }
    public Borrowing(){

    }




    // Getters
    public int getBookId() {
        return bookId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getQuantityBorrow() {
        return quantityBorrow;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setQuantityBorrow(int quantityBorrow) {
        this.quantityBorrow = quantityBorrow;
    }

    public int getQuantity() {
        return quantityBorrow;
    }
}
