package exam1;

public class Main {
    Input input;
    DateOperation dateOperation;
    Output output;

    public Main(){
        input = new Input();
        dateOperation = new DateOperation();
        output = new Output();
    }

    public void control(){
        do {
            input.inDate();

            dateOperation.setdate(input.getdate());
            dateOperation.setmonth(input.getmonth());
        }while (dateOperation.except());

        dateOperation.dateOp();
        dateOperation.date_yoil();

        output.setresultdate(dateOperation.getresultdate());
        output.setwhatYoil(dateOperation.getwhatYoil());

        output.print();
    }
    public static void main(String[] args){
        Main main = new Main();
        main.control();
    }
}