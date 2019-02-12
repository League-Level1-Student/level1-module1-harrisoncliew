

public class FlyingSquirrels {
int numberoftreesowned;
String favoritefood;
boolean happy;
String nameofsquirrel;
FlyingSquirrels(int numberoftreesowned, String favoritefood, boolean happy, String nameofsquirrel){
	this.favoritefood=favoritefood;
	this.happy=happy;
	this.nameofsquirrel=nameofsquirrel;
	this.numberoftreesowned=numberoftreesowned;
}

void fly(){
	System.out.println(nameofsquirrel+" has flown onto a different tree!");
	numberoftreesowned++;
	System.out.println(nameofsquirrel+" owns "+numberoftreesowned+" trees.");
	happy=true;
	System.out.println(nameofsquirrel +" is now happy.");
}
void eat() {
	System.out.println(nameofsquirrel+" is eating "+favoritefood);
	if(happy=true) {
		System.out.println(nameofsquirrel+" is still happy.");
	}
	else if(happy=false) {
		System.out.println(nameofsquirrel +" is now happy.");
	}
}

}
