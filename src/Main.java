public class Main{
    public static void main(String[] args) {
        try{
            String str1 = null;
            System.out.print(str1.length());
        } catch (NullPointerException s ) { 
            System.out.print("例外(NullPointerException)が発生しました。\n");
            System.out.println(s);
            System.out.println("getMessageの出力結果\n" + s.getMessage());
        }        
    }
} 