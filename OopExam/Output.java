package exam1;

public class Output {
	private int resultdate;
	private String whatYoil;
	
	public void print(){
		System.out.println("4월 18일로부터" + resultdate+"일 지났습니다.");
		System.out.println(whatYoil+"입니다");
	}
	
	public void setresultdate(int resultdate){
		this.resultdate = resultdate;
	}
	public void setwhatYoil(String whatYoil){
		this.whatYoil = whatYoil;
	}
}
