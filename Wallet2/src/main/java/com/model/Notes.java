package com.model;

public class Notes {
	private int fiveRupeeNote;
	private int tenRupeeNote;
	private int fiftyRupeeNote;
	private int hunderedRupeeNote;
	private int twoHunderedRupeeNote;
	private int fivehundredRupeeNote;
	public Notes() {
		super();
		
	}
	public int getFiveRupeeNote() {
		return fiveRupeeNote;
	}
	public void setFiveRupeeNote(int fiveRupeeNote) {
		this.fiveRupeeNote = fiveRupeeNote;
	}
	public int getTenRupeeNote() {
		return tenRupeeNote;
	}
	public void setTenRupeeNote(int tenRupeeNote) {
		this.tenRupeeNote = tenRupeeNote;
	}
	public int getFiftyRupeeNote() {
		return fiftyRupeeNote;
	}
	public void setFiftyRupeeNote(int fiftyRupeeNote) {
		this.fiftyRupeeNote = fiftyRupeeNote;
	}
	public int getHunderedRupeeNote() {
		return hunderedRupeeNote;
	}
	public void setHunderedRupeeNote(int hunderedRupeeNote) {
		this.hunderedRupeeNote = hunderedRupeeNote;
	}
	public int getTwoHunderedRupeeNote() {
		return twoHunderedRupeeNote;
	}
	public void setTwoHunderedRupeeNote(int twoHunderedRupeeNote) {
		this.twoHunderedRupeeNote = twoHunderedRupeeNote;
	}
	public int getFivehundredRupeeNote() {
		return fivehundredRupeeNote;
	}
	public void setFivehundredRupeeNote(int fivehundredRupeeNote) {
		this.fivehundredRupeeNote = fivehundredRupeeNote;
	}
	public Notes(int fiveRupeeNote, int tenRupeeNote, int fiftyRupeeNote, int hunderedRupeeNote,
			int twoHunderedRupeeNote, int fivehundredRupeeNote) {
		super();
		this.fiveRupeeNote = fiveRupeeNote;
		this.tenRupeeNote = tenRupeeNote;
		this.fiftyRupeeNote = fiftyRupeeNote;
		this.hunderedRupeeNote = hunderedRupeeNote;
		this.twoHunderedRupeeNote = twoHunderedRupeeNote;
		this.fivehundredRupeeNote = fivehundredRupeeNote;
	}
}
