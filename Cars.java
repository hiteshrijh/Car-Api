package org.hitesh.NewApp.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cars {
	
	private String _1;
	private String _2;
	private String _3;
	private String _4;
	
	public Cars(){
	
}
	
	public Cars(String _1, String _2, String _3, String _4){
		this._1= _1;
		this._2=_2;
		this._3=_3;
		this._4=_4;
	}
	
	public String get_1() {
		return _1;
	}

	public void set_1(String _1) {
		this._1 = _1;
	}

	public String get_2() {
		return _2;
	}

	public void set_2(String _2) {
		this._2 = _2;
	}

	public String get_3() {
		return _3;
	}

	public void set_3(String _3) {
		this._3 = _3;
	}

	public String get_4() {
		return _4;
	}

	public void set_4(String _4) {
		this._4 = _4;
	}

	
	
}
