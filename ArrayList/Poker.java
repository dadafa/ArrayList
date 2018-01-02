/**
 * 
 */
package com.xyd.test01;

/**
 * @author scott
 * @date 2017年12月21日上午9:49:08
 * @version
 * @description
 */
public class Poker implements Comparable<Poker> {

	private int num;
	private String color;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Poker() {
	}

	public Poker(int num, String color) {
		this.num = num;
		this.color = color;
	}

	@Override
	public String toString() {

		if (this.num == 1) {
			return "A" + color;
		}

		if (this.num == 11) {
			return "J" + color;
		}

		if (this.num == 12) {
			return "Q" + color;
		}
		if (this.num == 13) {
			return "K" + color;
		}
		return num + color;
	}

	@Override
	public int compareTo(Poker o) {
		
		if (this.getNum() == o.getNum()) {
			return 0;
		}
		if (this.getNum() < o.getNum()) {
			return -1;
		}
		
		return 1;
	}

}
