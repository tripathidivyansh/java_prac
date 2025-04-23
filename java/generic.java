
class Generic<t>{
    private t value;

    public void setvalue(t value){
        this.value = value;
    }
    public t getvalue(){
        return value;
    }
}

public class generic {
    public static void main(String[] args) {
        Generic<Integer> obj = new Generic<>();

        obj.setvalue( 07);
        System.out.println(obj.getvalue());

        Generic<String> obj1 = new  Generic<>();
        obj1.setvalue("malik");
        obj1.getvalue();

    }
}