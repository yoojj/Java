package beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JavaBeans implements Serializable {

	private String str;
	private int num;
	
	public JavaBeans() {}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "JavaBeans [str=" + str + ", num=" + num + "]";
	}

}