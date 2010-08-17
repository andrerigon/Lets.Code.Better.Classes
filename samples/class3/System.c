#include <stdlib.h>
#include <stdio.h>

typedef struct Person {
	 char* name;
         int age;
	 int yearsUntilRetirement;
} Person;

void setName(Person *p, char *name){
	p->name = name;
}

void setAge( Person *p, int age){
	p->age = age;
}

int calculateYearsUntilRetirement( Person *p ){
	return 60 - p->age; 
}

void savePerson ( char * name, int age ){
   Person *p = malloc(sizeof(Person));
   
   setName( p, "andre" );
   setAge( p, 45 );
   p->yearsUntilRetirement = calculateYearsUntilRetirement( p  );
   printf ( "Name: %s Age: %d Will retire in %d years\n", p->name, p->age, p->yearsUntilRetirement );

}

main(){
	//read input data from user

	savePerson( "andre", 10 );

}


