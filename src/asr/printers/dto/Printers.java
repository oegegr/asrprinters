package asr.printers.dto;
import javax.persistence.*;
@Entity
public class Printers {
	@Id
	private String sn;
	private String model;
	private boolean color;
	private int blackCounter;
	private int colorCounter;
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public int getBlackCounter() {
		return blackCounter;
	}
	public void setBlackCounter(int blackCounter) {
		this.blackCounter = blackCounter;
	}
	public int getColorCounter() {
		return colorCounter;
	}
	public void setColorCounter(int colorCounter) {
		this.colorCounter = colorCounter;
	}
	

}
