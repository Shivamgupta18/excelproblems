package com.javaQuestions;

public class Person {
public int id;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
