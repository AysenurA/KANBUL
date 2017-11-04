package sqlTables;

public class KanArayan {
private String _TELEPHONE;
private String _fname;
private String _mname;
private String _lname;
private String _bloodType;
private String _hospitalCity;
private String _hospitalTown;

public KanArayan(String tel,String fname,String mname,String lname,String bloodT,String hospitalC,String hospitalT) {
	this._TELEPHONE=tel;
	this._fname=fname;
	this._mname=mname;
	this._lname=lname;
	this._bloodType=bloodT;
	this._hospitalCity=hospitalC;
	this._hospitalTown=hospitalT;
}

public String get_TELEPHONE() {
	return _TELEPHONE;
}

public String get_fname() {
	return _fname;
}

public String get_mname() {
	return _mname;
}

public String get_lname() {
	return _lname;
}

public String get_bloodType() {
	return _bloodType;
}

public String get_hospitalCity() {
	return _hospitalCity;
}

public String get_hospitalTown() {
	return _hospitalTown;
}

}
