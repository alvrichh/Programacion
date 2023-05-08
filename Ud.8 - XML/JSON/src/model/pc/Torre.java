package model.pc;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Torre implements Serializable {

	private Integer ram;
	private Integer hd;
	private String micro;

	public Torre() {
	}

	public Torre(Integer ram, Integer hd, String micro) {
		setRAM(ram);
		setHD(hd);
		setMicro(micro);
	}

	public Integer getRAM() {
		return ram;
	}

	public void setRAM(Integer ram) {
		this.ram = ram;
	}

	public Integer getHD() {
		return hd;
	}

	public void setHD(Integer hd) {
		this.hd = hd;
	}

	public String getMicro() {
		return micro;
	}

	public void setMicro(String micro) {
		this.micro = micro;
	}

	@Override
	public String toString() {
		return "Torre [RAM=" + getRAM() + ", HD=" + getHD() + ", Micro=" + getMicro() + "]";
	}

	
	
}