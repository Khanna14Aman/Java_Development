package HiberNateDemo;

public class Main{
    public static void main(String [] args){
        Student st = new Student();
        System.out.println(st);
        st.setSid(1);
        st.setName("Hello");
        st.setAge(12);

        System.out.println(st);
    }
}