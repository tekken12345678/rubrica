
public class contacts {
private string name;
private string surname;
private string  number;

//costruttore
public contacts(string name,string surname,string number){
this.name=name;
this.surname=surname;
this.number=number;
}


public string getName() {
	return name;
}


public void setName(string name) {
	this.name = name;
}


public string getSurname() {
	return surname;
}


public void setSurname(string surname) {
	this.surname = surname;
}

public string getNumber() {
	return number;
}

public void setNumber(string number) {
	this.number = number;
}



