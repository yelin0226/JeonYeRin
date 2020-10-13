/*package java1013;

public class pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름 배열을 생성과 동시에 초기화
		/*String [] names = {"전예린", "전지현" , "전병훈"};
		//정수 3개를 저장할수 있는 배열을 만들고 값을 대입
		double [] scores = new double[3]; //값을 안넣으면 NullPointerException 경고문이 뜸
		scores[0] =163.2;
		scores[1] =168.4;
		scores[2] =165.8;
		//scores[3] =154.8;
		//scores[3] =100; 이름보다 점수가 맣으면 ArrayIndexOutBoundsException 경고문이 뜸
		 */
		
		
		//반복문을 사용하면 유지보수가 수월 해짐
		/*
		
		for(int i =0 ; i<=2; i=i+1)
		
		System.out.printf("이름은 %s이고 키는 %.1f입니다.\n"
				,names[i] ,scores[i]);
				*/
		
		
		// 3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정
		//배열의 속성으로 설정 - 데이터가 변경되도록 출력하는 부분을 수정할 필요가 없어짐
		/*for(int i =0 ; i<=names.length; i=i+1)
			
			System.out.printf(
					"이름은 %s이고 키는 %.1f입니다.\n"
					,names[i] ,scores[i]);
		*/


	//.으로 접근하거나 [인덱스]로 데이터를 접근하게되면
	//메로리를 한번 더 찾아가야합니다
	//반복문 등에서 동일한 데이터를 여러 번 . 이나 [인덱스]를
	//이용해서 찾아가게되면 비효휼적
	//이런 경우에는 이데이터를 가까운 곳에 저장해두고
	//접근하는 것이 좋다
	/*
	int len = names.length;
	for(int i =0 ; i<=names.length; i=i+1)
		
		System.out.printf(
				"이름은 %s이고 키는 %.1f입니다.\n"
				,names[i] ,scores[i]);
	*/

	//빠른 열거를 이용한 names의 데이터 출력
	/*	String [] names = {"배주현", "배수지", "신예은" };

		int len = names.length;
	for(String names : names.length) {

		System.out.printf( "%s\n" ,names[i]);
	
	}

}*/
