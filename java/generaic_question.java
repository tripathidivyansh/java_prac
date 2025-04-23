
class Generic<t>{
    private t value;

    public void setvalue(t value){
        this.value = value;
    }
    public t getvalue(){
        return value;
    }
}
public class generaic_question {
    public static void main(String[] args) {
       Generic<Integer> g1 = new Generic<>();
        g1.setvalue(70);
        // g1.getvalue();
        System.out.println("I can run at  " + g1.getvalue()+ " km/h" );

        Generic<String>g2 = new Generic<>();
        g2.setvalue("Lion");

        System.out.println("I am " +  g2.getvalue());
    }
}
