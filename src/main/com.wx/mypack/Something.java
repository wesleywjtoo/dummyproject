public class Something{

    public void pt(String msg){
        System.out.println(msg);
    }

    public void dumbCalc(int x){
        int rs = x * 2;
        pt("The Result: "+rs);
    }

    public void checkerStr(String str){
        String str = null;
        if(str.equals("Hi")){
            pt("String is Hi");
        }
    }
}