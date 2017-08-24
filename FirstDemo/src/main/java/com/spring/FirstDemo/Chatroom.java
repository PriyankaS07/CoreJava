package com.spring.FirstDemo;

import java.util.ArrayList;

public class Chatroom {
 String name;
 ArrayList<User> users=new ArrayList<User>();
 ArrayList<String> messages=new ArrayList<String>();
public Chatroom() {
	super();
}
public Chatroom(String name, ArrayList<User> users, ArrayList<String> messages) {
	super();
	this.name = name;
	this.users = users;
	this.messages = messages;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<User> getUsers() {
	return users;
}
public void setUsers(ArrayList<User> users) {
	this.users = users;
}
public ArrayList<String> getMessages() {
	return messages;
}
public void setMessages(ArrayList<String> messages) {
	this.messages = messages;
}
@Override
public String toString() {
	return "Chatroom [name=" + name + ", users=" + users + ", messages=" + messages + "]";
}
 
}
