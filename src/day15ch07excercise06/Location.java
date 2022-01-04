package day15ch07excercise06;

import java.util.*;

public class Location {
	
	private String 도시;
	private int 위도;
	private int 경도;
	
	public Location() {
		this("",0,0);
	}
	public Location(String 도시, int 위도, int 경도) {
		this.도시 = 도시;
		this.위도 = 위도;
		this.경도 = 경도;
	}
	
	public String get도시() {
		return 도시;
	}
	public int get위도() {
		return 위도;
	}
	public int get경도() {
		return 경도;
	}
	@Override
	public String toString() {
		return 도시 + " " + 위도 + " " + 경도;
	}
	public String toString(int i) {
		return "도시 : "+ 도시 +"\n위도 : " + 위도 + "\n경도 : " + 경도;
	}
	@Override
	public int hashCode() {
		return Objects.hash(도시);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(도시, other.도시);
	}	
}
