

class Generic<t extends Number>{
    
    private t value;

    public void setvalue(t value){
        this.value = value;
    }
    public t getvalue(){
        return value;
    }
}

public class bounded_type {
    public static void main(String[] args) {
        Generic<Integer> obj = new Generic<>();
        obj.setvalue(7);
        
        System.out.println(obj.getvalue());
    }
}
