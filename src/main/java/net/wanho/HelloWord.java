package net.wanho;

/**
 * Created by Administrator on 2019/5/27.
 */
public class HelloWord {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void hello(){
        System.out.println("hello:"+ name);
    }
}
