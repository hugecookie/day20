package edu.pokemon;

class pokemonclass {
	
}

class pokemon{
	static int count;
	protected String owner;
	protected String skills;
	protected String skill[];
	
	public pokemon() {}
	public pokemon(String nam, String ski) {
		owner = nam; 
		skills = ski;
		skill = skills.split("/");
		count = count + 1;
		}
	
	public String getskills() {
		return this.skills;
	}
	public void setskills(String input) {
		this.skills = input;
	}
	
	public String getowner() {
		return this.owner;
	}
	public void setowner(String input) {
		this.owner = input;
	}
	
	
	public void info() {
		System.out.printf("%s의 포켓몬이 사용 가능한 스킬\n", owner);
		int i = 0;
		for(i = 0; i < skill.length ; i++) {
			System.out.printf("%d: %s\t", i + 1, skill[i]);
		}
		System.out.println();
	}
	
	public void attack(int idx) {
		String spskill[] = skills.split("/");
		System.out.printf("%s 공격 시전!\n", spskill[idx-1]);
		
	}
	
	
	
}


class picachu extends pokemon{
	private String name = "피카츄";
	public picachu() {}
	public picachu(String nam, String ski) {
		super(nam, ski);
		}
	public void attack(int idx) {
		System.out.printf("삐까삐까! %s의 %s가 %s를 시전!\n", owner, name, skill[idx-1]);

	}
}

class ggoboogi extends pokemon{
	private String name = "꼬부기";
	public ggoboogi() {}
	public ggoboogi(String nam, String ski) {
		super(nam, ski);
		}
	public void attack(int idx) {
		System.out.printf("꼬북! %s의 %s가 %s를 시전!\n", owner, name, skill[idx-1]);
	}
	public void swim() {
		System.out.printf("%s가 수영을 합니다!", name);
	}
}


class pairi extends pokemon{
	private String name = "파이리";
	public pairi() {}
	public pairi(String nam, String ski) {
		super(nam, ski);
		}
	public void attack(int idx) {
		System.out.printf("파이리! %s의 %s가 %s를 시전!\n", owner, name, skill[idx-1]);

	}
}

