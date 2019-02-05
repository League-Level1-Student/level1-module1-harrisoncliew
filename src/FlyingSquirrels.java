

public class FlyingSquirrels {
int numberoftreesowned;
String favoritefood;
boolean happy;
String nameofsquirrel;
FlyingSquirrels(int numberoftreesowned, String favoritefood, boolean happy, String nameofsquirrels){
	this.favoritefood=favoritefood;
	this.happy=happy;
	this.nameofsquirrel=nameofsquirrel;
	this.numberoftreesowned=numberoftreesowned;
}

void fly(){
	System.out.println(nameofsquirrel+" has flown onto a different tree!");
	numberoftreesowned++;
	System.out.println(nameofsquirrel+" owns "+numberoftreesowned);
}
void bite() {
	System.out.println();
}
}
