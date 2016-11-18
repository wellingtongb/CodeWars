package br.com.fighter;

public class Fighter {


	public String name;
	public int health, damagePerAttack;
	
	public Fighter(String name, int health, int damagePerAttack) {
		this.name = name;
		this.health = health;
		this.damagePerAttack = damagePerAttack;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamagePerAttack() {
		return damagePerAttack;
	}

	public void setDamagePerAttack(int damagePerAttack) {
		this.damagePerAttack = damagePerAttack;
	}

	public void Printar(Fighter f)
	{
		System.out.println("Name : " +f.getName());
		System.out.println("Health = " + f.getHealth());
		System.out.println("Damage per Atack = " + f.getDamagePerAttack());
		System.out.println("***----------------------------------------------***"); 
		
	}
	public void DeclareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker){
		
		Fighter first, second;
		if(fighter1.name == firstAttacker){
			first = fighter1;
			second = fighter2;
		}else{
			first = fighter2;
			second = fighter1;
		}
		
		Printar(first);
		Printar(second);
		while(first.health > 0 & second.health > 0)
		{
			//1º turno - segundo sofre ataque
			second.health -= first.damagePerAttack;
			System.out.println(second.name + " Life now is = " + second.health);
			
			//2º turno - primeiro sofre ataque
			first.health -= second.damagePerAttack;
			System.out.println(first.name + " Life now is = " + first.health);
		}
		
		if(first.getHealth() > 0)
			System.out.println(second.name + " is dead! " + first.name + " won!!!");
		else
			System.out.println(first.name + " is dead! " + second.name + " won!!!");
	}


}
