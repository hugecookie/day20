package edu.pokemon;
import java.util.Scanner;



public class pokemonmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		pokemon ai = new pokemon("한지우", "번개 전기");
//		ai.info();
//		ai.attack(1);
//		picachu ai = new picachu("한지우", "번개 전기");
//		ai.attack(1);
//		ggoboogi as = new ggoboogi("이슬이", "물대포 하이드로펌프");
//		as.attack(1);
//		pairi ad = new pairi("웅이", "화염방사 불기둥");
//		ad.attack(1);
		int i = 0;
		while(i != 2) {
			System.out.printf("총 %d 마리의 포켓몬이 생성 되었습니다.", pokemon.count);
			System.out.println("1) 포켓몬 생성  2) 프로그램 종료 :");
			i = sc.nextInt();
			if (i == 2){
				System.out.println("프로그램 종료");
				break;
			}
			if (i == 1) {
				System.out.println("1) 피카츄  2) 꼬부기  3) 파이리 :");
				int pokemon = sc.nextInt();
				System.out.println("플레이어 이름 입력:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("사용 가능한 기술 입력 /로 구분하여 입력:");
				String skills = sc.nextLine();
				
				if (pokemon == 1) {
					picachu po = new picachu(name, skills);
					po.info();
					System.out.println("공격 번호 선택");
					int atk = sc.nextInt();
					po.attack(atk);
				}
				else if(pokemon == 2) {
					ggoboogi po = new ggoboogi(name, skills);
					po.info();
					System.out.println("공격 번호 선택");
					int atk = sc.nextInt();
					po.attack(atk);
				}
				else if(pokemon == 3) {
					pairi po = new pairi(name, skills);
					po.info();
					System.out.println("공격 번호 선택");
					int atk = sc.nextInt();
					po.attack(atk);
				}
				else
					System.out.println("알 수 없는 입력입니다.");
				
			}
			else
				System.out.println("잘못 된 입력입니다.");
		}
		
	}

}
