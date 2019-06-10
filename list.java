import java.util.LinkedList;


public class list extends LinkedList{
	
 String list[]=["a","b","c","d","e","f","g"];

	public void insertcontacts(string name,string surname,string number){
    contacts c=new contacts(name,surname,number);
	this.add(c);
}

	public void printingaddress(){
		
	contacts a ;
	
	for(int i=0;i<this.size();i++){
		
	a=(contacts)this.get(i);
	
	system.out.println(a.name+""+a.surname+""+a.number+"");
	
	}
	}
	
	

	
