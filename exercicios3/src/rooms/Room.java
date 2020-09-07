package rooms;

import java.util.Scanner;

public class Room {
	private String nome;
	private String email;
	private int room;
	//construtor
	public Room(String nome, String email, int room) {
		this.nome = nome;
		this.email = email;
		this.room = room;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return room+": "+ nome +", "+email;
	}
	
}
