package exam1;

public class DateOperation {
	private int[] datePermonth = {31,29,31,30,31,30,31,31,30,31,30,31};
	private String[] yoil = {"목요일","금요일","토요일","일요일","월요일","화요일","수요일"};
	private int date;
	private int month;

	private int resultdate=0;
	private String whatYoil;

	public boolean except(){
		boolean check;
		if (month<4||month>12||date<1||date>datePermonth[month-1]){
			System.out.println("잘못된 날짜 입력입니다. 다시 입력해주세요");
			check = true;
		}
		else if (month==4&&date<18){
			System.out.println("잘못된 날짜 입력입니다. 다시 입력해주세요");
			check = true;
		}
		else{
			check = false;
		}
		return check;
	}
	
	public void dateOp(){
		for(int i =0;i<month-1;i++){
			resultdate = resultdate +datePermonth[i];
		}
		resultdate = resultdate+date-109;
	}
	
	public void date_yoil(){
		int remain = (resultdate+109)%7;
		switch(remain){
		case 0: whatYoil = yoil[0];
			break;
		case 1: whatYoil = yoil[1];
			break;
		case 2: whatYoil = yoil[2];
			break;
		case 3: whatYoil = yoil[3];
			break;
		case 4: whatYoil = yoil[4];
			break;
		case 5: whatYoil = yoil[5];
			break;
		case 6: whatYoil = yoil[6];
			break;
		}
	}
	
	public void setdate(int date){
		this.date = date;
	}
	public void setmonth(int month){
		this.month = month;
	}
	
	public String getwhatYoil(){
		return whatYoil;
	}
	public int getresultdate(){
		return resultdate;
	}
}
